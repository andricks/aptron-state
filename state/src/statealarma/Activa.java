package statealarma;

public class Activa implements estado {
	@Override
public void ejecutarAccion(){
		System.out.println("Estado activo ");
}
}
