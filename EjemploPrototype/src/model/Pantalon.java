package model;

public class Pantalon extends Prenda {

	private String tipoBota;

	public Pantalon() {
	}

	private Pantalon(Pantalon pantalon) {
		super(pantalon);
		this.tipoBota = pantalon.tipoBota;
	}

	public String getTipoBota() {
		return tipoBota;
	}

	public void setTipoBota(String tipoBota) {
		this.tipoBota = tipoBota;
	}

	@Override
	public Prenda clone() {
		return new Pantalon(this);

	}

}
