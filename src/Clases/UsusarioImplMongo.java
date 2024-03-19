package Clases;
import Interfaces.IUsuario;

public class UsusarioImplMongo implements IUsuario {

	@Override
	public void getInsertaUsusario() {
		System.out.println("Insertando usuario con Mongo");
	}

	@Override
	public void getEliminaUsuarioByID(int id) {
		System.out.println("Eliminando usuario con Mongo :" + id);	
	}
}
