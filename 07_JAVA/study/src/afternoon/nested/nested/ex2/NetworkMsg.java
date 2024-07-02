package afternoon.nested.nested.ex2;

public class NetworkMsg {
    private String msg;

    public NetworkMsg(String msg) {
        this.msg = msg;

    }
    public void send(){
        System.out.println("네트워크 메세지 전송");
        System.out.println(msg);
        System.out.println("네트워크 메세지를 전송 종료");
    }


}
