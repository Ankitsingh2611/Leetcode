class Solution {
    public int findMinDifference(List<String> timePoints) {
         // Convert time points to minutes
        List<Integer> minutes = new ArrayList<>();
        for (String time : timePoints) {
            String[] parts = time.split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            minutes.add(hour * 60 + minute);
        }

        // Sort the time points
        Collections.sort(minutes);

        // Calculate the differences
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < minutes.size(); i++) {
            int diff = minutes.get(i) - minutes.get(i - 1);
            minDiff = Math.min(minDiff, diff);
        }

        // Handle the wraparound case
        int wraparoundDiff = minutes.get(0) + 1440 - minutes.get(minutes.size() - 1);
        minDiff = Math.min(minDiff, wraparoundDiff);

        return minDiff;
    }
}