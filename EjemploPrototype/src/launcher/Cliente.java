package launcher;

import model.*;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Camiseta c1= new Camiseta();
		c1.setTalla("M");
		c1.setColor("negra");
		c1.setTipoCuello("Redondo");
		
		Camiseta c2=(Camiseta) c1.clone();
		
		c2.setTipoCuello("Tipo V");
		
		System.out.println("\t--------- Camisetas----------");
		System.out.println("Talla: "+c2.getTalla());
		System.out.println("Color: "+c2.getColor());
		System.out.println("Tipo de Cuello: "+c2.getTipoCuello());
		System.out.println();
		
		System.out.println("Talla: "+c1.getTalla());
		System.out.println("Color: "+c1.getColor());
		System.out.println("Tipo de Cuello: "+c1.getTipoCuello());
		
		
		Pantalon p1=new Pantalon();
		p1.setTalla("32");
		p1.setColor("Azul");
		p1.setTipoBota("Bota Campana");
		
		Pantalon p2=(Pantalon) p1.clone();
		
		p2.setTalla("30");
		p2.setColor("Verde");
		
		System.out.println("\t--------- Pantalones----------");
		System.out.println("Talla: "+p2.getTalla());
		System.out.println("Color: "+p2.getColor());
		System.out.println("Tipo de Bota: "+p2.getTipoBota());
		System.out.println();
		
		System.out.println("Talla: "+p1.getTalla());
		System.out.println("Color: "+p1.getColor());
		System.out.println("Tipo de Bota: "+p1.getTipoBota());
		
		
		Calzado cal1=new Calzado();
		cal1.setTalla("10.5 Us");
		cal1.setColor("Naranja");
		cal1.setTipoCalzado("Guayos");
		
		
		Calzado cal2=(Calzado) cal1.clone();
		
		cal2.setTipoCalzado("Zapatos");
		cal2.setColor("Negro");
		
		System.out.println("\t--------- Calzado----------");
		System.out.println("Talla: "+cal2.getTalla());
		System.out.println("Color: "+cal2.getColor());
		System.out.println("Tipo de Calzado: "+cal2.getTipoCalzado());
		System.out.println();
		
		System.out.println("Talla: "+cal1.getTalla());
		System.out.println("Color: "+cal1.getColor());
		System.out.println("Tipo de Calzado: "+cal1.getTipoCalzado());
		
		
		

	}

}
