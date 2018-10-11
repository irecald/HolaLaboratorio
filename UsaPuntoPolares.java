/**
 * 
 */
package es.uva.infor.poo.UsaPunto;

/**
 * @author irecald
 *
 */
public class UsaPuntoPolares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1,p2;
		p1 = new Punto();
		p2 = new Punto();
		Punto origen = new Punto();
		
		p1.traslada(3,4);
		
		System.out.println(p1.cartesianasACadena());
		System.out.println(p1.polaresACadena());
		
		System.out.println("distancia de "+ p1.cartesianasACadena() + " a " + p2.cartesianasACadena() + " = " + p1.distancia(p2));
		
		System.out.println("----------------");
		
		p2.traslada(Math.sqrt(2)/2, Math.sqrt(2)/2);
		System.out.println(p2.cartesianasACadena());
		System.out.println(p2.polaresACadena());
		
		p1.asignaRho(p2.getRho());
		p1.asignaTheta(p2.getTheta());
		
		System.out.println(p1.cartesianasACadena());
		System.out.println(p1.polaresACadena());
		
		System.out.println("----------------");
		
		p2.escala(3);
		
		System.out.println(p2.cartesianasACadena());
		System.out.println(p2.polaresACadena());
		
		System.out.println("----------------");
		
		p1.rota(Math.PI);
		
		System.out.println(p1.cartesianasACadena());
		System.out.println(p1.polaresACadena());
		
		System.out.println("----------------");
		
		p1.rota(origen, Math.PI);
		
		System.out.println(p1.cartesianasACadena());
		System.out.println(p1.polaresACadena());
		
	}

}
 eres una patata
