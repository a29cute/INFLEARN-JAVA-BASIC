package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        // 다양한 메소드와 변수를 valueData 클래스에서 관리한다.
        // => Main 소스코드가 훨씬 깔끔해진다.
        ValueData valueData = new ValueData();

        valueData.add();
        valueData.add();
        valueData.add();

        System.out.println("최종 숫자: " + valueData.value);

    }

}
