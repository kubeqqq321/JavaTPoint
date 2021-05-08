package PrintDuplicateElements_4;

public class PrintDuplicateElements {

    public static void main(String[] args) {
        //Initialize array
        int[] arr1 = new int[]{1,1,2,2,3,4,5,6,5,6,7,};

        System.out.println("Duplicates elements in Array");
        //search duplicated elements in the array
        //work only with pair of number like in the arr1
        for (int i = 0 ;i< arr1.length ; i++){
            for (int j = i+1 ; j < arr1.length ; j++){
                if (arr1[i] == arr1[j]){
                    System.out.print(arr1[j]+", ");
                }//if
            }//for j

        }//for i


    }


}
