package sptech.school;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.processos.Processo;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.*;

public class Menu {
    private BaseQuery base;
    private Scanner leitor;
    private List<Funcionario> funcionarios;
    private List<Servidor> servidores;
    private List<Componente> componentes;
    private Looca lucas;

    public Menu(Conexao conexao) {
        this.base = new BaseQuery(conexao.getConnection());
        this.leitor = new Scanner(System.in);
        funcionarios = new ArrayList<>();
        servidores = new ArrayList<>();
        componentes = new ArrayList<>();
        lucas = new Looca();
    }

    public void Menu1() throws InterruptedException {
        while (true){
            System.out.println("Olá! faça login por favor");
            System.out.println("Nome:");
            String nome = this.leitor.nextLine();
            System.out.println("Senha:");
            String senha = this.leitor.nextLine();

            this.funcionarios = base.buscarFuncionario(nome, senha);
            if(funcionarios.size() == 1){
                this.servidores = base.buscarServidor(funcionarios.get(0).getFk_empresa());

                System.out.println("Bom dia! " + funcionarios.get(0).getNome());
                System.out.println("Qual servidor vamos pegar dados hoje?");
                for (Servidor servidor:servidores) {
                    System.out.println(servidor.getCodigo());
                }
                while (true) {
                    String codigoServidor = leitor.nextLine();

                    this.componentes = base.buscarComponentes(codigoServidor);

                    if (!componentes.isEmpty()) {
                        System.out.println("Iniciando captura de dados:");
                        while(true) {
                            for (Componente componente : componentes) {
                                if (componente.getTipo_componente().equalsIgnoreCase("CPU")) {
                                    Registro registro = new Registro(Math.round(lucas.getProcessador().getUso()), componente.getId_componente(), 1);
                                    base.cadastrar(registro);
                                } else if (componente.getTipo_componente().equalsIgnoreCase("RAM")) {
                                    Registro registro = new Registro((lucas.getMemoria().getEmUso() * 100)/this.lucas.getMemoria().getTotal(), componente.getId_componente(), 1);
                                    base.cadastrar(registro);
                                } else {
                                    Registro registro = new Registro(((lucas.getGrupoDeDiscos().getVolumes().get(0).getTotal()-lucas.getGrupoDeDiscos().getVolumes().get(0).getDisponivel()) * 100)/lucas.getGrupoDeDiscos().getVolumes().get(0).getTotal(), componente.getId_componente(), 1);
                                    base.cadastrar(registro);
                                }
                            }
                            System.out.println( " CPU:" +
                                                Math.round(lucas.getProcessador().getUso()) +
                                                " RAM: " +
                                                (lucas.getMemoria().getEmUso() * 100)/this.lucas.getMemoria().getTotal() +
                                                " Disco: " +
                                                lucas.getGrupoDeDiscos().getVolumes().get(0).getTotal()
                                    );
                            Thread.sleep(2000);
                        }
                    }
                    else{
                        System.out.println("Escreva o código certo!");
                    }
                    break;
                }
                break;
            }
            break;
        }
    }

}
