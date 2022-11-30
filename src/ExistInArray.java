import java.util.Scanner; //import the scanner

public class ExistInArray {
    public static void main(String[] args) {
        //create an integer array and prefill with values, and tell the user about the array
        int[] numArray = {2, 14, 13, 2, 6, 17, 4, 19, 10, 7, 8};
        System.out.println("The array 'numArray' contains 11 numbers between 1 and 20.");
        //initialise the scanner
        Scanner myObj = new Scanner(System.in);
        //ask the user to input a value to search for in the array
        System.out.println("Please enter a whole number between 1 and 20 to search for in the array.");
        int userNumber = myObj.nextInt();
        //initialise a boolean to check whether the number is in the array as false
        boolean numFound = false;
        //now search the array for the value by checking the number against each number in the index
        for (int i = 0; i < numArray.length; i++){
            if (numArray[i] == userNumber){
                numFound = true;
            }
        }
        if (numFound == true) {
            System.out.println("The value " + userNumber + " was found in the array!");
        }
        else{
            System.out.println("The value " + userNumber + " was not found in the array!");
        }
        //instead of using boolean true or false, i could use an integer to check instead: valueFind = 0 for not found and 1 for found.
    }
}
