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
     
      security="High";
     }
   void putdata()
    {
		
     System.out.println("\n *******I-phone Common Features*******\n");
     common_features();
     System.out.println(" Provide photographic feature called Portrait Lighting:"+lighting);
     System.out.println(" Security level provided:"+security);
 
      
    } 
	void Iphone(int no1)
	{
		int n=no1;
		if(n==1)
	 {
	 System.out.println("***I-phone X feature***");
	 System.out.println(" 1. iOS v11.1.1 operating system with 1.3GHz Apple A11 Bionic hexa core processor\n 2. 3GB RAM\n 3. 1 year manufacturer warranty for device");
	 }
	  else if(n==2)
	  {
		  System.out.println("***I-phone 7 plus feature***");
	 System.out.println("1. Great performance \n 2. Dual camera \n 3. Excellent battery life");
	  }
	}
	void IphoneX(int no1)
	{
		int no=no1;
		 if(no==1)
		 System.out.println(" you are dealing with the operating system...");
	     else if (no==2)
		 System.out.println(" you are seeing the RAM status...");
	 else if(no==3)
		 System.out.println(" you are reading the warranty details...");
	 else
		 System.out.println(" enter proper choice...");
	}
    void Iphone7(int no1)
	{
		int no=no1;
		if(no==1)
		 System.out.println(" you are dealing with the performance...");
	 else if(no==2)
		 System.out.println(" you are using the camera...");
	 else if(no==3)
		 System.out.println(" you are checking the battery usage...");
	 else
		 System.out.println(" enter proper choice...");
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
      System.out.println("\n *******Samsung common Features*******\n");
     common_features();
  
     
    } 
	void Samsung(int no1)
	{
		int n=no1;
		if(n==1)
	 {
	 System.out.println("***Samsung Galaxy Note 8 feature***");
	 
	 System.out.println("1. Fast face scanning:"+scan);
     System.out.println("2. Operating system:"+os);
     System.out.println("3. Camera Avaibility:"+camera);
	 }
	  else if(n==2)
	  {
		  System.out.println("***Samsung Galaxy J2 feature***");
	 System.out.println("1. Better selfie camera provied:"+selfie);
	  System.out.println("2. Sim Allocated:"+sim);
    System.out.println("3. Ram Availabel Upto:"+ram+"GB");
     System.out.println("4. Battery availabel Upto:"+battery+"mAh\n");
	  }
	}
	void note8(int no1)
	{
		int no=no1;
		 if(no==1)
		 System.out.println("you are scanning the face...");
	     else if (no==2)
		 System.out.println(" you are seeing the OS status...");
	 else if(no==3)
		 System.out.println(" you are checking the camera...");
	 else
		 System.out.println("enter proper choice...");
	}
    void j2(int no1)
	{
		int no=no1;
		if(no==1)
		 System.out.println("you are clicking the selfie...");
	 else if(no==2)
		 System.out.println(" you are checking sim card seting...");
	 else if(no==3)
		 System.out.println(" you are checking the RAM usage...");
	 else if(no==4)
		 System.out.println("yor checking battery status...");
          else
		 System.out.println(" enter proper choice...");
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
     System.out.println("\n *******VIVO Common Features*******\n");
     common_features();
  
      
    } 
	void vivo(int no1)
	{
		int n=no1;
		if(n==1)
	 {
	 System.out.println("***VIVO NEX feature***");
	 
     System.out.println("1. Processor provided:"+processor);
     System.out.println("2. Camera Avaibility:"+camera);
     System.out.println("3. Battery availabel Upto:"+battery+"mAh");	 }
	  else if(n==2)
	  {
		  System.out.println("***VIVO V11 PRO feature***");
		  
	  System.out.println("1. Finger print scanner provided:"+fingerprint);
      System.out.println("2. Operating system:"+os);
	  System.out.println("3. Sim Allocated:"+sim);
      System.out.println("4. Ram Availabel Upto:"+ram+"GB");
	  }
	}
	void vivonex(int no1)
	{
		int no=no1;
		 if(no==1)
		 System.out.println(" you are dealing with processor...");
	     else if (no==2)
		 System.out.println(" you are checking camera...");
	 else if(no==3)
		 System.out.println(" you checking battery usage...");
	 else
		 System.out.println(" enter proper choice...");
	}
    void v11(int no1)
	{
		int no=no1;
		if(no==1)
		 System.out.println(" you are scaning your finger...");
	 else if(no==2)
		 System.out.println(" you are checking OS...");
	 else if(no==3)
		 System.out.println(" you are checking SIM management...");
	 else if(no==4)
		 System.out.println(" yor checking RAM management...");
          else
		 System.out.println(" enter proper choice...");
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
      int n,no,no1;
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
		  System.out.println(" Select the I-phone model:\n 1. I-phone X \n 2. I-phone 7 plus");
	         no=Integer.parseInt(br.readLine());
			 if(no==1)
			 {
				 i.Iphone(no);
				 System.out.println(" select the feature:");
                                 no1=Integer.parseInt(br.readLine());
				 i.IphoneX(no1);
			 }
			 else if (no==2)
			 {
				 i.Iphone(no);
				 System.out.println(" select the feature:");
                                 no1=Integer.parseInt(br.readLine());
				 i.Iphone7(no1);
			 }
          break;
       case 2:
         // s.getdata();
          s.putdata();
		  System.out.println(" Select the Samsung model:\n 1. Samsung Galaxy Note 8 \n 2.  Samsung Galaxy J2");
	          no=Integer.parseInt(br.readLine());
			 if(no==1)
			 {
				 s.Samsung(no);
				 System.out.println("select the feature:");
                                 no1=Integer.parseInt(br.readLine());
				 s.note8(no1);
			 }
			 else if (no==2)
			 {
				 s.Samsung(no);
				 System.out.println("select the feature:");
                                 no1=Integer.parseInt(br.readLine());
				 s.j2(no1);
			 }
          break;
       case 3:
       // v.getdata();
        v.putdata();
		 System.out.println("Select the VIVO model:\n 1. VIVO NEX \n 2.  VIVO V11 PRO");
	         no=Integer.parseInt(br.readLine());
			 if(no==1)
			 {
				 v.vivo(no);
				 System.out.println("select the feature:");
                                 no1=Integer.parseInt(br.readLine());
				 v.vivonex(no1);
			 }
			 else if (no==2)
			 {
				 v.vivo(no);
				 System.out.println("select the feature:");
                                 no1=Integer.parseInt(br.readLine());
				 v.v11(no1);
			 }
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
