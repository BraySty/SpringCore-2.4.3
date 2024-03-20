package Main;
import Clases.UsusarioFactory;
import Clases.UsusarioImplMongo;
import Clases.UsusarioImplOracle;

public class app {

	public static void main(String[] args) {
		
												// Injeccion de dependencias
		UsusarioFactory obj1 = new UsusarioFactory(new UsusarioImplOracle());
		obj1.getInsertaUsusario();
		obj1.getEliminaUsuarioByID(1);
		
												// Injeccion de dependencias
		UsusarioFactory obj2 = new UsusarioFactory(new UsusarioImplMongo());
		obj2.getInsertaUsusario();
		obj2.getEliminaUsuarioByID(1);
		
	}
	
}
