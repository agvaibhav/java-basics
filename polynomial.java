import java.util.*;
import java.io.*;
public class polynomial{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                double sj=a+java.lang.Math.pow(2,0)*b;
                for(int k=1;k<=j;k++){
                    sj = (int)sj;
                   sj = sj+java.lang.Math.pow(2,k)*b;

                }
                System.out.print((int)sj+" ");
            }
            System.out.println("");
        }
        in.close();


    }
}