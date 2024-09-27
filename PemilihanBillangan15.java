import java.util.Scanner;

/**
 * PemilihanBillangan15
 */
public class PemilihanBillangan15 {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukkan angka:  ");
        int angka = input15.nextInt();
        
        if (angka % 2 == 0)
            System.out.println("Angka "+angka+" bilangan genap");
        else
            System.out.println("Angka "+angka+" bilangan ganjil");
    }
}
    
