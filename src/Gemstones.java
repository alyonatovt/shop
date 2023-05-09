public class Gemstones {
    private String name;
    private double carat;
    private String color;

    public Gemstones(String name, double carat, String color) {
        this.name = name;
        this.carat = carat;
        this.color = color;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getCarat(){
        return carat;
    }
    public void setCarat(double carat){
        this.carat = carat;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }



}
