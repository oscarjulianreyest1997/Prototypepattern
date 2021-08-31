package model;

public abstract class Prenda {
	
	private String talla;
	private String color;
	
	
	public Prenda() {
		
		
	}
	
	protected Prenda(Prenda p) {
		this.talla=p.talla;
		this.color=p.color;
		
	}
	
	
	public String getTalla() {
		return talla;
	}
	
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public abstract Prenda clone();
	

}
