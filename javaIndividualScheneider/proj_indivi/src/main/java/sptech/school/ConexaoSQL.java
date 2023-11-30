package sptech.school;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoSQL {
    private JdbcTemplate conexaoDoBanco;

    public ConexaoSQL() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://44.218.55.108:1433;databaseName=scriptgct;encrypt=false;user=sa;password=urubu100");
        dataSource.setUsername("sa");
        dataSource.setPassword("urubu100");
        this.conexaoDoBanco = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConnection() {
        return conexaoDoBanco;
    }
}
