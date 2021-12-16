class Area{
    private double length;
    private double bredth;
    Area(double length , double bredth){
        this.length =length;
        this.bredth= bredth;
    }
    public double ReturnArea(){
        return (length * bredth);
    }
}