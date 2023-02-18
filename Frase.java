import java.util.Scanner;

public class Frase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.print("Frase: ");
        String frase = scanner.nextLine();
        System.out.print("Caràcter: ");
        String car = scanner.nextLine();

        if (car.length() > 1) {
            System.out.println("La longitud del caràcter ha de ser 1");
        } else if (!frase.contains(car)) {
            System.out.println("El caràcter no existeix");
        } else {
            String novaFrase = frase.replaceAll(car, "*");
            System.out.println(novaFrase);
        }
		
		
	}

}
