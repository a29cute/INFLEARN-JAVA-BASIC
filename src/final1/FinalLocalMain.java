package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1 = 10; // 최초 한 번만 할당 가능
        final int data2 = 20;

        method(30);
    }

    static void method(final int param){

    }
}
