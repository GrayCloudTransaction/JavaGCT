package sptech.school;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Conexao conexao = new Conexao();
        Menu menu = new Menu(conexao);

        menu.Menu1();
    }
}