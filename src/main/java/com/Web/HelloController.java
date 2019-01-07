package com.Web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping("/hello")
	public String index() {
		return "Hello SpringBoot World";
	}

	@RequestMapping("/insert")
	public String insert() {
		jdbcTemplate.execute("insert into room(Room_id,RoomNumber,AdultsCapacity,ChildrenCapacity,Price)"
						+ "values('11','305','6','0','260.00')");
		return "Insert is Successfully";
	}

}
