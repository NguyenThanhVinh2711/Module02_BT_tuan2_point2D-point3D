public class point3Dtest {
    public static void main(String[] args) {
        point3D point3 = new point3D(1,2,3);
        System.out.println(point3);
        for (float e: point3.getXYZ()
        ) {
            System.out.println(e);
        }
    }
}
