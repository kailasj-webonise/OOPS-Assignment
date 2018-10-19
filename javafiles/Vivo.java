
public class Vivo extends Android {
	  boolean fingureprint;
	    int battery;
	    
	    public Vivo(int model_no,boolean fingureprint,int battery) {
	        this.model_no=model_no;
		this.fingureprint=fingureprint;
		this.battery=battery;
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
	    
	    public void usegallery() {
	        System.out.println("You are in the gallery");
	    }
	    
	    public void features(){
	        System.out.println("Model Number: "+model_no);
	        System.out.println("Finfure print scanner provided: "+fingureprint);
	        System.out.println("Battery: "+battery);
	    }

}
