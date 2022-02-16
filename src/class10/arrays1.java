package class10;

public class arrays1 {

	public static void main(String[] args) {
		String[][] food = { { "redbull", "burger", "steak", "fries" }, { "curry", "biriyani", "butter chicken" },
				{ "pad thai", "nuddles", "tom yum" } };

		for (int i = 0; i < food.length; i++) {
			for (int j = 0; j < food[i].length; j++) {
				System.out.print(food[i][j] + " ");
			}
			System.out.println();

		}

		System.out.println();
		System.out.println();

		for (int k = 0; k < food[0].length; k++) {
			System.out.println(food[0][k] + " ");
		}

		System.out.println();
		System.out.println();

		for (String[] foo : food) {
			for (String fo : foo) {
				System.out.print(fo + " ");
			}
			System.out.println();
		}

	}

}
