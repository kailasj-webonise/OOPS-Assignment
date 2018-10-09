  import java.io.*;
  
  class cell_phone
  {
   
         public String os,camera,sim;
          
         public int ram,battery;
      
     
      void common_features()
      {
        System.out.println("\n Can send SMS.\n Can Capture a photo.\n Abel to make and receive calls.\n Abel to use mobile internet\n");
      }
   }
 
  class Iphone extends cell_phone
  {
   
   public String security,lighting;
  
  
 //  void getdata()
    Iphone()
    {
      lighting="yes";
      os="iphone OS";
      camera="Dual";
      sim="one";
      ram=4;
      battery=2000;
      security="High";
     }
   void putdata()
    {
     System.out.println("\n *******I-phone Features*******\n");
     common_features();
     System.out.println(" Provide photographic feature called Portrait Lighting:"+lighting);
     System.out.println(" Security level provided:"+security);
     System.out.println(" Operating system:"+os);
     System.out.println(" Camera Avaibility:"+camera);
     System.out.println(" Sim Allocated:"+sim);
     System.out.println(" Ram Availabel:"+ram+"GB");
     System.out.println(" Battery availabel:"+battery+"mAh");
      
    } 
 
   
  }
 
  class samsung extends cell_phone
  {
   
   public String selfie,scan;

  // void getdata()
    samsung()
    {
     selfie="yes";
     scan="yes";
     os="Android";
     camera="Dual";
      sim="Dual";
      ram=8;
      battery=3500;
    }

   void putdata()
    {
      System.out.println("\n *******Samsung Features*******\n");
     common_features();
     System.out.println(" Fast face scanning:"+scan);
     System.out.println(" Better selfie camera provied:"+selfie);
     System.out.println(" Operating system:"+os);
     System.out.println(" Camera Avaibility:"+camera);
     System.out.println(" Sim Allocated:"+sim);
     System.out.println(" Ram Availabel Upto:"+ram+"GB");
     System.out.println(" Battery availabel Upto:"+battery+"mAh\n");
     
    } 
  }

  class vivo extends cell_phone
 {
  
   public String processor,fingerprint;
  
 //void getdata()
    vivo()
    {
     fingerprint="yes";
     processor ="Octa Core";
     os="funtouch";
     camera="Dual";
      sim="Dual";
      ram=8;
      battery=4000;
    }

  void  putdata()
    {
     System.out.println("\n *******VIVO Features*******\n");
     common_features();
      System.out.println(" Finger print scanner provided:"+fingerprint);
     System.out.println(" Processor provided:"+processor);
     System.out.println(" Operating system:"+os);
     System.out.println(" Camera Avaibility:"+camera);
     System.out.println(" Sim Allocated:"+sim);
     System.out.println(" Ram Availabel Upto:"+ram+"GB");
     System.out.println(" Battery availabel Upto:"+battery+"mAh");
      
    } 
 }
  class mainclass
  {
   public static void main(String args[])throws IOException
   { 
     Iphone i=new Iphone();
     samsung s=new samsung();
     vivo v=new vivo();
     char ch;
      int n;
    do
    {
    
     

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
     System.out.println(" 1. Iphone \n 2. Samsung \n 3. Vivo ");
     System.out.print(" Plz choose the brand do you want to select=" );
     n=Integer.parseInt(br.readLine());
     switch(n)
     {
       case 1:
        //  i.getdata();
          i.putdata();
          break;
       case 2:
         // s.getdata();
          s.putdata();
          break;
       case 3:
       // v.getdata();
        v.putdata();
          break;
        default:
        System.out.println(" Enter proper choice....");
        break;
      }
       
      System.out.print(" Do you want to continue[Y/N]: "); 
      ch=(char)br.read();
     }while(ch=='y'||ch=='Y');
     
   }
  }
    
   
