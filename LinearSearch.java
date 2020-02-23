public class LinearSearch {
  public static void main(String[] args) {
    // Declare an integer array
    int[] list = { 10, 35, 13, 1, 8, 20, 33, 23, 4, 19 };

    int k = 20; // Let k be the value to search for
    int i = 0; // Start search at beginning
    boolean found = false; // Value not found at start

    // Continue to search until end or value found
    while (i < list.length && found == false) {
      // Check current item
      if (list[i] == k)
        // We have found the value
        found = true;
      else
        // Move onto the next value
        i = i + 1;
    }
    // Have we found the value?
    if (found == true)
      System.out.printf("Value %d found at index %d\n", k, i);
    else
      System.out.printf("Value %d not found\n", k);

  }
}