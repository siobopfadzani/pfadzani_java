public  class PointDemo{
    public void enlargeAndPoint(Point point)
    {
        point.setX(point.getX() * 2);
        point.setY(point.getY() * 2);
        System.out.println(point);
    }
    public static void main(String[]args)
    {
        Point point = new Point(100,200);
        new PointDemo().enlargeAndPoint(point);
//        System.out.println(" "+ point);
    }

}