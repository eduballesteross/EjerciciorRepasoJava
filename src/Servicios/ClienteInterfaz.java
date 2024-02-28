package Servicios;

import java.util.List;

import Dtos.ClienteDto;

public interface ClienteInterfaz {

	public void RegistroCliente(List<ClienteDto>listaClientes);
	public void InicioSesionClientes(List<ClienteDto>listaClientes);
}
