
public class Principal {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
	
			System.out.println("Bienvenido");
			System.out.println("Digite el número correspondiente a el salario : ");
			System.out.println("1. Desarrollador Backend");
			System.out.println("2. Desarrollador Frontend");
			System.out.println("");
			
			System.out.println("Digite una de las opciones anteriores:s");
			char input = sc.next().charAt(0);
			
			
			switch (input) {
			
			case '1': DesarrolladorBackend b = new DesarrolladorBackend();
			System.out.println(b.devolverSalario());
				break;
		
			case '2': DesarrolladorFrontend f = new DesarrolladorFrontend();
			System.out.println(f.devolverSalario());
			break;
			
			
			default: System.out.println("Digita la opcion correcta");
				break;
			}
			
		}

}
