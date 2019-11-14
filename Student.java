package pack2;

public class Student {
	
	private int id;
	private String name;
	private int room;

	public Student(int id, String name, int room) {
		super();
		this.id = id;
		this.name = name;
		this.room = room;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", room=" + room + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}

}
