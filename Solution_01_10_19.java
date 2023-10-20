package backjoon_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_01_10_19 {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = input.readLine().split(" ");

        long a = Integer.parseInt(str[0]);
        long b = Integer.parseInt(str[1]);

        //a,b의 최소공배수 구하기

        long max = Math.max(a, b);
        long min = Math.min(a, b);
        long answer = result(max, min);
        System.out.println(answer);


    }

    static long result(long max, long min) {
        for (int i = 2; i <= min; i++) {
            if (max % i == 0 && min % i == 0) {   //            3 |       24      18
                long c = max / i;              //                 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
                long d = min / i;               //              2 |       8        6
                return i * result(c, d);          //              ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
            }                                       //          1 |       4        3
            //                                                    ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
        }                                               //                4        3

        //if(min == 1) return 1*max;

        return 1*max*min;
    }
}


