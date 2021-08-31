package model;

public class Calzado extends Prenda{
	
	private String tipoCalzado;
	
	public Calzado() {
		
	}
	
	private Calzado(Calzado calzado) {
		super(calzado);
		this.tipoCalzado = calzado.tipoCalzado;
	} 

	public String getTipoCalzado() {
		return tipoCalzado;
	}



	public void setTipoCalzado(String tipoCalzado) {
		this.tipoCalzado = tipoCalzado;
	}



	@Override
	public Prenda clone() {
		return new Calzado(this);
	}

}
