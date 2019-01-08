package com.Web;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Pojo.Room;

public class MyRowMapper implements RowMapper<Room> {

	@Override
	public Room mapRow(ResultSet resultSet, int i) throws SQLException {
		// TODO Auto-generated method stub
		int id = resultSet.getInt("Room_id");
		int roomNumber = resultSet.getInt("RoomNumber");
		int adultsCapacity = resultSet.getInt("AdultsCapacity");
		int childrenCapacity = resultSet.getInt("ChildrenCapacity");
		double price = resultSet.getDouble("Price");
		Room room = new Room();
		room.setId(id);
		room.setRoomNumber(roomNumber);
		room.setAdultsCapacity(adultsCapacity);
		room.setChildrenCapacity(childrenCapacity);
		room.setPrice(price);
		return room;
	}

}
