package sptech.school;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BaseQuery {
    private JdbcTemplate connection = new JdbcTemplate();
    public BaseQuery(JdbcTemplate connection){
        this.connection = connection;
    }

    public List<Funcionario> buscarFuncionario(String nome, String senha){
        String sql = String.format("SELECT * FROM funcionario WHERE nome = '%s' and senha = '%s'", nome, senha);
        return connection.query(sql, new BeanPropertyRowMapper<>(Funcionario.class));
    }

    public List<Servidor> buscarServidor(Integer fk_empresa){
        String sql = String.format("SELECT * FROM servidor WHERE fk_empresa = '%s'", fk_empresa);
        return connection.query(sql, new BeanPropertyRowMapper<>(Servidor.class));
    }

    public List<Componente> buscarComponentes(String codigo){
        String sql = String.format("SELECT componente.* FROM componente, servidor WHERE codigo = '%s'", codigo);
        return connection.query(sql, new BeanPropertyRowMapper<>(Componente.class));
    }

    public void cadastrar(Registro registro){
        connection.update("INSERT INTO registro (valor_registro, data_registro, fk_componente, fk_medida) " +
                "VALUES (?, ?, ?, ?)", registro.getValor_registro(), registro.getData_registro(), registro.getFk_componente(), registro.getFk_medida());
    }


    //public void cadastrar(Livro livro){
    //    connection.update("INSERT INTO livraria (nome, preco) VALUES (?, ?)", livro.getNome(), livro.getPreco());
    //}

    //public List<Livro> selectTodos(){
    //    return connection.query("SELECT * FROM livraria", new BeanPropertyRowMapper<>(Livro.class));
    //}

    //public void atualizar(Integer id, String nome, Double preco){
    //    connection.update("UPDATE livraria SET nome = ?, preco = ? WHERE id = ?", nome, preco, id);
    //}

    //public void remover(Integer id){
    //    connection.update("DELETE FROM livraria WHERE id = ?", id);
    //}

    //public List<Livro> buscarNome(String nome){
    //    return connection.query("SELECT * FROM livraria WHERE nome = '?'", new BeanPropertyRowMapper<>(Livro.class), nome);
    //}

    //public void apagarTabela() {
    //    connection.execute("DROP TABLE livraria IF EXISTS;");
    //}

}
