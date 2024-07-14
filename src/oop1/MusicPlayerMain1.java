package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {

        /* 절차지향 프로그래밍 */

        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 플레이어 재생");

        volume++; // 볼륨 증가
        System.out.println("음악 플레이어 볼륨: "+ volume);

        volume++; // 볼륨 증가
        System.out.println("음악 플레이어 볼륨: "+ volume);

        volume--; // 볼륨 감소
        System.out.println("음악 플레이어 볼륨: "+ volume);

        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }
}
