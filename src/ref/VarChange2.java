package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값" + dataA);
        System.out.println("dataB 참조값" + dataB);

        System.out.println("변경 전 dataA : "+dataA.value);
        System.out.println("변경 전 dataB : "+dataB.value);

        dataA.value = 20;
        System.out.println("변경 후 dataA : "+dataA.value);
        System.out.println("변경 후 dataB : "+dataB.value);
    }
}
