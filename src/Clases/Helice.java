package clases;

import interfaces.TiposMotor;

public class Helice implements TiposMotor{

	@Override
	public String getTipo() {
		return "Helice";
	}

	@Override
	public String getPotencia(int potencia) {
		return potencia + " kn";
	}

}
