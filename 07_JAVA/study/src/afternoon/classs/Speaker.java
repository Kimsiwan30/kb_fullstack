package afternoon.classs;

public class Speaker {
    int volume = 0;
    int volumeUp = + 1;
    int volumeDown = - 1;

    Speaker(int volume, int volumeUp, int volumeDown) {
        this.volume = volume;
        this.volumeUp = volume + 1;
        this.volumeDown = volume- 1;
    }

    void printSpeak() {
        System.out.println("그냥 불륨 : " +this.volume);
        System.out.println("불륨 올리자 : " +this.volumeUp);
        System.out.println("불륨 내려 : " +this.volumeDown );
    }
}
