package sample;

class Circle {

    private float radius;
    private Point center;

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }
    public Circle( float radius) {
        
        this.radius = radius;
    }

  
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public float getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

     class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;

        }

        public void setY(int y) {
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public int getX() {
            return x;
        }
    }

    @Override
    public String toString() {

        return "Center: " + "(" + center.getX() + "," + center.getY() + ")" + "\nRadius: " + this.getRadius()
                + " centimeters";
    }
    public static void main (String ... ar) {
    		Circle c= new Circle(5.76f);
    		c.setCenter( c.new Point(3,4));
    	System.out.println(c);
    }

}