package Web;


import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
//需要添加@SpringBootApplication注解
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
		List<Map<String, Object>> result = jdbcTemplate.queryForList("SELECT * FROM ROOM");
		System.out.println(result);
	}

}
