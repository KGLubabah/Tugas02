package DynamicProgramming;
import java.util.Scanner;
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
}
