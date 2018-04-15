package mainapp;

import java.sql.SQLException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateTable {

  public static void main(String[] args) throws SQLException{
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    /* -------------- Create table user_info ----------------- */
    String sql = "CREATE TABLE user_info (" +
        "  id int(11) NOT NULL AUTO_INCREMENT," +
        "  name varchar(45) DEFAULT NULL," +
        "  address varchar(255) DEFAULT NULL," +
        "  PRIMARY KEY (id)" +
        ")";
    jdbcTemplate.execute(sql);
    ((ClassPathXmlApplicationContext)context).close();
     System.out.println("Table is Created!");
  }
}
