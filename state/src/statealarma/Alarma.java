package statealarma;

public class Alarma {
	
private  estado miestado;


public void setestado(estado e) {
	this.miestado=e;
}

public  void ejecutar() {
	miestado.ejecutarAccion();
	}
}
	
	

