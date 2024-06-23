package oop1;

public class MusicPlayerMain3 { // 절차 지향 프로그래밍

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        //음악 플레이어 시작
        player.on();
        //음악 플레이어 볼륨 높이기
        player.volumeUp();
        player.volumeUp();
        //볼륨 낮추기
        player.volumeDown();
        //상태 확인
        player.showStatus();
        //음악 플레이어 종료
        player.off();
    }
}