
import java.util.Random;


public class Divide_and_conquer {

    private static void mergesort(int[] inputArray){
         int inputLength = inputArray.length;

            if (inputLength < 2){
                return;
            }

            int mid = inputLength / 2;
            int [] lefthalf = new int[mid];
            int [] righthalf = new int[inputLength - mid];
            
            for (int i = 0;  i < mid; i++){
                lefthalf[i] = inputArray[i];
            }

            for (int i = mid; i < inputLength; i++){
                righthalf [ i - mid] = inputArray[i];
            }

            mergesort(lefthalf);
            mergesort(righthalf);

            merge(inputArray, lefthalf, righthalf);
    }

    private static void merge (int [] inputArray, int[]lefthalf, int []righthalf){
        int leftsize = lefthalf.length;
        int rightsize = righthalf.length;

        int i = 0;
        int j = 0;
        int k = 0; 
        
        while (i < leftsize && j < rightsize) {
            if (lefthalf[i] <= righthalf[j]){
                inputArray[k] = lefthalf[i]; 
                i++;
            }
            else{
                inputArray[k] = righthalf[j];
                j++;
            }
            k++;
        }
        while (i <  leftsize) {
            inputArray[k] = lefthalf [i];
            i++;
            k++;
        }
        while (j < rightsize){
            inputArray[k] = righthalf[j];
            j++;
            k++;
        }
    }

    private static void printArray (int[]numbers){
        for( int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Random num = new Random();

        int[] numbers = new int[10];

        for ( int i = 0; i < numbers.length; i++){
            numbers[i] = num.nextInt(4);
        }
        System.out.println("unsorted array:");
        printArray(numbers);

        mergesort(numbers);

        System.out.println("\nSorted array:");
        printArray(numbers);

    }
}
