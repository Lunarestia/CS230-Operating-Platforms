package gamingroom;

class Entity {	
	long id;
	String name;
	
	public Entity() {
		this.id = 0;
		this.name = "";
	}
	
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Entity test = new Entity(02,"Testing Penguins");
		System.out.println(test);
		
		Entity game = new Game(04,"March of the Penguins");
		System.out.println(game);
		
		Entity player = new Player(06, "Luna Saccoia");
		System.out.println(player);

	}

}
