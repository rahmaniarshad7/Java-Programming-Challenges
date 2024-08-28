public class Triangle implements Shape{
    private final double base;
    private final double height;
    
    public Triangle(double base , double height){
        this.base = base;
        this.height = height;
    }


    /**
     * @return 
     */
    @Override
    public double getArea() {

        return 0.5 * (base * height);
    }
}
