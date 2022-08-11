public class point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public  point2D(){

    }
    public point2D (float x, float y ){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float[] arr = new float[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }

    public String toString(){
        return "Get x = " + getX() +", " + "Get y = " + getY()  ;
    }
}
