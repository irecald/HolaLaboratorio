package es.uva.infor.poo.UsaPunto;

public class UsaPunto {
	
	public static void main (String[] args) {
		Punto p1,p2;
		p1 = new Punto();
		p2 = new Punto();
		
		p1.traslada(3,4);
		double d = p1.distancia(p2);
		
		System.out.println("p1: (" + p1.getX() + "," + p1.getY()+")");
		System.out.println("p2: (" + p2.getX() + "," + p2.getY() + ")");
		System.out.println("distancia de p1 a p2:" + d);
		system.out.println("dsffsd");
		System.out.print("Otra cosa a ver si sale de diferente color");
		
	}
}
