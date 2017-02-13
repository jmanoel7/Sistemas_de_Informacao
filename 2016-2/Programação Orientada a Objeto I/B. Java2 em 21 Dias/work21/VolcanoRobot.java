package jmanoel.java2.work21;

class VolcanoRobot 
{
   String status;
   int speed;
   float temperature;
   
   void CheckTemperature() 
     {
	if (temperature > 660) 
	  {
	     status = "returning home";
	     speed  = 5;
	  }
     }

   void ShowAttributes() 
     {
	System.out.println("Status:      " + status);
	System.out.println("Speed:       " + speed);
	System.out.println("Temperature: " + temperature);
     }
   
   public static void main(String [] arguments) 
     {
	VolcanoRobot dante = new VolcanoRobot();
	dante.status      = "exploring";
	dante.speed       = 2;
	dante.temperature = 510;
	dante.ShowAttributes();
	System.out.println("Increasing speed to 3.");
	dante.speed = 3;
	dante.ShowAttributes();
	System.out.println("Changing temperature to 670.");
	dante.temperature = 670;
	dante.ShowAttributes();
	System.out.println("Checking the temperature.");
	dante.CheckTemperature();
	dante.ShowAttributes();
     }
}