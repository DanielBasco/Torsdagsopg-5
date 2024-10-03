import java.util.Scanner;

public class Opg2Main{
	
	public static void main(String[] args){

		System.out.println("Skriv dit navn");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.nextLine();

		System.out.println("Hej "+name+". Skriv din alder");

		int age = scanner.nextInt();
		int pension = 67-age;
		System.out.println("Din alder er "+age+". Du har "+pension+" år indtil din pension");


	}
}