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

		if (roomlist.size() > 0) {
			System.out.println("查询用户信息成功");
		}
		request.setAttribute("roomlist", roomlist);
		return "list";
	}

	@RequestMapping("/findById")
	public String findById(HttpServletRequest request,
			@RequestParam("id") int id) {
		System.out.println("根据用户ID查询用户信息");
		Room room = roomDao.findById(id);
		if (room != null) {
			System.out.println("查询用户成功");
			request.setAttribute("room", room);
			request.setAttribute("message", "查询");
			return "details";
		} else {
			System.out.println("查询用户失败");
			return "error";
		}

	}

	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("id") int id) {
		int result = roomDao.delete(id);
		if (result == 1) {
			System.out.println("根据用户ID删除成功");
			request.setAttribute("message", "删除");
			return "success";

		} else {
			return "error";
		}

	}

	@RequestMapping("/toUpdate")
	public String toUpdate(HttpServletRequest request,
			@RequestParam("id") int id,
			@RequestParam("roomNumber") int roomNumber,
			@RequestParam("adultsCapacity") int adultsCapacity,
			@RequestParam("childrenCapacity") int childrenCapacity,
			@RequestParam("price") double price) {

		// 保存用户信息，传递到更新页面
		request.setAttribute("id", id);
		request.setAttribute("roomNumber", roomNumber);
		request.setAttribute("adultsCapacity", adultsCapacity);
		request.setAttribute("childrenCapacity", childrenCapacity);
		request.setAttribute("price", price);
		return "update";

	}

	@RequestMapping("/update")
	public String update(HttpServletRequest request, Room room) {
		int result = roomDao.update(room.getId(), room.getRoomNumber(),
				room.getAdultsCapacity(), room.getChildrenCapacity(),
				room.getPrice());
		
		if (result == 1) {
			System.out.println("修改用户成功");
			request.setAttribute("message", "修改");
			return "success";

		} else {
			System.out.println("修改用户失败");
			return "error";
		}
		
	}
	@RequestMapping("/insert")
	public String insert() {
		System.out.println("转页面");
		return "insert";
	}
	
	@RequestMapping("/create")
	public String create(HttpServletRequest request, Room room) {
		int result = roomDao.insert(room.getRoomNumber(),
				room.getAdultsCapacity(), room.getChildrenCapacity(),
				room.getPrice());
		
		if (result == 1) {
			System.out.println("创建用户成功");
			request.setAttribute("message", "创建");
			return "success";

		} else {
			System.out.println("创建用户失败");
			return "error";
		}


	}

}
