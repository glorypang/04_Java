package ch14.exam;

public class MovieThread {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    try{
                        System.out.println("동영상을 재생합니다.");
                        Thread.sleep(1000);
                    }catch(Exception e){}
                }
            }
        };
        thread.start();
    }
}
