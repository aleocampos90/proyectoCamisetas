package app.camisetas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Camisetas")
public class Camiseta {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String marca;
	private char talle;
	private String color;
	private double precio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public char getTalle() {
		return talle;
	}

	public void setTalle(char talle) {
		this.talle = talle;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Camiseta [id=" + id + ", marca=" + marca + ", talle=" + talle + ", color=" + color + ", precio="
				+ precio + "]";
	}

	public Camiseta(int id, String marca, char talle, String color, double precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.talle = talle;
		this.color = color;
		this.precio = precio;
	}
	
	public Camiseta() {}
}
