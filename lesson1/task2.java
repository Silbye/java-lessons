package lesson1;

import java.io.IOException;

public class task2 {
    public static void main(String[] args) throws IOException {
        for(int i = 2; i < 1000; ++i){
            findSimpleNumber(i);
        }
    }
    public static void findSimpleNumber(int N) {
        int count = 0;
        for(int j = 2; j <=N && count < 2;++j){
            if(N%j==0){
                ++count;
            }
        }
        if(count<2)
            System.out.println(N);
        }
}
