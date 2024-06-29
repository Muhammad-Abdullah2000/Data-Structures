import java.util.Scanner;

interface Camera {
    void takepic();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2 {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }

}

class SmartPhone1 extends MyCellPhone2 implements MyWifi2, Camera {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Taking snap");
    }

    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "CUI Sahiwal", "Apna lga lo" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    public void working() {
        System.out.println("working");
    }

    @Override
    public void takepic() {
        System.out.println("taking snap........");

    }
}

public class RealTimeExample {
    public static void main(String[] args) {
       

        int pass;
        System.out.println("Enter password");
        Scanner scanner = new Scanner("System.in");
        pass = scanner.nextInt();

        if(pass == 123){
            Camera cam = new SmartPhone1();
        cam.record4KVideo();

        SmartPhone1 smart = new SmartPhone1();
        smart.working();
        smart.recordVideo();
        smart.getNetworks();
        smart.callNumber(1122);
        }
        else{
            System.out.println("try again");
        }
    }
}
