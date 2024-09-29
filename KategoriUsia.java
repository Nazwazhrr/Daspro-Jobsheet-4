import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int usia;

        System.out.println("-----Program Kategori Usia-----");
        System.out.println("Masukkan Usia Anda:  ");
        usia = input.nextInt();

        if (usia >= 0 && usia <= 12){
            System.out.println("Kategori usia anda : Anak");
        }else if(usia >= 13 && usia <= 19){
            System.out.println("Kategori usia anda : Remaja");
        }else if(usia >=20 && usia <= 64){
            System.out.println("Kategori usia anda : Dewasa");
        }else if(usia >=65){
            System.out.println("Kategori usia anda : Lansia");
        }else{
            System.out.println("Tidak ada dalam kategori apapun");
        }

    }

    
}
