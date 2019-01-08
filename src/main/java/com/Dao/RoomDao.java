package com.Dao;

import java.util.List;

import com.Pojo.Room;

public interface RoomDao {

	public int delete(int id);

	public Room findById(int id);

	public List<Room> findAll();;

	public int insert(int roomNumber, int adultsCapacity,
			int childrenCapacity, double price);

	public int update(int id, int roomNumber, int adultsCapacity,
			int childrenCapacity, double price);

}
