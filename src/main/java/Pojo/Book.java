package Pojo;

public class Book {
	private int id;
	private int RoomNumber;
	private int AdultsCapacity;
	private int ChildrenCapacity;
	private double Price;
	
	public Book(){
		
	}
	
	public Book(int id, int roomNumber, int adultsCapacity, int childrenCapacity, double price) {
		this.id = id;
		this.RoomNumber = roomNumber;
		this.AdultsCapacity = adultsCapacity;
		this.ChildrenCapacity = childrenCapacity;
		this.Price = price;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoomNumber() {
		return RoomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		RoomNumber = roomNumber;
	}
	public int getAdultsCapacity() {
		return AdultsCapacity;
	}
	public void setAdultsCapacity(int adultsCapacity) {
		AdultsCapacity = adultsCapacity;
	}
	public int getChildrenCapacity() {
		return ChildrenCapacity;
	}
	public void setChildrenCapacity(int childrenCapacity) {
		ChildrenCapacity = childrenCapacity;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	
	
}
