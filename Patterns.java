//Azariya Tefera
//This is primrily review for w
public class Patterns {
	// Precondition: rows is a positive integer.
	// Postcondition: Prints a star pattern.
	public static void stars(int rows) {
		int i = 0;
		String star = "*";
		while (rows >= i) {
			System.out.println(star);
			i++;
			star += "**";

		}
	}

	// Precondition: rows is a positive integer.
	// Postcondition: Prints a number triangle.
	public static void triangle(int rows) {
		int i = 1;
		int num = 1;
		while (rows >= i) {
			num = 1;
			while (i >= num) {
				System.out.print(i);
				num++;

			}
			System.out.println();
			i++;

		}
	}

	// Precondition: rows is a positive integer.
	// Postcondition: Prints a pattern of odd numbers.
	public static void odds(int rows) {
		int count = rows;
		for (; count >= 1; count -= 2) {
			for (int i = 0; count > i; i++) {
				System.out.print(count);
			}
			System.out.println();
		}
	}

	// Precondition: rows is a positive integer.
	// Postcondition: Prints an E/O pattern.
	public static void eo(int rows) {
		int i = rows;

		String let = "O";
		if (rows % 2 == 1) {
			let = "E";
		}
		for (int num = 1; i >= num; num++) {
			for (int count = 1; count < num; count++) {
				System.out.print(let);
			}
			if (let == "E") {
					let = "O";
				}
				else{
				let = "E";
				}
			System.out.println();		
			}
		for (;i>=1;i--){
			for(int g = 0; i>g;g++){
				System.out.print(let);
			}
			if (let == "E") {
					let = "O";
				}
				else{
				let = "E";
				}
			System.out.println();		

		}
		}

		// Precondition: rows is a positive integer.
		// Postcondition: Prints an upside-down number pyramid.
		public static void pyramid(int rows){
			for (int row = 1; row <= rows; row++) {
				for (int i = 0; i < row - 1; i++) {
					System.out.print(" ");
				}
				for (int i = 0; i < (rows - row) * 2 + 1; i++) {
					System.out.print(row);
				}
				System.out.println();
			}
		}

	// Precondition: None.
	// Postcondition: Prints the pyramid.
	public static void main(String[] args) {
		//Patterns.stars(7);
		//Patterns.triangle(9);
		//System.out.println();
		//Patterns.odds(9);
		//Patterns.eo(15);
		Patterns.pyramid(5);
		
	}

}
