package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){

        staticValue++; // 정적변수 접근
        staticMethod(); // 정적메소드 접근

    }

    private void instanceMethod(){
        System.out.println("instanceValue : " + instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue : " + staticValue);
    }

    public void instanceCall(){
        instanceValue++;
        instanceMethod();

        staticValue++; // 정적변수 접근
        staticMethod(); // 정적메소드 접근
    }
}
