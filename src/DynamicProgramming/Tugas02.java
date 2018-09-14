package DynamicProgramming;
import java.util.Scanner;
public class Tugas02 {
    public static void main(String[] args) 
    {
        System.out.println("Khairis Ghifariy Lubabah / XR3 / 15");
        System.out.println("");
        
        Scanner baca = new Scanner(System.in);
        
        double e = 0, d = 0 , b = 0, a = 0, c = 0, t;
        double [] y = new double [] {4, 5, 2, 7, 3};
        int n;
        
        System.out.println("LIST JENIS BARANG, BERAT, DAN BAYARAN");
        System.out.println("-----------------------------------------------");
        System.out.println("Jenis Barang A : Berat - 4kg, Bayaran - Rp5000");
        System.out.println("Jenis Barang B : Berat - 5kg, Bayaran - Rp7000");
        System.out.println("Jenis Barang C : Berat - 2kg, Bayaran - Rp2000");
        System.out.println("Jenis Barang D : Berat - 3kg, Bayaran - Rp3000");
        System.out.println("Jenis Barang E : Berat - 7kg, Bayaran - Rp10000");
        System.out.println("-----------------------------------------------");
        System.out.println("");
        
        System.out.print("Berat Max : ");
        n = baca.nextInt(); 
        System.out.println("");
    }
}
