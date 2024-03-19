package Clases;
import Interfaces.IUsuario;

public class UsusarioImplOracle implements IUsuario {

	@Override
	public void getInsertaUsusario() {
		System.out.println("Insertando usuario con Oracle");
	}

	@Override
	public void getEliminaUsuarioByID(int id) {
		System.out.println("Eliminando usuario con Oracle :" + id);	
	}

}
