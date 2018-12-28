package com.Dao;

import java.util.List;

import com.Pojo.Room;

public interface RoomDao {

	public void delete(int userId);
	public void findById(int id);
	public List<Room> findAll();;
	public void create(String userName,int userAge,String userSex);
	public void update(String userName, int userAge, String userSex, int userId);

}
