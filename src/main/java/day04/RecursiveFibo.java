package day04;

public class RecursiveFibo {
    //Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.
    public static void main(String[] args) {
       /* int sayi=9;
        int b1=1;
        int b2=1;
        int temp=0;
        for (int i = 0; i <sayi ; i++) {
            if (b1==1&b2==1){
                System.out.print("0 ");
            }
            temp=b1+b2;
            System.out.print(b1+" ");
            b1=b2;
            b2=temp;
        }

        */


        System.out.println(fibo(9));
    }
    public static int fibo(int sayi){
        if (sayi==1||sayi==2){
            return 1;
        }
        return fibo(sayi-1)+fibo(sayi-2);
    }
}
