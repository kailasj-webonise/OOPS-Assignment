
public class Samsung extends Android {
	boolean wifi;
    String dualcamera;
    
    public Samsung(int model_no,boolean wifi,String dualcamera){
        this.model_no=model_no;
        this.wifi=wifi;
        this.dualcamera=dualcamera;
    }
    
    public void makecall() {
        System.out.println("You are Calling...");    
    }
    
    public void sendmessage() {
        System.out.println("You are Messaging...");    
    }
    
    public void getapp() {
        System.out.println("Get apps you want...");
    }
    
    public void setsamsungpay() {
        System.out.println("Sending money using samsung pay...");
    }
    
    public void features() {
        System.out.println("Model number: "+model_no);
        System.out.println("Provide WiFi: "+wifi);
        System.out.println("Have Dual Camera: "+dualcamera);
    }

}
