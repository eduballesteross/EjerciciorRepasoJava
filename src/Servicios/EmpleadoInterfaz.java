package Servicios;

import java.util.List;

import Dtos.ClienteDto;

public interface EmpleadoInterfaz {

	public void ValidarCliente(List<ClienteDto>listaClientes);
	public void BorrarCliente(List<ClienteDto>listaClientes);
	public void MostrarCliente(List<ClienteDto>listaClientes);
}
