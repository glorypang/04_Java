package ch04.sec09;

public class Times {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        for(int i = 1 ; i<=100; i++){
            if(i%3 ==0) sum += i;
        }
        System.out.println(sum);
    }
}
