package es.uva.infor.poo.UsaPunto;

/**
 * Implementación elemental de un punto del plano.
 * Se utilzian versiones diferentes de esta clase en función
 * del momento en el que se presenta.
 * @author irecald, ruichen, alejaga
 *
 */
public class Punto {
	
	private double coordenadaX;
	private double coordenadaY;
	private double rho;
	private double theta;
	
	/**
	 * Devolvemos la coordenadaX que pertenece al eje de abcisas de las coordenadas cartesianas
	 * @return coordenadaX 
	 */
	public double getX() {
		return coordenadaX;
	}
	
	/**
	 * Devolvemos la coordenadaY que pertenece al eje de ordenadas de las coordenadas cartesianas
	 * @return coordenadaY 
	 */
	public double getY() {
		return coordenadaY;
	}
	/**
	 * Calcula el angulo necesario para pasar el punto a coordenadas polares.
	 * @return theta angulo entre las dos componentes
	 */
	public double getTheta() {
		theta = coordenadaY/coordenadaX;
		theta = Math.atan(theta);
		return theta;
	}
	
	/**
	 * Asigna el valor de theta de un punto a otro
	 * @param theta de un ángulo
	 */
	public void asignaTheta(double theta) {
		this.theta=theta;
		coordenadaX=rho*Math.cos(this.theta);
		coordenadaY=rho*Math.sin(this.theta);
	}
	
	
	/**
	 * Calcula la distancia entre las coordenadas del punto.
	 * 
	 * @return rho distancia entre las coordenadas.
	 */
	public double getRho() {
		double x=Math.pow(coordenadaX, 2);
		double y=Math.pow(coordenadaY,2);
		rho= x + y;
		rho = Math.sqrt(rho);
		return rho;
		
	}
	
	/**
	 * Asigna el valor de rho de un punto a otro
	 * @param rho de un punto
	 */
	public void asignaRho(double rho) {
		this.rho=rho;
	}
	
	/**
	 * Modificación del punto en proporción con el valor introducido
	 * @param f que es el valor proporcionado para escalar
	 */
	public void escala(double f) {
		 coordenadaX = f*coordenadaX;
		 coordenadaY = f*coordenadaY;
		 getRho();
		 getTheta();
	 }
	
	/**
	 * Calcula la distancia entre dos puntos.
	 * recibe un punto @param p
	 * @return resultado que es la distancia 
	 */
	public double distancia(Punto p) {
		double x = coordenadaX - p.getX();
		double y = coordenadaY - p.getY();
		double cuadradoX= Math.pow(x,2);
		double cuadradoY= Math.pow(y,2);
		double resultado = cuadradoX + cuadradoY;
		return Math.sqrt(resultado);
	}
	
	/**
	 * Recibe dos parametros de tipo double y desplaza el punto en esa direción
	 * la distancia que marcan los parámetros
	 * @param a desplaza en el eje de abcisas a la coordenadaX tantas veces como marque a
	 * @param b desplaza en el eje de ordenadas a la coordenadaY tantas veces como marque b
	 */
	public void traslada(double a, double b) {
		coordenadaX = coordenadaX+a;
		coordenadaY = coordenadaY+b;
	}
	 
	/**
	 * @return cadenaCartesianas que devuelve un String con el punto
	 */
	
	public String cartesianasACadena(){
		String cadenaCartesianas = "(" + coordenadaX + " , " + coordenadaY + ")";
		return cadenaCartesianas;
	}
	
	/**
	 * @return cadenaPolar que devuelve un String con el punto en forma polar
	 */
	
	public String polaresACadena(){
		String cadenaPolar;
		if (rho==0 && theta==0) {
			cadenaPolar = "(" + getRho() + ", " + getTheta() + " rad" +")";
		}
		else {	
			cadenaPolar = "(" + rho + ", " + theta + " rad" +")";
		}
		return cadenaPolar;
	}
	
	/**
	 * 
	 * @param g
	 */
	public void rota (double g) {
		coordenadaX = coordenadaX*Math.cos(g) - coordenadaY*Math.sin(g);
		coordenadaY = coordenadaX*Math.sin(g) + coordenadaY*Math.cos(g);
		getRho();
		getTheta();
	}
	
	/**
	 * 
	 * @param origen
	 * @param g
	 */
	public void rota(Punto origen, double g) {
		coordenadaX = ((coordenadaX - origen.coordenadaX) * Math.cos(g)) - ((origen.coordenadaY - coordenadaY) * Math.sin(g)) + origen.coordenadaX; 
		coordenadaY = ((origen.coordenadaY - coordenadaY) * Math.cos(g)) - ((coordenadaX - origen.coordenadaX) * Math.sin(g)) + origen.coordenadaY;
		getRho();
		getTheta();
	}
	

}
