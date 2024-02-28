package Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.ClienteDto;

public class ClienteImplementacion implements ClienteInterfaz {

	Scanner sc = new Scanner(System.in);

	@Override
	public void RegistroCliente(List<ClienteDto> listaClientes) {
		// TODO Auto-generated method stub

		long id = CalcularID(listaClientes);
		sc.nextLine();
		System.out.println("Introduzca el Nombre Completo");
		String nombreCompleto = sc.nextLine();
		System.out.println("Introduzca el DNI.");
		String dni = sc.next();
		System.out.println("Introduzca su correo electrónico");
		String correo = sc.next();
		System.out.println("Introduzca una contraseña");
		String contrasenia = sc.next();

		ClienteDto nuevoCliente = new ClienteDto(id, nombreCompleto,dni, correo, contrasenia);
		listaClientes.add(nuevoCliente);

	
	

	}

	private long CalcularID(List<ClienteDto> listaCliente) {

		long idCalculado;
		int tamaniolista = listaCliente.size();

		if (tamaniolista == 0) {
			idCalculado = 1;
		} else {
			idCalculado = listaCliente.get(tamaniolista - 1).getIdCliente() + 1;
		}

		return idCalculado;
	}

	@Override
	public void InicioSesionClientes(List<ClienteDto> listaClientes) {
		// TODO Auto-generated method stub

		System.out.println("ACCESO CLIENTE (LOGIN)");

		System.out.println("Email: ");
		String emailCliente = sc.next();
		System.out.println("Contraseña: ");
		String contrasenia = sc.next();

		for (ClienteDto cliente : listaClientes) {

			if (cliente.getContraseniaCliente().equals(contrasenia) && cliente.getEmailCliente().equals(emailCliente)
					&& cliente.isEsValidado() == true) {

				System.out.println("INICIO DE SESION CON EXITO");
			} else {
				System.out.println("INICIO DE SESION SIN EXITO");
			}
		}

	}

}
