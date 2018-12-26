package Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Pojo.User;

@RestController
public class HelloController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/hello")
	public String index() {
		return "Hello SpringBoot World";
	}

	@RequestMapping("/getUser")
	public User getUser() {
		// 直接获取界面会直接返回 {"id":2,"name":"李四"}
		User user = new User();
		user.setId(2);
		user.setName("李四");
		return user;
	}

	@RequestMapping("/insert")
	public String insert() {
		jdbcTemplate
				.execute("insert into room(Room_id,RoomNumber,AdultsCapacity,ChildrenCapacity,Price)"
						+ "values('11','305','6','0','260.00')");
		return "Insert is Successfully";
	}

}
