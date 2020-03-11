import java.awt.*;

public class Bear extends Critter {

    private boolean polar;
    private String display = "\\";

    public Bear(boolean polar){

        this.polar = polar;

    }

    @Override
    public Color getColor() {
        if(polar){
            return Color.WHITE;
        }else {
            return Color.BLACK;
        }
    }

    public String toString(){
        if(this.display.equals("\\") ){
            return "/";
        }else {
            return "\\";
        }
    }

    public Action getMove(CritterInfo info){
        if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        }else if(info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }else {
            return Action.LEFT;
        }
    }


}
