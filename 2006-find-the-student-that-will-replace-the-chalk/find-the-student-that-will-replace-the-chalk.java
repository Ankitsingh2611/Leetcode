class Solution {
    public int chalkReplacer(int[] chalk, int k) {
    int n = chalk.length;
    long totalChalk = 0;
    for (int i : chalk) {
        totalChalk += i;
    }
    k %= totalChalk;
    for (int i = 0; k >= 0; i = (i + 1) % n) {
        k -= chalk[i];
        if (k < 0) {
            return i;
        }
    }
    return -1; // unreachable
    }
}