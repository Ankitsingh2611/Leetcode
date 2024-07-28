public class EvenDaysInAugust {
    public static void main(String[] args) {
        int daysInAugust = 31; // Total number of days in August
        int countEvenDays = 0; // Counter for even days

        // Loop through the days of August
        for (int day = 1; day <= daysInAugust; day++) {
            // Check if the day is even
            if (day % 2 == 0) {
                countEvenDays++; // Increment the counter for even days
            }
        }

        // Output the result
        System.out.println("Kunal can go out with his friends on " + countEvenDays + " even days in August.");
    }
}
