package FrequencyOfElements_2;

public class FrequencyOfElements {

    public static void main(String[] args) {

        int[] Array = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1, 1, 2, 3, 4, 5, 4, 3};

        int[] Frequency = new int[Array.length];
        int visited = -1;

        for (int i = 0 ; i<Array.length;i++) {
            int counter = 1;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] == Array[j]) {
                    counter++;
                    Frequency[j] = visited;
                }//if
            }//for
            if (Frequency[i] != visited) {
                Frequency[i] = counter;
            }//if
        }//for


        System.out.println("--------------------");
        System.out.println("Elements | Frequency");
        System.out.println("--------------------");
        for(int i = 0 ; i<Array.length;i++){
            if(Frequency[i] != visited){
                System.out.println("    " + Array[i] +"    |    " + Frequency[i] );
            }//if
        }//for
        System.out.println("--------------------");



    }//main

}//class
