package one.piece.wshcay_onepiece.service;

public class Main {

    public static void main(String[] args){
        
        PointSystem ps = new PointSystem();

        ps.addCharacters();
        ps.addPoint("Luffy", 10);
        ps.getMax();
        ps.addPoint("Zoro", 20);
        ps.addPoint("Zoro", 20);
        ps.getMax();
        ps.viewList();
    }
    
}
