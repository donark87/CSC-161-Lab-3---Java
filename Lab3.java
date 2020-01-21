// Donark Patel
// CSC 161-60
// Lab 3
// Date - 2/6/2018

public class Lab3

{
	public static void main (String [] args)
	{
		// Variables
		float roomOne, roomOneSideA, roomOneSideB; //Room 1 and it's With and length.
		float roomTwo, roomTwoSideA, roomTwoSideB; //Room 2 and it's With and length.
		float roomThree, roomThreeSideA, roomThreeSideB; //Room 3 and it's With and length.
		float costPerSquareFeetRoom1, costPerSquareFeetRoom2, costPerSquareFeetRoom3, costRoom1, costRoom2, costRoom3;
		float totalArea, totalCost;
		// assiments
		roomOneSideA = 12f;
		roomOneSideB = 16f;

		roomTwoSideA = 10f;
		roomTwoSideB = 10f;

		roomThreeSideA = 15f;
		roomThreeSideB = 17f;

		costPerSquareFeetRoom1 = 2; // Cost of carpet per square feet.
		costPerSquareFeetRoom2 = 3;
		costPerSquareFeetRoom3 = 4;
		// Calculation
		roomOne = roomOneSideA  * roomOneSideB; // Calculating the area of room 1
		costRoom1 = costPerSquareFeetRoom1 * roomOne;  // Calculating the cost of room 1

		roomTwo = roomTwoSideA * roomTwoSideB; // Calculating the area of room 2
		costRoom2 = costPerSquareFeetRoom2 * roomTwo; 		// Calculating the cost of room 2

		roomThree = roomThreeSideA * roomThreeSideB; // Calculating the area of room 3
		costRoom3 = costPerSquareFeetRoom3 * roomThree;		// Calculating the cost of room 3

		totalArea = roomOne + roomTwo + roomThree; // Total area of all 3 rooms
 		totalCost = costRoom1 + costRoom2 + costRoom3; // Calculating total cost


		// Output
		System.out.printf("%32s","Worldwide Carpet");
		System.out.printf("\n%63s","Date ");
		System.out.println(java.time.LocalDate.now());
		System.out.printf("%72s","Invoice # 1234");
		System.out.println("\n");
		System.out.println("-------------------------------------------------------------------------");
		System.out.printf("\n%s %33s %15s %15s","Room", "Area", "Cost/Sq.Ft", "Cost" );
		System.out.printf("\n%s %.1f %1s %.1f %1s %10.2f %4s %5.2f %1s %9s %8.2f", "Room 1",roomOneSideA,"L(Ft)",roomOneSideB,"W(Ft)",roomOne,"$",costPerSquareFeetRoom1,"Sq.Ft","$",costRoom1);
		System.out.printf("\n%s %.1f %1s %.1f %1s %10.2f %4s %5.2f %1s %9s %8.2f", "Room 2",roomTwoSideA,"L(Ft)",roomTwoSideB,"W(Ft)",roomTwo,"$",costPerSquareFeetRoom2,"Sq.Ft","$",costRoom2);
		System.out.printf("\n%s %.1f %1s %.1f %1s %10.2f %4s %5.2f %1s %9s %8.2f", "Room 3",roomThreeSideA,"L(Ft)",roomThreeSideB,"W(Ft)",roomThree,"$",costPerSquareFeetRoom3,"Sq.Ft","$",costRoom3);
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.printf("\n%s %28.2f", "Total area",totalArea);
		System.out.printf("\n%s %55s %8.2f", "Total cost","$",totalCost);
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.println("\n");


		System.out.println("Donark patel");
		System.out.println("Lab3");
		System.out.println("---------\n\n");
	}
}
