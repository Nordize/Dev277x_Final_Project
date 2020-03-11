import java.awt.*;

public class NinjaCat extends Critter {

    public NinjaCat(){

    }

    public Color getColor(){
        return Color.MAGENTA;
    }

    public String toString(){
        return "NC";
    }
    public Action getMove(CritterInfo info){
        if(info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        }else if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        }else {
            return Action.LEFT;
        }
    }
}
