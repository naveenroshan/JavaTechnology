package SECode;

/**
 *
 * @author Naveen
 */
public class simpletrick {

	// this program explain the concept of why we are using the public static void
	// main(String[] args) in java for all program
	// usage of typecasting concept
	// calling methods with out creating the object by using the static key word in
	// the methods setName

	public static void main(String[] args) {
		// float avg = (2+3)/2;
		// long avg = (2 + 3)/2;
		double x, y;
		x = 2.0;
		y = 3.0;
		double avg = (x + y) / 2;
		System.out.println(avg);
		simpletrick t = new simpletrick();
		setName();
	}

	public static void setName() {
		System.out.println("Architect");
	}
}