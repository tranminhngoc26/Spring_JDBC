package mainapp;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertRow {

  public static void main(String[] args) throws SQLException{
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    String sql = "INSERT INTO user_info (name, address) VALUES (?, ?);";
    jdbcTemplate.update(sql, "Harry Potter", "England");
  }
}
