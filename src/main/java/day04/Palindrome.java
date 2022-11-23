package day04;

public class Palindrome {
    //Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
    //
    //Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
    public static void main(String[] args) {
       palindromeNum(10);
        palndrome(1012);
    }

    private static void palindromeNum(int a) {
        String ba=String.valueOf(a);
        int i=ba.length()-1;
        String k="";
        while(i>-1){
            String c=ba.substring(i,i+1);
            k+=c;
            i--;
        }
        if (k.equals(ba)){
            System.out.println("palindrome'dur");
        }else System.out.println("degildir");
    }
    private static void palndrome(int a){
        int temp=a;
        int reverseNumber=0;
        while (temp!=0) {
            int yeniSayi = temp % 10;
            reverseNumber=(reverseNumber * 10)+yeniSayi;
            temp/=10;
        }
        if (a==reverseNumber){
            System.out.println("palindrome'dur");
        }else System.out.println("degildir");

    }
}
