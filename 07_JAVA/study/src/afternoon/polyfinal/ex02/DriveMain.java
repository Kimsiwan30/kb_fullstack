package afternoon.polyfinal.ex02;

import java.util.Scanner;

public class DriveMain {
    public static void main(String[] args) {
        DriveSystem driveSystem = new DriveSystem();
        Scanner scanner = new Scanner(System.in);
        int choose;
        System.out.print("자동차 브랜드를 선택하세요 ( 1. 밴츠 / 2. 포르쉐 / 3. 페라리 ) : ");
        choose = scanner.nextInt();

        if (choose == 1) {
            driveSystem.SetDrive(new Benz());
        } else if (choose == 2) {
            driveSystem.SetDrive(new Porsche());
        } else if (choose == 3) {
            driveSystem.SetDrive(new Ferrari());
        }


        driveSystem.drive();
    }


}
