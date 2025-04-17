package ch07.sec12;

public class AnimalExample {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];


        // new Animal[3] == Animal 객체 참조 변수 3칸짜리 배열 생성
        animals[0] = new Animal(); // 같은 타입 주소 대입
        animals[1] = new Dog(); // 부모 참조 변수 = 자식 객체 주소 (업캐스팅)
        animals[2] = new Cat(); // 업캐스팅


        System.out.println("동적 바인딩 사용 X");
        for(Animal a : animals){
            if(a instanceof Dog){
                ((Dog)a).sound(); // 멍멍(다운 캐스팅)
            }
            else if(a instanceof Cat){
                ((Cat)a).sound(); // 야옹(다운 캐스팅)
            }
            else{
                a.sound();
            }
        }

        System.out.println("동적 바인딩 사용 O");
        for(Animal a : animals){
            a.sound(); // 동적 바인딩 제공
            // a는 부모 타입 참소 변수
            // -> 1번, 2번 인덱스가 참조하는 객체는 자식(Dog, Cat)
            // -> 실행 중 sound() 메서드가 실제 참조하는 객체인 Dog, Cat의
            //  오버라이딩된 sound() 메서드와 연결되어 호출한다.
        }

    }
}
