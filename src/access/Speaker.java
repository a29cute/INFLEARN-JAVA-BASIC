package access;

public class Speaker {
    int volume;
    Speaker(int volume) {
        this.volume = volume;
    }

    void vUp(){
        if(volume >= 100){
            System.out.println("최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("볼륨 10 증가");
        }
    }

    void vDown() {
        volume -= 10;
        System.out.println("볼륨 10 감소");
    }

    void showVolume(){
        System.out.println("현재 볼륨: "+ volume);
    }

    
}
