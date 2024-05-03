package servicios;

import java.io.Console;
import java.util.List;
import java.util.Scanner;

import controladores.inicio;
import dtos.clientesDto;
import dtos.librosDto;

public class operativaImplementacion {

	inicio i;

	public void darAltaLibro(Scanner sc) {

		long idLibro = autoincrementarID();
		System.out.println("introduzca titulo de libro");
		String titulo = sc.nextLine();
		System.out.println("introduzca  subtitulo libro");
		String subtitulo = sc.nextLine();
		System.out.println("introduzca el autor");
		String autor = sc.nextLine();
		System.out.println("introduzca ISBN");
		String ISBN = sc.nextLine();
		System.out.println("introduzca el numero de la edición");
		int numEdicion = sc.nextInt();
		System.out.println("introduzca el nombre el editorial");
		String nomEditorial = sc.next();
		System.out.println("introduzca el stock");
		int stock = sc.nextInt();

		librosDto libroNuevo = new librosDto(idLibro, titulo, subtitulo, autor, ISBN, numEdicion, nomEditorial, stock);

	}

	private long autoincrementarID() {
		long nuevoId;
		int tamanioLista = i.listaLibros.size();
		if (tamanioLista > 0) {
			nuevoId = i.listaLibros.get(tamanioLista -1).getIdLibro() + 1;
		} else {
			nuevoId = 1;
		}
		return nuevoId;

	}

	public void darAltaCliente(Scanner sc)
	{
	    System.out.println("introduzca DNI");
	    String DNI = sc.next();

	    for(clientesDto cliente : i.listaClientes)
	    {
	        if (cliente.getDniCLiente().equals(DNI))
	        {

	            long idCliente = autoincrementarID();
	            System.out.println("introduzca nombre cliente");
	            String nombre = sc.next();
	            System.out.println("introduzca  apellidos");
	            String apellidos = sc.next();
	            System.out.println("introduzca fecha de nacimiento");
	            String fechaNac = sc.next();
	            System.out.println("introduzca DNI");
	            String dni = sc.next();
	            System.out.println("introduzca correo electronico");
	            String correo = sc.next();

	            cliente.setFechaNaciminetoCliente() = Convert.ToDateTime(fechaNac);

	            listaAntiguaCLiente.Add(cliente);

	        }
	        else
	        {
	            System.out.println("El DNI introducido ya existe");
	        }
	    }



	}

	private long autoincrementarID(List<ClienteDto> listaCliente) {

		long nuevoId;
		int tamanioLista = listaCliente.Count;
		if (tamanioLista > 0) {
			nuevoId = listaCliente[tamanioLista - 1].IdCliente + 1;
		} else {
			nuevoId = 1;
		}
		return nuevoId;

	}

	F

	public void darAltaPrestamo(List<PrestamoDto> listaAntiguaPrestamo)
	 {
	     System.out.println("Introduzca el DNI del cliente al cual se va a realizar el prestamo");
	     string DNIClienteIntroducido = Console.ReadLine();

	     System.out.println("Introduzca el Titulo del libro");
	     string libroElegido = Console.ReadLine();

	     foreach (ClienteDto clientes in Program.listaCliente)
	     {
	         if (clientes.DniCLiente.Equals(DNIClienteIntroducido))
	         {
	             foreach (LibroDto libros in Program.listaLibros)
	             {
	                 if (libros.Titulo.Equals(libroElegido))
	                 {
	                     if (libros.Stock > 0)
	                     {
	                         long idIntroducido = Convert.ToInt64(Console.ReadLine());
	                         PrestamoDto prestamo = new PrestamoDto();

	                         long idPrestamo = autoincrementarID(listaAntiguaPrestamo);
	                         prestamo.IdCliente = clientes.IdCliente;
	                         System.out.println("introduzca el id del libro");
	                         prestamo.IdLibro = libros.IdLibro;
	                         System.out.println("introduzca fecha prestamo");
	                         string fechaPrestamo = Console.ReadLine();
	                         System.out.println("introduzca fecha entrega");
	                         string fechaEntrega = Console.ReadLine();
	                         System.out.println("introduzca estado del prestamo");
	                         prestamo.EstadoPrestamo = Console.ReadLine();

	                         prestamo.FechaPrestamo = Convert.ToDateTime(fechaPrestamo);
	                         prestamo.FechaEntrega = Convert.ToDateTime(fechaEntrega);

	                         listaAntiguaPrestamo.Add(prestamo);
	                     }
	                     else
	                     {
	                         System.out.println("No tenemos stock de este libro");
	                     }
	                 }
	                 else
	                 {
	                     System.out.println("El libro introducido no existe");
	                 }
	             }
	         }
	         else
	         {
	             System.out.println("El cliente introducido no existe, dar de alta");
	         }
	     }



	 }

	private long autoincrementarID(List<PrestamoDto> listaPrestamo) {
		long nuevoId;
		int tamanioLista = listaPrestamo.Count;
		if (tamanioLista > 0) {
			nuevoId = listaPrestamo[tamanioLista - 1].IdPrestamo + 1;
		} else {
			nuevoId = 1;
		}
		return nuevoId;

	}

}
