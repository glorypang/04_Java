package ch14.ex1;

import lombok.Data;

import java.util.Random;

@Data
public class Player implements Runnable {
    private String name;

    public Player(String name) {
        this.name = name;
    }


    // 랜덤 객체 생성
    private final Random random = new Random();

    @Override
    public void run() {
        try{
            int curr = Main.count; // 현재 숫자를 지역변수에 저장

            // 1~2초 대기
            Thread.sleep(random.nextInt(5)*200+1000);

            /**
             * sleep 전후 숫자를 비교
             * -> 달라짐 -> 다른 player가 Main.count를 증가 시켰다.
             */
            while(curr != Main.count){
                curr = Main.count;
                Thread.sleep(random.nextInt(5)*200);
            }
            synchronized (Main.class){
                int callNumber = ++Main.count;
                System.out.printf("%-10s : %2d\n", name, callNumber);

                if(callNumber == Main.finalNumber){
                    System.out.println(name + " 벌칙 당첨!!!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
