package pack;

import pack.a.User1;
// import pack.b.User1; -> 이거 못씀.

// import란?
/* 서로 다른 패키지의 클래스를 사용하고 싶을 때
 import를 사용하여 특정 혹은 전체 패키지 내 클래스를 사용한다. */

// import에 대해서?
/* 클래스명이 겹치는 패키지는 import 하지 못하므로
main 안의 클래스를 쓸 때 패키지 경로를 명시해줘야 된다.
결론적으로 import는 1개만 쓸 수 있다. */

public class PackageMain3 {
    public static void main(String[] args) {
        User1 userA = new User1();
        pack.b.User1 useB = new pack.b.User1();

    }
}
