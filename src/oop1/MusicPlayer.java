package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on(){
        isOn = true;
        System.out.println("음악 플레이어 재생");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void vUp(){
        volume++; // 볼륨 증가
        System.out.println("음악 플레이어 볼륨: "+ volume);
    }

    void vDown(){
        volume--; // 볼륨 감소
        System.out.println("음악 플레이어 볼륨: "+ volume);
    }

    void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
