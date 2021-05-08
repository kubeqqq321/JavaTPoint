package ToLeftRotateElements_3;

public class ToLeftRotateElements {


    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int n = 10; // n determine the number of times an array should be rotated

        System.out.println("Original Array");
        for(int i : arr1){
            System.out.print(i + " ");
        }//for

        //Rotate the given array by n times toward left
        for (int i = 0; i<n;i++){
            int j;
            //store the first element of the array
            int first = arr1[0];

            for(j = 0 ;j<arr1.length-1;j++)
                arr1[j] = arr1[j+1];

            arr1[j] = first;
        }//for

        System.out.println("\nArray left rotation");
        for(int i: arr1){
            System.out.print(i + " ");
        }
        System.out.println("");

    }//main
}//class
