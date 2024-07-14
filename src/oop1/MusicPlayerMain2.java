package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {

        /* 절차지향 프로그래밍 - 데이터 묶음 */
        // 다양한 변수들이 추가 되더라도 MusicPlayerData 클래스에서 객체들을 용이하게 관리할 수 있다.
        
        MusicPlayerData data = new MusicPlayerData();
        data.isOn = true;
        System.out.println("음악 플레이어 재생");

        data.volume++; // 볼륨 증가
        System.out.println("음악 플레이어 볼륨: "+ data.volume);

        data.volume++; // 볼륨 증가
        System.out.println("음악 플레이어 볼륨: "+ data.volume);

        data.volume--; // 볼륨 감소
        System.out.println("음악 플레이어 볼륨: "+ data.volume);

        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }
}
