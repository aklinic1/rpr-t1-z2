package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    public static int SumaCifara(int broj) {
        int suma=0;
        while(broj!=0){
            int temp = broj;
            temp = temp%10;
            suma += temp;
            broj = broj/10;
        }
        return suma;
    }

    public static void main(String[] args) {

        System.out.println("Unesite n: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i ;
        System.out.println("Brojevi koji su djeljivi sumom svojih cifara su :");
        for(i = 1; i <= n; i++)
            if(i % SumaCifara(i) == 0) System.out.println(i + " ");

    }
}

