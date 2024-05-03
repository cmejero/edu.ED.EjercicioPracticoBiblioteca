package dtos;

import java.time.LocalDateTime;

public class clientesDto {

	long idCliente;
	String nombreCliente = "aaaa";
	String apellidosCliente = "aaaaa";
	LocalDateTime fechaNaciminetoCliente;
	String dniCLiente = "aaaaa";
	String correoCliente = "aaaaa";
	LocalDateTime fechaInicioSuspensionCliente;
	LocalDateTime fechaFinSuspensionCliente;

	public clientesDto() {
		super();
	}

	public clientesDto(long idCliente, String nombreCliente, String apellidosCliente,
			LocalDateTime fechaNaciminetoCliente, String dniCLiente, String correoCliente,
			LocalDateTime fechaInicioSuspensionCliente, LocalDateTime fechaFinSuspensionCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
		this.fechaNaciminetoCliente = fechaNaciminetoCliente;
		this.dniCLiente = dniCLiente;
		this.correoCliente = correoCliente;
		this.fechaInicioSuspensionCliente = fechaInicioSuspensionCliente;
		this.fechaFinSuspensionCliente = fechaFinSuspensionCliente;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidosCliente() {
		return apellidosCliente;
	}

	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}

	public LocalDateTime getFechaNaciminetoCliente() {
		return fechaNaciminetoCliente;
	}

	public void setFechaNaciminetoCliente(LocalDateTime fechaNaciminetoCliente) {
		this.fechaNaciminetoCliente = fechaNaciminetoCliente;
	}

	public String getDniCLiente() {
		return dniCLiente;
	}

	public void setDniCLiente(String dniCLiente) {
		this.dniCLiente = dniCLiente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public LocalDateTime getFechaInicioSuspensionCliente() {
		return fechaInicioSuspensionCliente;
	}

	public void setFechaInicioSuspensionCliente(LocalDateTime fechaInicioSuspensionCliente) {
		this.fechaInicioSuspensionCliente = fechaInicioSuspensionCliente;
	}

	public LocalDateTime getFechaFinSuspensionCliente() {
		return fechaFinSuspensionCliente;
	}

	public void setFechaFinSuspensionCliente(LocalDateTime fechaFinSuspensionCliente) {
		this.fechaFinSuspensionCliente = fechaFinSuspensionCliente;
	}

}
