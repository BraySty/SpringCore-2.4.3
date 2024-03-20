package Clases;

import Interfaces.IUsuario;

public class UsusarioFactory {
	
	IUsuario usr;
	
	public UsusarioFactory(IUsuario usr) {
		super();
		this.usr = usr;
	}

	public void getInsertaUsusario() {
		usr.getInsertaUsusario();
	}
	
	public void getEliminaUsuarioByID(int id) {
		usr.getEliminaUsuarioByID(id);
	}
	
}
