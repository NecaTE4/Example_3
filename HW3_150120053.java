//Name: Necati
//Surname: Koçak
//Student ID: 150120053

/*Problem: Write a program that draws the coordinate system and some geometric shapes on the console screen as described below.
Ask the user to select one of the following shapes:
1. Line
2. Rectangle
3. Triangle
4. Parabola
5. Circle */

import java.util.Scanner; //Scanner is in the java.util package

public class HW3_150120053 {

	public static void main(String[] args) {
		// We create a Scanner object
		Scanner input = new Scanner(System.in);
		// We write while to keep the code running until user enter the exit value.
		while (true) {
			// Prompt the user to enter what shape you want to draw.

			System.out.print("Which shape would you like to draw?"
					+ "\n1. Line\n2. Triangle\n3. Rectangle\n4. Parabola\n5. Circle\n6. Exit\n");
			int draw = input.nextInt();
			int x1, y1, x2, y2, x3, y3, x4, y4, c, r;
			double slope1, slope2, slope3, slope4, sloped1, sloped3;
			// We use switch case to enter the desired shape.
			switch (draw) {

			case 1:

				System.out.print("Line formula is y = ax + b\nPlease enter the coefficients a and b:");
				x1 = input.nextInt();

				y1 = input.nextInt();
				// We write the line equation for the first case. We use for to extract the
				// coordinate plane and mark the required values.
				for (int y = 10; y >= -11; y--) {
					for (int x = -10; x <= 11; x++) {
						if (y == 0) {
							if ((x1 * x + y1) == 0)
								System.out.print("*");
							else if (x == 0)
								System.out.print("|");
							else if (x == 11)
								System.out.print("x");
							else
								System.out.print("-");
						} else if ((x1 * x + y1) == y)
							System.out.print("*");
						else if (x == 0) {
							if (y == 10)
								System.out.print("y");
							else
								System.out.print("|");
						} else
							System.out.print(" ");
					}
					System.out.println();
				}
				System.out.println();
				break;

			case 2:
				System.out.print(
						"For triangle, we need the coordinates of the points for three vertices.\nPlease enter the coordinates of 3 vertices a, b, c, d, e, f:");
				// For the second case we print a triangle. Again we use for in the same way. We find the sides of the triangle and select the range to print with max and min.
				x1 = input.nextInt();
				y1 = input.nextInt();
				x2 = input.nextInt();
				y2 = input.nextInt();
				x3 = input.nextInt();
				y3 = input.nextInt();

				slope1 = (double) (y2 - y1) / (double) (x2 - x1);
				slope2 = (double) (y3 - y2) / (double) (x3 - x2);
				slope3 = (double) (y3 - y1) / (double) (x3 - x1);

				for (int y = 10; y >= -11; y--) {
					for (int x = -10; x <= 11; x++) {

						if (((slope1) * (x - x2) == (y - y2) || (x1 == x2))
								&& (x <= Math.max(x1, x2) && x >= Math.min(x1, x2))
								&& (y >= Math.min(y1, y2) && y <= Math.max(y1, y2)))
							System.out.print("*");
						else if ((slope2 * (x - x2) == (y - y2) || (x2 == x3))
								&& (x <= Math.max(x3, x2) && x >= Math.min(x3, x2))
								&& (y >= Math.min(y3, y2) && y <= Math.max(y3, y2)))
							System.out.print("*");
						else if ((slope3 * (x - x1) == (y - y1) || x1 == x3)
								&& (x <= Math.max(x1, x3) && x >= Math.min(x3, x1))
								&& (y >= Math.min(y3, y1) && y <= Math.max(y3, y1)))
							System.out.print("*");
						else if (y == 0) {
							if (x == 0)
								System.out.print("|");
							else if (x == 11)
								System.out.print("x");
							else
								System.out.print("-");
						}

						else if (x == 0) {
							if (y == 10)
								System.out.print("y");
							else
								System.out.print("|");
						} else
							System.out.print(" ");
					}
					System.out.println();
				}
				System.out.println();
				break;

			case 3:
				System.out.print(
						// In the same way, we print the coordinate plane with the for, find the slopes and print the values between.
						"For rectangle, we need the coordinates of the points for three vertices.\nPlease enter the coordinates of 3 vertices a, b, c, d, e, f: ");

				x1 = input.nextInt();
				y1 = input.nextInt();
				x2 = input.nextInt();
				y2 = input.nextInt();
				x3 = input.nextInt();
				y3 = input.nextInt();

				sloped1 = (double) (y2 - y1) / (double) (x2 - x1);
				sloped3 = (double) (y3 - y1) / (double) (x3 - x1);

				if (sloped3 * sloped1 == -1 || x3 == x1) {
					x4 = x2;
					x2 = x1;
					x1 = x4;

					y4 = y2;
					y2 = y1;
					y1 = y4;

				}

				x4 = x1 + x3 - x2;
				y4 = y1 + y3 - y2;

				slope1 = (double) (y2 - y1) / (double) (x2 - x1);
				slope2 = (double) (y3 - y2) / (double) (x3 - x2);
				slope3 = (double) (y4 - y3) / (double) (x4 - x3);
				slope4 = (double) (y4 - y1) / (double) (x4 - x1);

				if (slope1 * slope2 == -1 || (x1 == x2) || (x3 == x2) || (x4 == x3) || (x4 == x1)) {

					for (int y = 10; y >= -11; y--) {
						for (int x = -10; x <= 11; x++) {

							if (((slope1) * (x - x2) == (y - y2) || (x1 == x2))
									&& (x <= Math.max(x1, x2) && x >= Math.min(x1, x2))
									&& (y >= Math.min(y1, y2) && y <= Math.max(y1, y2)))
								System.out.print("*");
							else if ((slope2 * (x - x2) == (y - y2) || (x3 == x2))
									&& (x <= Math.max(x3, x2) && x >= Math.min(x3, x2))
									&& (y >= Math.min(y3, y2) && y <= Math.max(y3, y2)))
								System.out.print("*");
							else if ((slope3 * (x - x3) == (y - y3) || (x3 == x4))
									&& (x <= Math.max(x4, x3) && x >= Math.min(x3, x4))
									&& (y >= Math.min(y3, y4) && y <= Math.max(y3, y4)))
								System.out.print("*");
							else if ((slope4 * (x - x4) == (y - y4) || (x1 == x4))
									&& (x <= Math.max(x4, x1) && x >= Math.min(x1, x4))
									&& (y >= Math.min(y1, y4) && y <= Math.max(y1, y4)))
								System.out.print("*");
							else if (y == 0) {
								if (x == 0)
									System.out.print("|");
								else if (x == 11)
									System.out.print("x");
								else
									System.out.print("-");
							}

							else if (x == 0) {
								if (y == 10)
									System.out.print("y");
								else
									System.out.print("|");
							} else
								System.out.print(" ");
						}
						System.out.println();
					}
					System.out.println();
				} else
					// Shows this to the user if the points do not form a rectangle.
					System.out.println("Unfortunately, rectangles are not drawn with these points.");
				break;
			case 4:

				// After entering the necessary values and putting it into the for loop, we draw the parabola.
				System.out.print("Parabola formula is y = ax^2 + bx + c\nPlease enter the coefficients a, b and c:");
				x1 = input.nextInt();
				y1 = input.nextInt();
				c = input.nextInt();

				for (int y = 10; y >= -11; y--) {
					for (int x = -10; x <= 11; x++) {
						if (y == 0) {
							if ((x1 * x * x + y1 * x + c) == 0)
								System.out.print("*");
							else if (x == 0)
								System.out.print("|");
							else if (x == 11)
								System.out.print("x");
							else
								System.out.print("-");
						} else if ((x1 * x * x + y1 * x + c) == y)
							System.out.print("*");
						else if (x == 0) {
							if (y == 10)
								System.out.print("y");
							else
								System.out.print("|");
						} else
							System.out.print(" ");
					}
					System.out.println();
				}
				System.out.println();

				break;
			case 5:
				// We do the same operations for the circle and print the values in the formulas.
				System.out.print(
						"Circle formula is (x-a)^2 + (y-b)^2 = r^2\nPlease enter the coordinates of the center (a,b) and the radius");

				x1 = input.nextInt();
				y1 = input.nextInt();
				r = input.nextInt();

				for (int y = 10; y >= -11; y--) {
					for (int x = -10; x <= 11; x++) {
						if (y == 0) {
							if (((x - x1) * (x - x1) + (y - y1) * (y - y1)) == 0)
								System.out.print("*");
							else if (x == 0)
								System.out.print("|");
							else if (x == 11)
								System.out.print("x");
							else
								System.out.print("-");
						} else if (((x - x1) * (x - x1) + (y - y1) * (y - y1)) == r * r)
							System.out.print("*");
						else if (x == 0) {
							if (y == 10)
								System.out.print("y");
							else
								System.out.print("|");
						} else
							System.out.print(" ");
					}
					System.out.println();
				}
				System.out.println();

				break;
			case 6:
				// If the user enters the value 6, we exit the loop and finish
				System.exit(0);
				;
			}
		}
	}
}
