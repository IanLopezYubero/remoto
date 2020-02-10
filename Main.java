import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner (System.in);
		int num1, num2;
		Main.menu();
		int opc = sn.nextInt();
		switch(opc) {
			case 1:
				num1 = sn.nextInt();
				num2 = sn.nextInt();
				Main.sumar2(num1, num2);
				break;
			case 2:
				num1 = sn.nextInt();
				num2 = sn.nextInt();
				Main.multiplicar2(num1, num2);
				break;
		}
	}
	
	static void menu() {
		System.out.println("1. Introduce 2 enteros a sumar");
		System.out.println("2. Introduce 2 enteros a multiplicar");
	}
	
	static void sumar2(int num1, int num2) {
		System.out.println("La suma es: " + (num1+num2));
	}
	
	static void multiplicar2(int num1, int num2) {
		System.out.println("La multiplicacion es: " + (num1*num2));
	}

}
