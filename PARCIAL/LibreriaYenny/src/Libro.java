import java.util.Date;

public class Libro {

	private String isbn;
	private String titulo;
	private double precio;
	private Date fechaPub;
	private String editorial;
	private int cantidad;
	
	
	public Libro(String isbn, String titulo, double precio, Date fechaPub, String editorial, int cantidad) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.precio = precio;
		this.fechaPub = fechaPub;
		this.editorial = editorial;
		this.cantidad = cantidad;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Date getFechaPub() {
		return fechaPub;
	}


	public void setFechaPub(Date fechaPub) {
		this.fechaPub = fechaPub;
	}


	public String getEditorial() {
		return editorial;
	}


	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", precio=" + precio + ", fechaPub=" + fechaPub
				+ ", editorial=" + editorial + ", cantidad=" + cantidad + "]";
	}
	
	
	
	public void agregarLibro() {
		
	}
	
	public void eliminarLibro() {
		
	}
	
	public void editarLibro() {
		
	}
	
	public void buscarLibro() {
		
	}
	
	
}
