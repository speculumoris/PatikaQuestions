package day05patika;

public class AwithMDA {
    //Multidimesnsional array kullanarak a harfi yazdirin
    // *  *  *  *
    // *        *
    // *        *
    // *  *  *  *
    // *        *
    // *        *
    // *  *  *  *
    public static void main(String[] args) {
        String arr[][]=new String[9][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==0 || i==(int)((arr.length-1)/2)|| i== arr.length-1){
                    arr[i][j]=" * ";
                } else if (j==3||j==0) {
                    arr[i][j]=" * ";
                }else{
                    arr[i][j]="   ";
                }

            }
            System.out.println();
        }
        for (String[] w:arr) {
            for (String a:w) {
                System.out.print(a);

            }
            System.out.println();
        }
    }
}
