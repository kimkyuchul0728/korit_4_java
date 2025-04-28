package ch12_arrays;

public class Array05 {
    public static void main(String[] args) {
        String[] scores = {"A", "B", "C", "D", "F"};
        for (int i = 0 ; i < scores.length ; i++) {
            scores[i] += "+";
            System.out.print(scores[i] + " / ");
        }

    }
}
