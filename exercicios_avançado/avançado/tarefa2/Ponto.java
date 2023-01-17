public class Ponto {
    private double x;
    private double y;

    public Ponto(){
        x = 1;
        y = 1;
    }
    public Ponto(String x , String y){
        double x1 = Double.parseDouble(x);
        double y1 = Double.parseDouble(y);
    }
    public Ponto(Ponto xy){
        setX(xy.getX());
        setY(xy.getY());
    }
    public void setX (double x) {
        this.x = x;
    }
    public void setX(String x){
        double x1 = Double.parseDouble(x);
        this.x = x1;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setY (String y) {
        double y1 = Double.parseDouble(y);
        this.y = y1;
    }
    public void desloca (double dx, double dy) {
        setX(x + dx);
        setY(y + dy);
    }
    public void desloca (String dx, String dy){
        double dx1 = Double.parseDouble(dx);
        double dy1 = Double.parseDouble(dy);
        setX(x + dx1);
        setY(x + dy1);
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
//reposta do D , não é necessario mudar os gets pois a sobrecarga eh direcionada atraves das variaveis que eles recebem.


