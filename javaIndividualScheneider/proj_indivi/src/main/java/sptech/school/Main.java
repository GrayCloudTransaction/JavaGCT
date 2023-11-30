package sptech.school;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConexaoMySQL conexaoMySQL = new ConexaoMySQL();
        ConexaoSQL conexaoSQL = new ConexaoSQL();

        Menu menu = new Menu(conexaoMySQL, conexaoSQL);

        menu.Menu1();
    }
}