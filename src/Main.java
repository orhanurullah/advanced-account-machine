import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String menu = "1- Toplama İşlemi \n" +
                "2- Çıkarma İşlemi \n" +
                "3- Çarpma İşlemi \n" +
                "4- Bölme İşlemi \n" +
                "5- Üslü Sayı Hesaplama \n" +
                "6- Faktoriyel Hesaplama \n" +
                "7- Mod Alma \n" +
                "8- Dikdörtgen Alan ve Çevre Hesabı \n" +
                "0- Çıkış Yap";
        int select;
        do{
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz : ");
            select = scanner.nextInt();
            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    module();
                    break;
                case 8:
                    rectangleSquareAndAround();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }while(select != 0);

    }

    static void module(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Esas Sayıyı Girin : ");
        int num = scanner.nextInt();
        System.out.print("Mod Sayısını Girin : ");
        int mod = scanner.nextInt();

        System.out.println("Sonuç : " + num%mod);
    }
    static void rectangleSquareAndAround(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dikdörtgenin ilk kenar uzunluğu : ");
        int rectA = scanner.nextInt();
        System.out.print("Dikdörtgenin İkinci Kenar Uzunluğu : ");
        int rectB = scanner.nextInt();

        System.out.println("Girilen Dikdörtgenin Alanı : "
                + (rectA*rectB) + "\nÇevresi : " +
                (2 * (rectA+rectB)));


    }
    static void plus(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 0, i = 1;
        while(true){
            System.out.print(i++ + ". sayı : ");
            number = scanner.nextInt();
            if(number == 0){
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Adet Sayı Gireceksiniz : ");
        int counter = scanner.nextInt();
        int number, result = 0;
        for(int i = 1; i <= counter; i++){
            System.out.print(i + ". sayı : ");
            number = scanner.nextInt();
            if(i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void times(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 1, i = 1;
        while(true){
            System.out.print(i++ + ". sayı : ");
            number = scanner.nextInt();
            if(number == 1){
                break;
            }
            if(number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void divided(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for(int i = 1; i <= counter; i++){
            System.out.print(i + ". sayi : ");
            number = scanner.nextDouble();
            if(i != 1 && number == 0){
                System.out.println("Böleni 0 Giremezsiniz.");
                continue;
            }
            if(i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void power(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz : ");
        int base = scanner.nextInt();
        System.out.println("Üs Değerini Giriniz : ");
        int exponent = scanner.nextInt();

        int result = 1;
        for(int i = 1; i <= exponent; i++){
            result *= base;
        }

        System.out.println("Sonuç : " + result);

    }

    static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı Giriniz : ");
        int num = scanner.nextInt();
        int result = 1;
        for(int i = num; i > 1; i--){
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }


}
