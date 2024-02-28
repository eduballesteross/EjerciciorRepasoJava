package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.ClienteDto;

public class MenuImplementacion implements MenuInterfaz {
	
	List<ClienteDto> listaClientes = new ArrayList<>();
	ClienteInterfaz clienteI = new ClienteImplementacion();
	EmpleadoInterfaz empleadoI = new EmpleadoImplementacion();
	Scanner sc = new Scanner(System.in);

	@Override
	public int MostrarMenuPrincipal() {
		// TODO Auto-generated method stub

		int opcion;

		System.out.println("###################");
		System.out.println("0- Cerrar Menu     ");
		System.out.println("1- Versión cliente");
		System.out.println("2- Versión empleado ");
		System.out.println("###################");
		opcion = sc.nextInt();

		return opcion;
	}

	private int MenuCliente() {
		int opcion;

		System.out.println("###################");
		System.out.println("0- Menu Principal");
		System.out.println("1- Registro Cliente");
		System.out.println("2- Acceso Cliente  ");
		System.out.println("###################");
		opcion = sc.nextInt();

		return opcion;

	}
	private int MenuEmpleado() {
		int opcion;

		System.out.println("###################");
		System.out.println("0- Menu Principal  ");
		System.out.println("1- Validar Cliente ");
		System.out.println("2- Borrado Cliente ");
		System.out.println("3- Listado Cliente ");
		System.out.println("###################");
		opcion = sc.nextInt();

		return opcion;

	}

	@Override
	public int AccesoVersionCliente() {
		// TODO Auto-generated method stub
		
		int opcion;
		boolean cerrarMenu = false;

		do {
			System.out.println("MENÚ CLIENTE");
			opcion = MenuCliente();

			switch (opcion) {

			case 0:
				System.out.println("Se cierra la aplicación");
				cerrarMenu = true;
				break;

			case 1:
				System.out.println("Registro Cliente");
				clienteI.RegistroCliente(listaClientes);
				break;

			case 2:
				System.out.println("Acceso Cliente");
				clienteI.InicioSesionClientes(listaClientes);
				break;

			default:
				System.out.println("Eliga una opción válida");

			}

		} while (!cerrarMenu);

		return opcion;
	}

	@Override
	public int AccesoVersionEmpleado() {
		// TODO Auto-generated method stub
		int opcion;
		boolean cerrarMenu = false;

		do {
			System.out.println("MENÚ EMPLEADO");
			opcion = MenuEmpleado();

			switch (opcion) {

			case 0:
				System.out.println("Se cierra la aplicación");
				cerrarMenu = true;
				break;

			case 1:
				System.out.println("Validar Cliente");
				empleadoI.ValidarCliente(listaClientes);
				break;

			case 2:
				System.out.println("Borrado Cliente");
				empleadoI.BorrarCliente(listaClientes);
				break;
				
			case 3:
				System.out.println("Mostrar Cliente");
				empleadoI.MostrarCliente(listaClientes);
				break;

			default:
				System.out.println("Eliga una opción válida");

			}

		} while (!cerrarMenu);

		return opcion;
	}

}
