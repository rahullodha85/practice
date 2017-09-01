package implementation;

import java.util.Scanner;

/**
 * Created by 461967 on 6/20/17.
 */
public class ApplesAndOranges {
    public void count(){
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        long appleCount = 0;
        long orangeCount = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            int temp = a + apple[apple_i];
            if(temp>=s && temp<=t)
                appleCount += 1;
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            int temp = b + orange[orange_i];
            if(temp>=s && temp<=t)
                orangeCount += 1;
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
