package class10;

public class arrays3 {

	public static void main(String[] args) {
		String[] foods = { "pizza", "burger", "sushi", "padthai" };

		for (int i = foods.length - 1; i >= 0; i--) {
			System.out.print(foods[i] + " ");

		}

		System.out.println();

		String[] countries = { "Poland", "Germany", "Ukraine", "Russia", "UK" };
		String[] capitals = { "Warsaw", "Berlin", "Kiev", "Moscow", "London" };

		for (int i = 0; i < countries.length; i++) {

			System.out.println("The capital of " + countries[i] + " is " + capitals[i]);
		}

	}

}
