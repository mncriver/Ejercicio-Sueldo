import java.util.Scanner;

public class Principal {

	private static Scanner scan = new Scanner(System.in); //debido a que el scanner se usa en varios metodos
		
	public static void main(String[] args) {
		int i=0;
		
		String opcion = new String();
		Scanner teclado = new Scanner(System.in);
		Empleado[] empleados = new Empleado[20];
		//testeo el git		
		// Hago el do while para que cargue empleados hasta que se desee
		
		do{
			Empleado emp;
			System.out.println("Que tipo de empleado desea cargar?(a/v)");
			opcion =teclado.nextLine();
			
			if (opcion.equals("a")) 
		{
			Administrativo adm = new Administrativo();   //  creo un administrativo si se eligio Administrativo
			cargaDatosAdministrativo(adm);
			empleados[i]=adm;
			i++;
		}
			else if (opcion.equals("v"))
		{
			Vendedor ven = new Vendedor(); 					// en este caso creo un vendedor por si no eligio Administrativo 
			cargaDatosVendedor(ven);
			empleados[i]=ven;
			i++;
		} 
			else
				
			{System.out.println("Esa opcion no es correcta");}
		
		System.out.print("Desea ingresar otro empleado? (s/n)");
		opcion=teclado.nextLine();
		} while (opcion.equals("s"));						// si la opccion es n corta y muestro 
	
		muestraEmpleados(empleados, i);                      // luego de llenar el arreglo lo muestro con este metodo
		
		teclado.close();
			
	}
	
	
	
	
		public static void cargaDatosVendedor(Vendedor ven){
			cargaDatosEmpleado(ven);
			
			System.out.println("Porcentaje comision:");
			ven.setPorcenComision(scan.nextDouble());
			System.out.println("Total de ventas:");
			ven.setTotalVtas(scan.nextDouble());
		}	
		
		public static void cargaDatosAdministrativo(Administrativo adm){
			cargaDatosEmpleado(adm);
			
			System.out.println("Horas Extras: ");
			adm.setHs_extras(scan.nextDouble());
		    System.out.println("Hora mes");
		    adm.setHs_mes(scan.nextDouble());
		}	
		
		public static void cargaDatosEmpleado(Empleado emp){
			
			
			System.out.println("DNI: ");
			emp.setDni(scan.nextLine());
			System.out.println("Nombre: ");
			emp.setNombre(scan.nextLine());
			System.out.println("Sueldo Base: ");
			emp.setSueldo_base(scan.nextDouble());
		}
		
		private static void muestraEmpleados(Empleado[]empleados, int c){
			for(int i=0;i<c;i++){
				System.out.println("Empleado nro:" +(i+1));
				System.out.println("DNI: "+empleados[i].getDni());
				System.out.println("Nombre: "+empleados[i].getNombre());
				System.out.println("Sueldo: "+empleados[i].getSueldo());
				
		}
		
	}

}
