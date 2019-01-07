package com.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		
		if(roomlist.size()>0) {
			System.out.println("查询用户信息成功");
		}
		request.setAttribute("roomlist", roomlist);
		return "list";
	}
	@RequestMapping("/findById")
	public String findById(HttpServletRequest request,@RequestParam("id")int id){
		System.out.println("根据用户ID查询用户信息");
		Room room = roomDao.findById(id);
		if(room!=null){
			System.out.println("查询用户成功");
			request.setAttribute("room", room);
			request.setAttribute("message", "查询");
			return "details";
		}else {
			System.out.println("查询用户失败");
			return "error";
		}
		
		
	}

}
