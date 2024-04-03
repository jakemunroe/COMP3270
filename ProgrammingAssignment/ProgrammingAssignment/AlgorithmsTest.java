import java.util.*;

public class AlgorithmsTest extends Algorithms {

    public static void main(String[] args) {
        
        Random random = new Random();

        int input[] = new int[10];
        int p = 0;
        int q = input.length - 1;

        int max = 21474800; //max value of integer in java
        int min = -21474830; //min value of integer in java

        for(int i = 0; i < input.length; i++) {
            input[i] = random.nextInt(max - min) + min;
            System.out.print(input[i] + ", ");
        }

        int algo1 = Algorithms.algorithm1(input);
        int algo2 = Algorithms.algorithm2(input);
        int algo3 = Algorithms.maxSum(input, p, q);
        int algo4 = Algorithms.algorithm4(input);

        if(algo1 < 1) {
            algo1 = 0;
        }

        if(algo2 < 1) {
            algo2 = 0;
        }

        if(algo3 < 1) {
            algo3 = 0;
        }

        if(algo4 < 1) {
            algo4 = 0;
        }

        System.out.print("\nAlgorithm 1: " + algo1 + "\nAlgorithm 2: " + algo2
                        + "\nAlgorithm3: " + algo3 + "\nAlgorithm4: " + algo4);
    }
    
}
