public class Square {
    public int row;
    public int column;
    public boolean occupied;
    public String battleshipRef;
    public boolean shot;

    public Square(int x, int y, boolean occupied, String s, boolean shot) {
        row = x;
        column = y;
      //  occupied = checkIfShip();
      //  battleshipRef = ?;
      //   shot = checkIfShot();

    }
    public static void square(int rows, int columns) {

        Battleship ship1 = new Battleship(3, 4, "regular");  // instead of creating 6 variables, I made 3 objects called mine1,2 and 3
        Battleship ship2 = new Battleship(2, 10, "regular");  // the objects take the parameters that position them on the grid using x and y as coordinates
        Battleship ship3 = new Battleship(4, 8, "regular");

        System.out.print("   |");
        for (int i = 1; i <= columns; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();  // I'm printing out the first line

        System.out.print("   |");
        for (int i = 1; i <= columns; i++) {
            System.out.print("  -");
        }
        System.out.println();  // I'm printing out the second line

        for (int row = 1; row <= rows; row++) {
            System.out.printf("%2d |", row);
            for (int column = 1; column <= columns; column++) {     // this forloop goes through all columns one by one
                if (column == ship1.y && row == ship1.x) {          // if the column has mine1's coordinates (x and y) then we get x
                    System.out.print("  o");
                } else if (column == ship2.y && row == ship2.x) {   // if the column has mine2's coordinates (x and y) then we get x
                    System.out.print("  o");
                } else if (column == ship3.y && row == ship3.x) {  // if the column has mine3's coordinates (x and y) then we get x
                    System.out.print("  o");
                } else {
                    System.out.print("  -");                        // if not, all's good and we get o
                }
            }
            System.out.println();  // this loop prints out the rest of the table
        }
    }

    public static void main(String[] args) {
        square(10,10);
    }

}
