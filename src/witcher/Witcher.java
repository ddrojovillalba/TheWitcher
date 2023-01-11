package witcher;

public class Witcher {

	private String name;
	private int health;
	private boolean hasSoul;
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public boolean isHasSoul() {
		return hasSoul;
	}


	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}
	
	public boolean isDead() {
		if(health==0) {
			return true;
		}else if(!hasSoul){
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Witcher brujo = new Witcher();
		brujo.setName("Geralt de Rivia");
		brujo.setHealth(15);
		brujo.setHasSoul(true);
		if(brujo.isDead())
			System.out.println(brujo.getName() + " está muerto");
		else {
			System.out.println(brujo.getName() + " está vivo");
		}
	}

}
