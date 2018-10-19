import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainclass {
	  public static void main(String arg[]){
	        
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	        
	        Samsung samsung=new Samsung(101,true,"yes");
		Vivo vivo =new Vivo(201,true,4000);
	        Apple apple=new Apple(501,9,"High");
	        
	        int platform=0,brand=0,option=0;
	        
	        System.out.println("1. Android");
	        System.out.println("2. Ios");
	        System.out.print("Choose the Platform: ");
	        try{
	            platform=Integer.parseInt(br.readLine()); 
	        }catch (IOException e){}
	        
	        switch(platform){
	            case 1:
	                System.out.println("1. Samsung");
	                System.out.println("2. Vivo");
	                System.out.print("Choose Mobile Brand:");
	                try{
	                    brand=Integer.parseInt(br.readLine()); 
	                }catch (IOException e){}
	                
	                switch(brand){
	                    case 1:
	                        System.out.println("1. Make Call");
	                        System.out.println("2. Send Message");
	                        System.out.println("3. Get App");
	                        System.out.println("4. Use Samsung Pay");
	                        System.out.println("5. See Features");
	                        System.out.print("Choose Option:");
	                        try{
	                            option=Integer.parseInt(br.readLine()); 
	                        }catch (IOException e){}
	                        
	                        switch (option){
	                            case 1:
	                               samsung.makecall();
	                                break;
	                            case 2:
	                                samsung.sendmessage();
	                                break;
	                            case 3:
	                                samsung.getapp();
	                                break;
	                            case 4:
	                                samsung.setsamsungpay();
	                                break;
	                            case 5:
	                                samsung.features();
	                                break;
	                            default:
	                                System.out.println("Invalid option");
	                                break;
	                        }
	                        break;
	                    case 2:
	                        System.out.println("1. Make Call");
	                        System.out.println("2. Send Message");
	                        System.out.println("3. Get App");
	                        System.out.println("4. Use Gallery");
	                        System.out.println("5. See Features");
	                        System.out.print("Choose Option:");
	                        try{
	                            option=Integer.parseInt(br.readLine()); 
	                        }catch (IOException e){}
	                        
	                        switch (option){
	                            case 1:
	                                vivo.makecall();
	                                break;
	                            case 2:
	                                vivo.sendmessage();
	                                break;
	                            case 3:
	                                vivo.getapp();
	                                break;
	                            case 4:
	                                vivo.usegallery();
	                                break;
	                            case 5:
	                                vivo.features();
	                                break;
	                            default:
	                                System.out.println("Invalid option");
	                                break;
	                        }
	                        break;
	                        
	                }
	                break;
	            case 2:
	                System.out.println("1. Apple");
	                System.out.print("Choose Mobile Brand:");
	                try{
	                    brand=Integer.parseInt(br.readLine()); 
	                }catch (IOException e){}
	                
	                switch(brand){
	                    case 1:
	                        System.out.println("1. Make Call");
	                        System.out.println("2. Send Message");
	                        System.out.println("3. Set App");
	                        System.out.println("4. Set Password");
	                        System.out.println("5. Show Features");
	                        System.out.print("Choose Option:");
	                        try{
	                            option=Integer.parseInt(br.readLine()); 
	                        }catch (IOException e){}
	                        
	                        switch (option){
	                            case 1:
	                                apple.makecall();
	                                break;
	                            case 2:
	                                apple.sendmessage();
	                                break;
	                            case 3:
	                                apple.setapp();
	                                break;
	                            case 4:
	                                apple.setpassword();
	                                break;
	                            case 5:
	                                apple.features();
	                                break;
	                            default:
	                                System.out.println("Invalid option");
	                                break;
	                        }
	                        break;
	                }
	                break; 
	            default:
	            System.out.println("Invalid option");
	            break;
	        }
	    }

}
