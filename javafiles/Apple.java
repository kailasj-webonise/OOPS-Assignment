
public class Apple extends Ios{
	    int ios_version;
	    String security;
	    
	    public Apple(int model_no,int ios_version,String security){
		this.model_no=model_no;        
		this.ios_version=ios_version;
	        this.security=security;
	        
	    }
	    
	    public void makecall() {
	        System.out.println("You are Calling...");    
	    }
	    
	    public void sendmessage() {
	        System.out.println("You are Messaging...");  
	    }
	        
	    public void setapp() {
	        System.out.println("Set the diffrent app...");
	    }
	    
	    public void setpassword() {
	        System.out.println("Set your password...");
	    }
	    
	    public void features(){
	        System.out.println("Model no: "+model_no);
	        System.out.println("Ios version: "+ios_version);
	        System.out.println("Security provided: "+security);
	    }

}
