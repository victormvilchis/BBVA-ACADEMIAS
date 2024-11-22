public class TemasVistos {
	
	private final String MI_NOMBRE = "David";
	
	public void verificarEdad(int edad) {
		System.out.println(edad < 18 ? "Acceso denegado" : "Bienvenido!");
	}
	
	public void imprimirDatos(String nombre, int edad, double estatura) {
		System.out.printf("Hola, %s yo también tengo %d pero no mido %.2f \n", nombre, edad, estatura);
	}
	
	public int sumaDosNumeros(int a, int b) {
		return a + b;
	}
	
	public void compararNombre(String nombre) {
		System.out.println(this.MI_NOMBRE.equals(nombre) ? "Mucho gusto, yo también me llamo" + nombre: "Un gusto conocerte " + nombre);
	}
	
	public boolean verificarPar(int numero) {
		return numero % 2 == 0;
	}
	
	public boolean compararWrapper(Integer num1, int num2) {
		return num1 == num2;
	}
	
	public void testPreIncremento(int n) {
		int b = ++n;
		System.out.println("Preincremento: " + b);
	}
	
	public void testPostIncremento(int n) {
		int b = n++;
		System.out.println("Postincremento: " + b);
	}
	
	public static void main(String[] args) {
		TemasVistos temas = new TemasVistos();
		temas.verificarEdad(20);
		System.out.println("Resultado: " + temas.sumaDosNumeros(10, 20) );
		temas.sumaDosNumeros(10, 20);
		temas.imprimirDatos("David", 22, 1.76);
		temas.compararNombre("Ulises");
		System.out.println(temas.verificarPar(3) ? "Es un numero par" : "Es impar");
		System.out.println("Integer == int? " + temas.compararWrapper(3, 3));
		System.out.println("Integer == int? " + temas.compararWrapper(new Integer(3), 3));
		temas.testPostIncremento(0);
		temas.testPreIncremento(0);
	}

}
