package HareAndtortoise;
public class T
{

     public static void main(String[] args)
     {
       Thread tortoise = new Tortoise();      
     tortoise.start();                         
     for(int a=1;a<51;a++)
            {

              System.out.println("RANGE covered by HARE ="+(a));  
            }
System.out.println("***********************HARE WENT TO SLEEP!!");   

    try
    {
      Thread.sleep(2000);
    }
    catch(InterruptedException ie)
    {
   
    }
System.out.println("******************HARE STARTED THE RACE AGAIN!!");   
    for(int b=51;b<101;b++)
      System.out.println("RANGE covered by HARE ="+(b));
    System.out.println("*************************************HARE HAS COMPLETED   RACE!! ");
 

  }
}
class Tortoise extends Thread
{  
	public void run()
    {
                for(int c=1;c<101;c++)
                {
                  System.out.println("RAGE covered by TORTOISE ="+c);    
                }
                System.out.println("*********************TORTOISE HAS WON THE RACE!!");    
 
  }
   
}
