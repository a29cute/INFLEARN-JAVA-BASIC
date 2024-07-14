package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        /* 객체지향 프로그래밍 */

        MusicPlayer player = new MusicPlayer();

        player.on();// 음악 플레이어 재생
        player.vUp(); // 볼륨 증가
        player.vUp(); // 볼륨 증가
        player.vDown(); // 볼륨 감소
        player.showStatus();// 음악 플레이어 상태 확인
        player.off();// 음악 플레이어 종료

    }
}
