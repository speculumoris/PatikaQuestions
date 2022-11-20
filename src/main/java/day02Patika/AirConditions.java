package day02Patika;

import java.util.Scanner;

public class AirConditions {
    /*
    Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the weather's celcius: ");
        int airCelci= scan.nextInt();

        if(airCelci<0){
            System.out.println("We recommend you to ski");
        } else if (airCelci<15) {
            System.out.println("Air is very cold so We recommend you to go to cinema with your partner ");
        } else if (airCelci < 25) {
            System.out.println("why don't you go to the countryside to have a picnic with your family");
        } else {
            System.out.println("The weather is very hot.We recommend you to go to swim at the beach");
        }
    }
}
