package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello Java";

        String deco = DecoUtill2.deco(s);
        /* 생략 -- > static 메소드를 사용하면 클래스에서 바로 메소드를 호출할 수 있다.
        DecoUtill1 utils = new DecoUtill1();
        String deco = utils.deco(s);
        */
        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}
