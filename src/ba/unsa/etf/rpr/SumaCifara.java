package ba.unsa.etf.rpr;

public class SumaCifara(int broj) {
    int suma;
    while(broj!=0){
        int temp = broj;
        temp = temp%10;
        suma += temp;
        broj = broj/10;
        }
    return suma;
}
