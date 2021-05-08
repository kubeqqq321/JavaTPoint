package CopyToAnotherArray_1;

public class CopyToAnotherArray {

    public static void main(String[] args) {

            int[] arr1 = new int[]{12,32,3,6,11,6,10,8};

            int[] arr2 = new int[arr1.length];

            for(int i = 0; i < arr1.length; i++){
                arr2[i] = arr1[i];
            }

            System.out.print("\nElements of original array: ");
            for(int i : arr1){
                System.out.print(i + ", ");
            }


            System.out.print("\n\nElements of new array: ");
            for(int i : arr2){
                System.out.print(i + ", ");
            }

        }
}
