import java.util.Scanner;

public class TekrarlananCiftSayilar {

  public static void main(String[] args) {

    // Scanner sınıfını kullanarak kullanıcıdan giriş al.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Dizideki sayıları giriniz: ");
    int[] dizi = new int[scanner.nextInt()];
    for (int i = 0; i < dizi.length; i++) {
      dizi[i] = scanner.nextInt();
    }

    // Diziyi tarayıp tekrar eden çift sayıları bul.
    boolean[] gorulenler = new boolean[dizi.length];
    for (int i = 0; i < dizi.length; i++) {
      if (dizi[i] % 2 == 0 && !gorulenler[i]) {
        System.out.println(dizi[i]);
        gorulenler[i] = true;
      }
    }
  }
}

