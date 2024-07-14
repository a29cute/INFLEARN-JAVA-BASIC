package pack;
import pack.a.*;

// 서로 다른 패키지의 클래스를 사용하고 싶을 때
// import를 사용하여 특정 혹은 전체 패키지 내 클래스를 사용한다.

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        User1 user = new User1();
        User2 user2 = new User2();

    }
}
