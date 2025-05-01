public class jev3 {
    public static void main(String[] args) {
        // Check if exactly 10 numbers are provided
        if (args.length != 10) {
            System.out.println("Please enter exactly 10 numbers.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;

        // Iterate through the numbers
        for (String arg : args) {
            int number = Integer.parseInt(arg); // Convert the argument to an integer

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Display the results
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
