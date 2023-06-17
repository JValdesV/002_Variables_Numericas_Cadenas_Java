package App;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables numericas de tipo entero
		int x = 200;
		int y = 150;
		
		System.out.println(x);
		System.out.println(y);
		
		//Variables de tipo numerico con punto decimal
		double j = 65005.789;
		double k = -10.56;
		
		System.out.println(j);
		System.out.println(k);
		
		//Variables de tipo cadena caracter unico
		char caracter = 'a';
		System.out.println(caracter);
		
		char caracterAAscii = 97 + 1;
		System.out.println(caracterAAscii);
		
		//Variable de tipo cadena multiple
		
		String cadena = "Hola Mundo";
		System.out.println(cadena);
		
		String cadena1 = "Hola Mundo " + 1;
		System.out.println(cadena1);
		
		String cadena2 = "11" + 1;
		System.out.println(cadena2);
		
		//Conversiones o casting
		
		double d = (int) 7 + (int)2.5;
		System.out.println(d);
		
		int s = (int) (7.5 / 2);
		System.out.println(s);
		
		
		
	}

}
