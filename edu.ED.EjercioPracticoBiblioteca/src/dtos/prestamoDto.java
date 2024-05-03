package dtos;

import java.time.LocalDateTime;

public class prestamoDto {

	long idPrestamo;
	long idCliente;
	long idLibro;
	LocalDateTime fechaPrestamo;
	LocalDateTime fechaEntrega;
	String estadoPrestamo;

	public prestamoDto() {
		super();
	}

	public prestamoDto(long idPrestamo, long idCliente, long idLibro, LocalDateTime fechaPrestamo,
			LocalDateTime fechaEntrega, String estadoPrestamo) {
		super();
		this.idPrestamo = idPrestamo;
		this.idCliente = idCliente;
		this.idLibro = idLibro;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaEntrega = fechaEntrega;
		this.estadoPrestamo = estadoPrestamo;
	}

	public long getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(long idLibro) {
		this.idLibro = idLibro;
	}

	public LocalDateTime getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDateTime fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public LocalDateTime getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(LocalDateTime fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstadoPrestamo() {
		return estadoPrestamo;
	}

	public void setEstadoPrestamo(String estadoPrestamo) {
		this.estadoPrestamo = estadoPrestamo;
	}

}
