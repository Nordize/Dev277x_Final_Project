import java.awt.*;

public class WhiteTiger extends Critter {

    private int infected;

    public WhiteTiger(){
        infected = 0;
    }

    public Color getColor(){
        return Color.WHITE;
    }

    public String toString(){
        if(infected == 1){
            return "TGR";
        }else {
            return "tgr";
        }
    }
    public Action getMove(CritterInfo info){


        if(info.getFront() == Neighbor.OTHER) {
            infected = 1;
            return Action.INFECT;
        }else if((info.getFront() == Neighbor.WALL) || (info.getRight() == Neighbor.WALL)){
            return Action.LEFT;
        }else if(info.getFront() == Neighbor.SAME){
            return Action.RIGHT;
        }else {
            return Action.HOP;
        }
    }
}
