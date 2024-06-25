package afternoon.access.ex;

public class Speaker {
    private int volume;
    //private int MAX_VOLUME = 100;
    //private int MIN_VOLUME = 0;

    public Speaker() {
        this.volume = 20;
    }

    public void volumeUp(){
        if(this.volume < 100){                              //MAX_VOLUME
            this.volume++;  //this.volume = this.volume + 1;
            printVoulume();
        } else {
            //System.out.println("더 이상 볼륨 조절이 불가능");
            printLimit();
        }
    }

    public void volumeDown(){
        if(this.volume > 0){                              // MIN_VOLUME
            this.volume--;
            printVoulume();
        } else {
            //System.out.println("더 이상 볼륨 조절이 불가능");
            printLimit();
        }
    }

    public void mute(){
        this.volume = 0;
        printVoulume();
        System.out.println("스피커가 mute 됨");
    }

    private void printLimit(){
        System.out.println("더 이상 볼륨 조절이 불가능");
    }

    private void printVoulume() {
        System.out.println("현재 볼륨은 : " + this.volume);
    }
}
