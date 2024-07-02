package afternoon.nested.nested.ex2;

import java.util.Random;

public class Network {
    private boolean networkCondition;

    public boolean checkNetwork() {
        System.out.println("네트워크 상태를 점검합니다");
        Random random = new Random();
        networkCondition = random.nextBoolean();
        if (networkCondition) {
            System.out.println("네트워크 상태 정상");
            return true;
        } else {
            System.out.println("네트워크 상태 비정상");
            return false;
        }
    }

    public void sendMsg(String msg) {
        NetworkMsg networkMsg = new NetworkMsg(msg);
        networkMsg.send();
    }

    private class NetworkMsg {  //스태틱이 붙어야 중첩클래스 아니면 내부클래스
        private String msg;

        public NetworkMsg(String msg) {
            this.msg = msg;

        }

        public void send() {
            System.out.println("네트워크 메세지 전송");
            System.out.println(msg);
            System.out.println("네트워크 메세지를 전송 종료");
        }


    }
}
