package afternoon.polyfinal.ex02;

public class DriveSystem {
     public Drive drive;

    public void SetDrive(Drive drive) {
        this.drive = drive;
    }

    public void drive(){
        drive.openDoor();
        drive.start();
        drive.stop();
    }

}
