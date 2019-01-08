package com.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.Dao.RoomDao;
import com.Pojo.Room;
import com.Web.MyRowMapper;

@Service
public class RoomDaoImpl implements RoomDao {
	@Autowired
	private JdbcTemplate JdbcTemplate;

	@Override
	public List<Room> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from room";
		List<Room> roomlist = JdbcTemplate.query(sql, new MyRowMapper());
		return roomlist;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from room where Room_id=?";
		return JdbcTemplate.update(sql, id);
	}

	@Override
	public Room findById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from room where Room_id=?";
		Room room = JdbcTemplate.queryForObject(sql, new MyRowMapper(), id);
		return room;
	}

	@Override
	public int insert(int roomNumber, int adultsCapacity,
			int childrenCapacity, double price) {
		// TODO Auto-generated method stub
		String sql = "insert into room (RoomNumber,AdultsCapacity,ChildrenCapacity,Price) values (?,?,?,?)";
		return JdbcTemplate.update(sql,roomNumber,adultsCapacity,childrenCapacity,price);
		
	}

	@Override
	public int update(int id, int roomNumber, int adultsCapacity,
			int childrenCapacity, double price) {
		// TODO Auto-generated method stub
		String sql = "update  room set  RoomNumber=?,AdultsCapacity=?,ChildrenCapacity=?,Price=? where Room_id=?";
		return JdbcTemplate.update(sql, roomNumber, adultsCapacity,
				childrenCapacity, price, id);
	}

}
