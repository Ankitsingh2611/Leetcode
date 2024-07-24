public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371; // input number
        boolean isArmstrong = isArmstrong(num);
        System.out.println(num + " is " + (isArmstrong ? "an Armstrong number" : "not an Armstrong number"));
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digitCount = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digitCount);
            num /= 10;
        }

        return sum == originalNum;
    }
}