package donguler;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        int sayi;
        double toplam = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi= scanner.nextInt();
        for(int i = 1; i<=sayi; i++){
            toplam += (1.0/i);
        }
        System.out.println(toplam);
    }
}
