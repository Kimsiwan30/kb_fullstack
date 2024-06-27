package afternoon.memory;

public class Data {
    public int value; // public을 왜 생략안하는지?

    Data(int value){
        this.value =value;
    }

    public int getValue() {
        return this.value;
    }
}
