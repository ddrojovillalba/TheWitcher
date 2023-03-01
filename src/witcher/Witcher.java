package witcher;


/**
 * Clase que representa un brujo con tres atributos, name, health y hasSoul.
 * Esta clase se usará para un videojuego RPG.´
 * 
 * @author DavidR.
 * @version 1.0
 * 
 *
 */
public class Witcher {
	/**
	 * Atributo name que es el nombre del brujo.
	 */
	private String name;
	
	// Vida del brujo.
	private int health;
	
	//Si el brujo tiene o no alma.
	private boolean hasSoul;
	
	
	/**
	 * Getter para obtener el nombre del brujo.
	 * @return Devuelve el nombre del brujo.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter para introducir el nombre del brujo.
	 * @param name Nombre del brujo.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter para obtener la cantidad de vida del brujo.
	 * @return Devuelve el número de vidas que le quedan al brujo.
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Settter para establecer la vida del brujo.
	 * @param health Cantidad de vida del brujo.
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * Función para saber si el brujo tiene alma.
	 * @return Devuelve si el brujo tiene alma o no.
	 */
	public boolean isHasSoul() {
		return hasSoul;
	}

	/**
	 * Setter para establecer el ama del brujo.
	 * @param hasSoul Valor booleano si el brujo tiene o no alma.
	 */
	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}
	
	/*
	 * Nos dice si el brujo está o no muerto:
	 * <ul>
	 * <li>si no tiene vida,</li>
	 * <li>si tiene vida pero no tiene alma.</li>
	 * @return Si está o no muerto.
	 * </ul>
	 */
	public boolean isDead() {
		if(health==0) {
			return true;
		}else if(!hasSoul){
			return true;
		}else {
			return false;
		}
	}
	
	public void aumentarVida() {
		health+=1;
	}
}
