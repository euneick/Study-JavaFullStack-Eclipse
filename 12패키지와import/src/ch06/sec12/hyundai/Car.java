package ch06.sec12.hyundai;

//import ch06.sec12.hankook.Tire;
//import ch06.sec12.hankook.SnowTire;
import ch06.sec12.hankook.*;
import ch06.sec12.kumho.*;

public class Car {

	public static void main(String[] args) {
		
//		Tire tire = new Tire();
		ch06.sec12.hankook.Tire hankookTire = new ch06.sec12.hankook.Tire();
		ch06.sec12.kumho.Tire kumhoTire = new ch06.sec12.kumho.Tire();
		
		SnowTire snowTire = new SnowTire();
		
		AllSeasonTire seasonTire = new AllSeasonTire();
	}

}
