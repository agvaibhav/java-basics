import java.util.*;
public class output_formatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //string is indented left with 15 character spaces and integer is padded with 3 integer spaces
           System.out.printf("%-15s%03d%n", s1, x);
            
        }
        System.out.println("================================");

    }
}
