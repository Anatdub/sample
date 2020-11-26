package ch23htp;

import java.security.SecureRandom;
import java.util.Random;

public class PrintTask implements Runnable 
{
   private  static Random generator = new Random();
   private int sleepTime; // random sleep time for thread
   private final String taskName; // name of task
    
   // constructor
   public PrintTask(String taskName)
   {
      this.taskName = taskName;
        
      // pick random sleep time between 0 and 5 seconds
      sleepTime = generator.nextInt(5000); // milliseconds
      if (taskName=="task1") sleepTime=0;
   } 

   // method run contains the code that a thread will execute
   public void run() 
   {
      try // put thread to sleep for sleepTime amount of time 
      {
    	 
    	   System.out.printf("%s going to sleep for %d milliseconds.%n", 
            taskName, sleepTime);
      
         Thread.sleep(sleepTime); // put thread to sleep
      }       
      catch (InterruptedException exception)
      {
         exception.printStackTrace();
         Thread.currentThread().interrupt(); // re-interrupt the thread
      } 
        
      // print task name
      System.out.printf("%s done sleeping%n", taskName); 
   } 
} // end class PrintTask
