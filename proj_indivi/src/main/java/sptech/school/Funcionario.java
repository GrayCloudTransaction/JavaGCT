package sptech.school;

public class Funcionario {
    private Integer id_funcionario;
    private String nome;
    private String email;
    private String senha;
    private String cargo;
    private String cpf;
    private Integer permissao;
    private Integer fk_gerente;
    private Integer fk_empresa;

    public Funcionario() {
    }

    public Funcionario(Integer id_funcionario, String nome, String email, String senha, String cargo, String cpf, Integer permissao, Integer fk_gerente, Integer fk_empresa) {
        this.id_funcionario = id_funcionario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cargo = cargo;
        this.cpf = cpf;
        this.permissao = permissao;
        this.fk_gerente = fk_gerente;
        this.fk_empresa = fk_empresa;
    }

    public Integer getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Integer id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getPermissao() {
        return permissao;
    }

    public void setPermissao(Integer permissao) {
        this.permissao = permissao;
    }

    public Integer getFk_gerente() {
        return fk_gerente;
    }

    public void setFk_gerente(Integer fk_gerente) {
        this.fk_gerente = fk_gerente;
    }

    public Integer getFk_empresa() {
        return fk_empresa;
    }

    public void setFk_empresa(Integer fk_empresa) {
        this.fk_empresa = fk_empresa;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id_funcionario=" + id_funcionario +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", cargo='" + cargo + '\'' +
                ", cpf='" + cpf + '\'' +
                ", permissao=" + permissao +
                ", fk_gerente=" + fk_gerente +
                ", fk_empresa=" + fk_empresa +
                '}';
    }


}
