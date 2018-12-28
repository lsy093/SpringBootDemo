package com.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.Dao.RoomDao;
import com.Pojo.Room;
import com.Web.MyRowMapper;


@Service
public class RoomDaoImpl implements RoomDao{
	@Autowired
    private JdbcTemplate JdbcTemplate;
	
	@Override
	public List<Room> findAll() {
		// TODO Auto-generated method stub
		String sql="select * from room";
		List<Room> roomlist = JdbcTemplate.query(sql, new MyRowMapper());
		return roomlist;
	}

	@Override
	public void delete(int userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(String userName, int userAge, String userSex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String userName, int userAge, String userSex, int userId) {
		// TODO Auto-generated method stub
		
	}

}
