package Controladores;

import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		MenuInterfaz menuI = new MenuImplementacion();

		int opcion;
		boolean cerrarMenu = false;

		do {
			System.out.println("MENÚ INICIAL");
			opcion = menuI.MostrarMenuPrincipal();

			switch (opcion) {

			case 0:
				System.out.println("Se cierra la aplicación");
				cerrarMenu = true;
				break;

			case 1:
				System.out.println("Version Cliente");
				menuI.AccesoVersionCliente();
				break;

			case 2:
				System.out.println("Version Empleado");
				menuI.AccesoVersionEmpleado();
				break;

			default:
				System.out.println("Eliga una opción válida");

			}

		} while (!cerrarMenu);

	}

}
