package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

//        int[] nums = {1, 1, 2, 3, 5,};
//        for (int i : nums) {
//            if (i % 2 == 1) {
//                System.out.print(i);
//            }
//        }

        String poem = "I would not, could not, in a " +
                "box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not " +
                "eat them with a mouse.";
        String[] words = poem.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = poem.split("\\. ");
        System.out.println(Arrays.toString(sentences));
    }

}
