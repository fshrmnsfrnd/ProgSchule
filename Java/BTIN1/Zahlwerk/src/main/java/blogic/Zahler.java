package blogic;

public class Zahler{
    private int stand = 0;
    
    public void inkrementieren(){
        this.stand++;
    }
    
    public int getStand(){
        return this.stand;
    }
    
    public void reset(){
        this.stand = 0;
    }
    
    public void setStand(int standNeu){
        if(standNeu >= 0){
            this.stand = standNeu;
        }
    }
}
