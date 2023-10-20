package backjoon_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_01_10_20 {

    public static void main(String[] args) throws IOException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(sc.readLine());

       int count = 0;

       for(int i = 1; i <=n; i++){

           if(i % 10 ==0 && i %100 != 0){
               count++; // (i가 100,200,300,400,500을 제외한 10의 배수일경우, 즉 두자릿수의 10의배수 )
                // i가 50,150,250처럼 끝자리가0이고 두번째 자리수가 5인 경우
               int temp = (i/10);
               if(temp % 5 ==0 && temp % 10 != 0)
                    count++;

           }

           else if(i % 100 == 0){
               count += 2;    // i가 100,200,300,400인경우 count +2
               if(i==500) count++;//i가 500인경우 +1
           }

           else if(i % 5 == 0 && i % 10 != 0 ){
               count++; // 끝자리가 5인 수의 경우
           }

           // 25*4,75*4 에서 0이 하나 더 생긴다 (100,200,300)
           // 25,125,225,325,425,75,175,275,375,475
           //125*8 에서는 0이 하나더 생긴다.,
           //250*4에서 0이 하나 더 생긴다  ******* 이거 빼먹었음
            //375*8에서 0이 하나 더 생긴다
           if(i==25 || i==125 || i==225 || i==325 || i==425)
               count++;
           if(i==75 || i==175 || i==275 || i==375 || i==475 || i == 125 || i==250)
               count++;
           if(i==375)
               count++;

       }


        System.out.println(count);

    }


}
