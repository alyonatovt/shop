public class Jewellery {
    private String earrings;
    private String necklace;
    private String ring;

    public Jewellery(String earrings, String necklace, String ring) {
        this.earrings = earrings;
        this.necklace = necklace;
        this.ring = ring;
    }

    public String getEarrings(){
        return earrings;
    }

    public void setEarrings(){
        this.earrings = earrings;
    }
    public  String getNecklace(){
        return necklace;
    }
    public void setNecklace(){
        this.necklace = necklace;
    }
    public  String getRing(){
        return ring;
    }
    public void setRing(){
        this.ring = ring;
    }
}
