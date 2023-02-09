import java.util.Scanner;
public class salary {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Woriking hours =");
        double h = sc.nextDouble();
        System.out.print("salary =");
        double s = sc.nextDouble();
        double nets ;
        

        nets = s - (s* 0.11);
        System.out.println("net salary RM " + nets);
        
    }
}