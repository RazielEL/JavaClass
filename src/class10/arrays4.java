package class10;

public class arrays4 {

	public static void main(String[] args) {
		String[][] names = new String[2][4];

		names[0][0] = "Mr";
		names[0][1] = "Mrs";
		names[0][2] = "Ms";
		names[0][3] = "Miss";

		names[1][0] = "Smith";
		names[1][1] = "Jordan";
		names[1][2] = "Jackson";
		names[1][3] = "Obama";

		System.out.println(names[0][1] + " " + names[1][0]);
		System.out.println(names[0][0] + " " + names[1][3]);
		System.out.println(names[0][2] + " " + names[1][2]);
		System.out.println(names[0][3] + " " + names[1][1]);

		System.out.println();

		String[][] grades =

				{ { "Krupa", "Will", "Kenny", "Joselyn" }, { "A", "B", "C", "D" }, { "1", "2" } };

		System.out.println(grades[0][1] + " is receiving grade " + grades[1][0]);
		System.out.println(grades[0][0] + " is receiving grade " + grades[1][3]);
		System.out.println(grades[0][2] + " is receiving grade " + grades[1][2]);
		System.out.println(grades[0][3] + " is receiving grade " + grades[1][1]);

		System.out.println();

		int size = grades.length; // - ilosc rowsc
		System.out.println(size);

		int size1 = grades[0].length; // - kolumna 1
		System.out.println(size1);

		int size2 = grades[1].length; // - kolumna 2
		System.out.println(size2);

		for (int i = 0; i < grades.length; i++) {
			for (int j = 0; j < grades[i].length; j++) {

				System.out.print(grades[i][j] + " ");

			}
			System.out.println();
		}

	}

}
