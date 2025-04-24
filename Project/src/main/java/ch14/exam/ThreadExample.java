package ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Thread movieThread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    try {
                        System.out.println("동영상을 재생합니다.");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread musicThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    try {
                        System.out.println("음악을 재생합니다.");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        movieThread.start();
        musicThread.start();
    }
}
