package com.Web;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Pojo.Room;

public class MyRowMapper implements RowMapper<Room> {

	@Override
	public Room mapRow(ResultSet resultSet, int i) throws SQLException {
		// TODO Auto-generated method stub
		int Room_id = resultSet.getInt("Room_id");
		int RoomNumber = resultSet.getInt("RoomNumber");
		int AdultsCapacity = resultSet.getInt("AdultsCapacity");
		int ChildrenCapacity = resultSet.getInt("ChildrenCapacity");
		double Price = resultSet.getDouble("Price");
		Room room = new Room();
		room.setId(Room_id);
		room.setRoomNumber(RoomNumber);
		room.setChildrenCapacity(ChildrenCapacity);
		room.setAdultsCapacity(AdultsCapacity);
		room.setPrice(Price);
		return room;
	}

}
