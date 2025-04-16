package ch06.sec15;


public class InputTest {
    public static void main(String[] args) {
        String name = Input.read("이름: ");
        System.out.println("입력값: "+ name);

        String name2 = Input.read("이름", "홍길동");
        System.out.println("입력값: " + name2);
        int age = Input.readInt("나이: ");
        System.out.println("입력값: " + age);

        boolean agree = Input.confirm("동의하십니까?", true);
        System.out.println("입력값: " + agree);

        boolean agree1 = Input.confirm("동의하십니까?");
        System.out.println("입력값: " + agree1);


    }
}