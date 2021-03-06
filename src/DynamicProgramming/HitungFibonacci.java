package DynamicProgramming;
import java.util.Scanner;
import java.math.BigInteger;
public class HitungFibonacci {
    public static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    
        String identitas = "Khairis Ghifariy Lubabah / XR3 / 15";
        tampilJudul(identitas);
        
    private static int tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke-: ");
        int n = scanner.nextInt();
        
        return n;
    }
    
    int n tampilInput();
    
    private static BigInteger fibo(int n)
    {
        BigInteger[] hasil = new BigInteger[n];
        
        hasil[0] = BigInteger.ONE;
        hasil[1] = BigInteger.ONE;
        
        for (int i = 0; i < hasil.length; i++) 
        {
            hasil[i] = hasil[i-1].add(hasil[1-2]);
        }
        
        return hasil[n-1];
    }
    
    BigInteger hasil = fibo(n);
    
    private static void tampilHasil(int n, BigInteger hasil)
    {
        System.out.println("Bilangan Fibonacci ke-" + n + " : " + hasil);
    }
    
    tampilHasil(n, Hasil);
}
