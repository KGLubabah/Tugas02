package DynamicProgramming;
import java.util.Scanner;
import java.math.BigInteger;
public class Tugas01 {
    private static int input()
    {
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Uang  Anda : ");
        int uang = baca.nextInt();
        System.out.println("");
        
        return uang;
    }
    
    private static void JumlahUang(int uang, int[] data)
    {
        for (int i = 0; i < data.length; i++) 
        {
            int N = 0;
            while (uang >= data[i])
            {
                uang = uang - data[i];
                N++;
            }
            
            if (data[i] == 5000 || data[i] == 2000 || data[i] == 1000)
            {    
                System.out.println("Banyak Pecahan " + data[i] + " Sebanyak : " + N + " Lembar");
            }
            else
            {
                System.out.println("Banyak Pecahan " + data[i] + " Sebanyak : " + N + " Koin");
            }
        }
    }
    
    
    
    public static void main(String[] args) 
    {
        System.out.println("Khairis Ghifariy Lubabah / XR3 / 15");
        System.out.println("");
        
        System.out.println("--------------------------------");
        System.out.println("Hitung Jumlah Pecahan Minimal");
        System.out.println("--------------------------------");
        System.out.println("");
        
        System.out.println("Pecahan Yang Tersedia");
        System.out.println("100, 500, 1000, 2000, 5000");
        System.out.println("");
        
        int uang = input();
        int [] data = new int[] {5000, 2000, 1000, 500, 100};
        
        JumlahUang(uang, data);
    }
}
