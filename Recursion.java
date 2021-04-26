public class Recursion {
    public static String convertToHex(int h){
        final char[] charHex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int num;
        String strHex = "";
        if(h != 0) {
            num = h % 16;
            strHex = charHex[num] + strHex;
            h = h / 16;
            convertToHex(h);
            }
            return strHex;
        }
    }