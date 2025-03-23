import java.util.Random;

public class Roulette {
    

    public static void main(String[]args){
        double [] fitness = {0.1, 0.2, 0.3, 0.4};

        int selection = RouletteWheelSelect(fitness);

        System.out.println("Selected index: " + selection);
        
    }
    public static int RouletteWheelSelect (double []fitness){
        double totalfitness = 0; 

        for (double fit : fitness){
            totalfitness += fit;
        }

        double randomValue = new Random().nextDouble() * totalfitness;

        double cumulativeFitness = 0;

        for (int i = 0; i < fitness.length; i++){
            cumulativeFitness += fitness[i];

            if (randomValue < cumulativeFitness){
                return i;
            }
        }
        return -1;
    }
}
