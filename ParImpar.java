import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introdueix el segon número: ");
        int num2 = scanner.nextInt();

        System.out.print("Introdueix el tercer número: ");
        int num3 = scanner.nextInt();

        int suma = num1 + num2 + num3;
        String parellOImparell = (suma % 2 == 0) ? "es parell" : "es imparell";

        System.out.println(suma + " " + parellOImparell);

        scanner.close();
	}

}
