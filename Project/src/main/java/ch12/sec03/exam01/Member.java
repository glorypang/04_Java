
package ch12.sec03.exam01;
public class Member {
    public String id;
    public Member(String id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member target) { // 타입 감사
            if(id.equals(target.id)) { // id 문자열이 같은지 비교
                return true;
            }
        }
        return false;
    }
}