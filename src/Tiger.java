import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {

    private Random rand;
    private static Color[] COLORS = {Color.RED,Color.GREEN,Color.BLUE};
    private int numMove;
    private Color currentColor;

    public Tiger(){
        rand = new Random();
    }

    @Override
    public Color getColor() {

        if(numMove ==0){
            currentColor = COLORS[rand.nextInt(COLORS.length)];
        }

        return currentColor;



    }

    public String toString(){
        return "TGR";
    }

    public Action getMove(CritterInfo info){
        numMove++;
        numMove %= 3;

        if(info.getFront() == Neighbor.OTHER) {
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
