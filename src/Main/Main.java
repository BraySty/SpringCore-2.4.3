package Main;
import Clases.Avion;
import Clases.Helice;
import Clases.Turbina;

public class Main {

	public static void main(String[] args) {
		
												// Injeccion de dependencias
		Avion obj1 = new Avion(new Helice());
		System.out.println(obj1.getMotor());
		System.out.println(obj1.getPotencia(270));
		
												// Injeccion de dependencias
		Avion obj2 = new Avion(new Turbina());
		System.out.println(obj2.getMotor());
		System.out.println(obj2.getPotencia(540));
		
	}
	
}
