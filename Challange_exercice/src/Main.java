// Create a function which receives as a parameters an array of numbers.
// The fuction should the biggerst number from that arrays of numbers.

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 7, 34, 25, 11};
        int maxFound = getMax(numbers);
        System.out.println(maxFound);
    }

    public static int getMax(int[] numbers) {
        int max = numbers[0]; //put the first element
        for (int number: numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}