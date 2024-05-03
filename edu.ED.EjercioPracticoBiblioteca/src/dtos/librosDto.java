package dtos;

public class librosDto {

	long idLibro;	
	String titulo = "aaaaa";
	String subtitulo = "aaaaa";
	String autor = "aaaaa";
	String ISBN = "aaaaa";
	int numEdicion = 0;
	String editorial = "aaaaa";
	int stock = 0;
	
	public librosDto() {
		super();
	}
	
	public librosDto(long idLibro, String titulo, String subtitulo, String autor, String iSBN, int numEdicion,
			String editorial, int stock) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.autor = autor;
		ISBN = iSBN;
		this.numEdicion = numEdicion;
		this.editorial = editorial;
		this.stock = stock;
	}
	
	
	
	public long getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(long idLibro) {
		this.idLibro = idLibro;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSubtitulo() {
		return subtitulo;
	}
	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getNumEdicion() {
		return numEdicion;
	}
	public void setNumEdicion(int numEdicion) {
		this.numEdicion = numEdicion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
