import java.awt.*;

public class Giant extends Critter {

    private int numMove;
    private String[] word;
    private int arr_count;

    public Giant(){
        //numMove =0;
        word = new String[]{"fee","fie","foe","fum"};
        arr_count =0;
    }

    public Color getColor(){
        return Color.GRAY;
    }

    public String toString(){
        numMove++;

        if(numMove%6 == 0){
            arr_count++;
            if (arr_count > 3)
            {
                arr_count =0;
            }
            return word[arr_count];
        }else {


            return word[arr_count];
        }
    }
    public Action getMove(CritterInfo info){
        if(info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }else if(info.getFront() == Neighbor.EMPTY){
            return Action.HOP;
        }else {
            return Action.RIGHT;
        }
    }
}
