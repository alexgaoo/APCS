package cow;

public class Cow implements Comparable {
	private int weight;
	private String name;

	public Cow() {
		this.weight = 1800;
		this.name = "Anonymous cow";
	}
	
	public Cow(int weight, String name) {
		
		this.weight = weight;
		this.name = name;
		
	}
	
	public String toString() {
		return name;
	}

	public int compareTo(Cow cow) {
		// TODO Auto-generated method stub
		if(this.weight > cow.weight) {
			return 1;
		}
		else if()
	}
	
	
	
	
	
}
