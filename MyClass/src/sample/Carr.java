package sample;
class Carr{
    
	ControlSystem cs = new Carr.ControlSystem();
    
    public Carr(){};
    
    public void start()
    {
        cs.start();
    }
    
    public void stop()
    {
        cs.stop();
    }
    
    public void left()
    {
        cs.left();
    }
    
    public void right()
    {
        cs.right();
    }
    public static void main(String... args) {
    	Carr carr=new Carr();
    	carr.start();
    	carr.left();
    	carr.right();
    }
    static class ControlSystem {
    	public void start(){System.out.println("start");}
        public void stop(){System.out.println("stop");}
        public void left(){System.out.println("left");};
        public void right(){System.out.println("right");};
    }
}
