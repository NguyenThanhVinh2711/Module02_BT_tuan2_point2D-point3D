public class point2DTest {
    public static void main(String[] args) {
        point2D point2= new point2D(2,6);
        System.out.println(point2);
        for (float e: point2.getXY()
             ) {
            System.out.println(e);
        }
    }

}
