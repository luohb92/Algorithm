package LeetCode;

public class Problem299 {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] secretNum = new int[10];
        int[] guessNum = new int[10];
        for(int i = 0; i < secret.length(); ++i) {
            if(secret.charAt(i) == guess.charAt(i)) {
                ++ bulls;
            } else {
                secretNum[secret.charAt(i) - '0']++;
                guessNum[guess.charAt(i) - '0']++;
            }
        }
        for(int i = 0; i < 10; ++i) {
            cows += Math.min(secretNum[i], guessNum[i]);
        }
        return bulls + "A" + cows + "B";
    }
}
