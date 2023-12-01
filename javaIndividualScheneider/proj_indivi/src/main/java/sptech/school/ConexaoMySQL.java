package sptech.school;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoMySQL {
    private JdbcTemplate conexaoDoBanco;

    public ConexaoMySQL() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://54.161.108.235:3306/%s".formatted("ScriptGCT"));
        dataSource.setUsername("root");
        dataSource.setPassword("urubu100");
        this.conexaoDoBanco = new JdbcTemplate(dataSource);
    }
    public JdbcTemplate getConnection() {
        return conexaoDoBanco;
    }
}