package sptech.school;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class BaseQuerySQL {
    private JdbcTemplate connection = new JdbcTemplate();

    public BaseQuerySQL(JdbcTemplate connection) {
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
}
