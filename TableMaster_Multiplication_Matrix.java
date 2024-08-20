package tableMaster_Multiplication_Matrix;

public class TableMaster_Multiplication_Matrix {
  
  public static void main(String[] args) {
    // Display the table heading
    System.out.println("           Multiplication Table");

    // Display the number title (1 to 9)
    System.out.print("    ");
    for (int j = 1; j <= 9; j++) {
      System.out.print("   " + j);
    }

    // Print a separator line
    System.out.println("\n-----------------------------------------");

    // Print the body of the multiplication table
    for (int i = 1; i <= 9; i++) {  // Outer loop for rows (1 to 9)
      System.out.print(i + " | ");  // Print the row header
      for (int j = 1; j <= 9; j++) {  // Inner loop for columns (1 to 9)
        // Print the product of the current row and column, formatted with spaces
        System.out.printf("%4d", i * j);
      }
      // Move to the next line after printing all columns for the current row
      System.out.println();
    }
  }
}
