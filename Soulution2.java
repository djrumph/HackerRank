/**
 * Created by DJ on 1/18/2018.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution2 {

    static int simpleArraySum(int n, int[] ar) {
        int sum = 0;
        for(int i = 0; i< ar.length; i++)
        {
            sum+= ar[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}