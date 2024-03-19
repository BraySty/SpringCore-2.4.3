package Main;
import Clases.UsusarioFactory;
import Clases.UsusarioImplOracle;

public class app {

	public static void main(String[] args) {
		// Injeccion de dependencias
		UsusarioFactory obj = new UsusarioFactory(new UsusarioImplOracle());
		obj.getInsertaUsusario();
		obj.getEliminaUsuarioByID(1);
	}
	
}
