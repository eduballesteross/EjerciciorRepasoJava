package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.ClienteDto;

public class EmpleadoImplementacion implements EmpleadoInterfaz {

	Scanner sc = new Scanner (System.in);
	@Override
	public void ValidarCliente(List<ClienteDto> listaClientes) {
		// TODO Auto-generated method stub

		List<ClienteDto> listaAuxiliar = new ArrayList<>();

		for (ClienteDto cliente : listaClientes) {
			if (cliente.isEsValidado() == false) {

				System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
				System.out.println("DNI: " + cliente.getDniCliente());
				System.out.println("Nombre: " + cliente.getNombreCliente());
				System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
				listaAuxiliar.add(cliente);
			}
			
		}
		
		for (ClienteDto cliente: listaAuxiliar) {
			
			String DniCliente;
			System.out.println("Introduzca el DNI del usuario a validar");
			DniCliente= sc.next();
			
			if(DniCliente.equals(cliente.getDniCliente())) {
				
				cliente.setEsValidado(true);
				System.out.println("El usuario con DNI "+DniCliente+" ha sido validado con exito.");
				
			}else {
				System.out.println("El usuario con DNI "+DniCliente+" no existe.");
			}
		}
	}
	@Override
	public void BorrarCliente(List<ClienteDto> listaClientes) {
		// TODO Auto-generated method stub
		
		String DniCliente;

		
		if (listaClientes.size()>0) {
			
			System.out.println("Introduzca el DNI del usuario a borrar");
			DniCliente=sc.next();
			ClienteDto borrarCliente = new ClienteDto();
			
			for(ClienteDto cliente: listaClientes) 
			{
				if (DniCliente.equals(cliente.getDniCliente()))	{
				
				borrarCliente=cliente;
				
				}
			}
			listaClientes.remove(borrarCliente);
			System.out.println("El usuario con DNI "+DniCliente+ " ha sido borrado con éxito");
			
			}else {
				System.out.println("No hay usuarios para borrar.");
			}
			
		
		
	}
	@Override
	public void MostrarCliente(List<ClienteDto> listaClientes) {
		// TODO Auto-generated method stub
		System.out.println("Mostrar Clientes");
		
		String sn;
		
		for(ClienteDto cliente: listaClientes) {
			
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			System.out.println("DNI: "+cliente.getDniCliente());
			System.out.println("Nombre: "+ cliente.getApellido1Cliente()+ " " +cliente.getApellido2Cliente()+ " " + cliente.getNombreCliente());
			
			if(cliente.isEsValidado()==true) {
				
				sn="SI";
				
			}else {
				sn="NO";
			}
			
			System.out.println("Estado de Validacion: "+sn);
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			
		}
	}

}
