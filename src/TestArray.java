public class TestArray {
    public static void main (String[] args){
        //initialise integer of sum and integer array
        int sum = 0;
        int[] numbers = {6, 4, 34, 1, 75, 98, 45, 11, 23, 2};
        //int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //use a loop to sum the array into the sum variable
        for (int i = 0; i <numbers.length; i++){
            //check calculation is working with System.out.println(sum + " ");
            sum += numbers[i];
        }
        //print out the total/sum variable
        System.out.println("The total of the array is " + sum);
        //make the sum variable a double, so it will calculate with the other double
        //now calculate and print out the average
        double average = (double) sum/numbers.length;
        System.out.println("The average of the array is " + average);
    }
}