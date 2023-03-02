import java.util.Scanner;

class Main {
	private Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
	
	public void start() {
		System.out.println("Please type your name");
		String name = scan.nextLine();
		System.out.println("Greetings " + name + "! " + "Please type your age.");

		int age = scan.nextInt();

		int retire = 0;
		if (retire < 67) {
			retire = 67 - age;
			System.out.println("You have " + retire + " years until retirement!");
		} else {
			System.out.println("You're $age years old, you have the ability to retire now!");
		}
	}
}