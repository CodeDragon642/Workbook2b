public class Main {
    public static void main(String[] args){
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        //System.out.println(cars[0]); //calling the element at index 0
        System.out.println("The length of the array is " + cars.length);

        //there are 3 ways to print the whole array
        //print each element one after the other
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[1]);
        System.out.println(cars[3]);

        //using a for loop
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i] + " ");
        }
        //for each loop - call both variable and array and only print variable
        for (String x : cars){
            System.out.println(x);
        }

    }
}