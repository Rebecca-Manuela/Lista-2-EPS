import java.util.*;
public class CalculoIMC {
	public static void main(String[]args) {
		double peso, altura, imc;
		Scanner in = new Scanner (System.in);
		System.out.println(" Coloque o seu peso: ");
		peso=in.nextDouble();
		System.out.println(" Coloque a sua altura: ");
		altura=in.nextDouble();
		imc=(peso/(altura*altura));
		System.out.println(" O seu IMC é:"+imc);
		if(imc<18.5) {
			System.out.println("Excesso de magreza");
		} else if(imc>=18.5 && imc<25){
			System.out.println(" Peso normal");
		} else if(imc>=25 && imc<30) {
				System.out.println(" Excesso de peso");
		} else if(imc>=30 && imc<35) {
				System.out.println(" Obesidade (Grau I)");
		} else if(imc>=35 && imc<40) {
		System.out.println(" Obesidade (Grau II)");
		} else {
			System.out.println(" Obesidade (Grau III)");
		}
		in.close();
	} 
}
