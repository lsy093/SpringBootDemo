package com.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dao.RoomDao;
import com.Pojo.Room;



@Controller
@RequestMapping("/rooms")
public class BookController {
	@Autowired
	private RoomDao roomDao;
	
	@RequestMapping("/findAll")
	public String findAll(HttpServletRequest request) {
		System.out.println("查询所有用户信息");
		List<Room> roomlist = roomDao.findAll();
		for (int i = 0; i < roomlist.size(); i++) {
			System.out.println(roomlist.get(i));
		}
		if(roomlist.size()>0) {
			System.out.println("查询用户信息成功");
		}
		request.setAttribute("roomlist", roomlist);
		return "list";
	}

}
