import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava{
    public ArrayList tenRolls(){
        ArrayList<Object> newArr = new ArrayList<Object>();
        for(int i = 0; i<10; i++){
            newArr.add((int)Math.floor(Math.random()*20+1));
        }
        return newArr;
    }
    public char randLetter(){
        Random rand = new Random();
        char c = ((char)(rand.nextInt(26) + 'a'));
        return c;
    }
    protected String generatePassword() {
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder str = new StringBuilder();
        Random rnd = new Random();
        while (str.length() < 8) {
            int index = (int) (rnd.nextFloat() * str1.length());
            str.append(str1.charAt(index));
        }
        String newStr = str.toString();
        return newStr;
    }
    public String getNewPassword(int length1){
        String str1 = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder str = new StringBuilder();
        Random rnd = new Random();
        while (str.length() < length1) {
            int index = (int) (rnd.nextFloat() * str1.length());
            str.append(str1.charAt(index));
        }
        String newStr = str.toString();
        return newStr;
    }
}