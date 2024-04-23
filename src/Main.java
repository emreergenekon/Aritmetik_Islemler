import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Girin: ");
        a = input.nextDouble();
        System.out.print("İkinci Sayıyı Girin: ");
        b = input.nextDouble();
        System.out.print("Üçüncü Sayıyı Girin: ");
        c = input.nextDouble();

double toplam = (a + b * c-b);

        System.out.println("Sonucunuz: " + toplam);

    }
}