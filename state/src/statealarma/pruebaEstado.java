package statealarma;
import java.util.Scanner;

public class pruebaEstado  {
	public static void main(String...args){
		
		Alarma  alarma = new Alarma();
	    Activa  activa= new Activa();
		mantenimenito mantenimineto = new mantenimenito();
		int opcion = 0 ;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
	
	
	do {
		menu();
		opcion =sc.nextInt();
		switch(opcion){
			case 1 :
				alarma.setestado(activa);
				break;
			case 2:
				alarma.setestado(mantenimineto);
				break;
			case 0 :
				System.exit(0);
				default:
					System.out.println("opcion cerrada");
		}
		alarma.ejecutar();
	  }while(opcion!=0);	
	}			
		

	private static void menu() {
		// TODO Auto-generated method stub
		StringBuffer menus =new StringBuffer();
		menus.append("******* \n");
	    menus.append("***seleccion estado de alarma *** \n");
	    		menus.append("*1 - Activa. 2 - mantenimiento 0 - salir \n");
	    		menus.append("******* \n");
	    		System.out.println(menus.toString());		

		
	}
	
}

