package ch14.ex2;

public class Racer implements Runnable {
    private String name;

    public Racer(String name) {
        this.name = name;
        System.out.println(name + "이(가) 경주에 참가했습니다!");
    }

    @Override
    public void run() {
        // 실제 실행 중인 스레드에서 이름 가져오기
        name = Thread.currentThread().getName();
        int position = 0;

        try {
            while (position < ThreadRaceGame.RACE_DISTANCE && !ThreadRaceGame.gameFinished) {
                // 랜덤하게 1~3칸 전진
                int move = (int)(Math.random() * 3) + 1;
                position += move;

                // 경주 상황 출력
                ThreadRaceGame.printRaceProgress(name, position);

                // 0.5~1.5초 대기
                Thread.sleep((int)(Math.random() * 1000) + 500);

                // 결승선 도착 체크
                if (position >= ThreadRaceGame.RACE_DISTANCE && !ThreadRaceGame.gameFinished) {
                    ThreadRaceGame.gameFinished = true;
                    System.out.println("\n🏆 " + name + "이(가) 경주에서 승리했습니다! 🏆");
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + "의 스레드가 중단되었습니다: " + e.getMessage());
            Thread.currentThread().interrupt();  // 인터럽트 상태 복원
        }
    }
}