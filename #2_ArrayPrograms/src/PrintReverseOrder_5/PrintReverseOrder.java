package PrintReverseOrder_5;

public class PrintReverseOrder {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original Array:");
        for (int i : array)
            System.out.print(i + ", ");


        System.out.println("");
        System.out.println("Reverse Array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }


    }

}