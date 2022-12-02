import java.util.Scanner;
public class Triangulo {
	public static void main (String [] args) {
		Scanner in= new Scanner (System.in);
		double a, b, c;
		System.out.println(" Digite o valor de A:");
		a=in.nextDouble();
		System.out.println(" Digite o valor de B:");
		b=in.nextDouble();
		System.out.println(" Digite o valor de C:");
		c=in.nextDouble();
		if(a==b && b==c && c==a) {
			System.out.println(" Triângulo equilátero");
		} else if(a!=b && b!=c && c!=a) {
			System.out.println(" Triângulo escaleno");
		} else if(a!=b && b==c || c==b && c!=a || a==c && a!=b) {
			System.out.println(" Triângulo isósceles");
		} else if(a<c+b && b<a+c && c<a+b) {
			System.out.println(" As medidas formam um triângulo");
		} else {
			System.out.println(" As medidas não formam um triângulo");
		}
		in.close();
	}
}
