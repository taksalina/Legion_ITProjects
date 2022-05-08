package loopsAssignment;

public class Loops {
    public static void main(String[] args) {
        Loops loops = new Loops();
        loops.positiveIntegers();
        loops.numbers(10);


    }

    //    The code should be able to print all the positive integers from 1 to 100.
//    Additional requirements:
//    Print messages should contain the following details:
//    In the output, state whether each integer is ‘odd’ or ‘even’ in the output. ( *tip  (i % 2 == 0) will return true if  is odd)
//    If the number is divisible by three, instead of stating that the number is odd or even, state that the number is ‘divisible by three’.
//    If the number is divisible by both two and three, instead of saying that the number is odd, even or divisible by three; state that the number is ‘divisible by two and three’.
//    Design the logic of the loop to be as efficient as possible, using the minimal number of operations to perform the required logic.
    public void positiveIntegers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("The number " + "'" + i + "'" + " is divisible by two and three");
            }
            if (i % 3 == 0) {
                System.out.println("The number " + "'" + i + "'" + " is divisible by three");
            } else if (i % 2 == 0) {
                System.out.println("The number " + "'" + i + "'" + " is even");
            } else {
                System.out.println("The number " + "'" + i + "'" + " is odd ");
            }

        }

    }

    // Create a method that will receive 2 numbers and calculate the summary of all the numbers between them.
    public void numbers(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }


    }


}



