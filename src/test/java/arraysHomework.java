import java.util.Scanner;

public class arraysHomework {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print ("Enter array size :");
        int arraySize = console.nextInt();

        int [] myArray = new int[arraySize];
        int countPosValue = 0;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter value :");
            myArray [i] = console.nextInt();
            if (myArray [i] > 0) {
                countPosValue++;
            }
        }
        int [] resultArray = new int[countPosValue];
        int positiveCount = 0;
        for (int j = 0; j < myArray.length; j++) {
            if (myArray [j] > 0) {
                resultArray [positiveCount] = myArray[j];
                positiveCount++;
            }
        }

        for (int x : resultArray) {
            System.out.println("[" + x + "]");
        }
    }



}

