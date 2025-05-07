package ch16.exam01;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        
        //익명 클래스 방법
        person.action(new Workable() {
            @Override
            public void work() {
                System.out.println("출근을 합니다.");
                System.out.println("일을 합니다.");
                System.out.println("점심을 먹습니다.");
            }
        });

        // 람다식 방법
        person.action(()->{
            System.out.println("낮잠을 잡니다.");
            System.out.println("일을 합니다.");
            System.out.println("퇴근 합니다.");
        });
    }
}
