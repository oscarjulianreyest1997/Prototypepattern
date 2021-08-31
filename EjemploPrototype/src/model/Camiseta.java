package model;

public class Camiseta extends Prenda {

	private String tipoCuello;

	public Camiseta() {

	}

	private Camiseta(Camiseta camiseta) {
		super(camiseta);
		this.tipoCuello = camiseta.tipoCuello;
	}

	public String getTipoCuello() {
		return tipoCuello;
	}

	public void setTipoCuello(String tipoCuello) {
		this.tipoCuello = tipoCuello;
	}

	@Override
	public Prenda clone() {
		return new Camiseta(this);
	}

}
