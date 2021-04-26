import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close){
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimiters(String[] tokens){
        ArrayList<String> del = new ArrayList<String>();
        for(int i=0;i<=tokens.length;i++){
            if(tokens[i].equals(openDel) || tokens[i].equals(closeDel)){
                del.add(tokens[i]);
            }
        }
        return del;
    }

    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int o = 0;
        int c = 0;
        for (String str : delimiters)
        {
            if (str.equals(openDel))
                o++;
            else
                c++;
            if (c > o)
                return false;
        }
        if (o == c)
            return true;
        else
            return false;
    }

}
