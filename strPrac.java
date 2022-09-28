import java.util.*;
import java.io.*;

public class strPrac {
    public static void main (String[] args) throws Exception{
        File myFile = new File ("./Top_40s_September_22.txt");
        try{
            Scanner myScanner = new Scanner(myFile);
            while(myScanner.hasNext()){
                System.out.println(myScanner.nextLine().substring(0,1));
            }
        }
        catch(Exception e){
            System.out.println("failed sadge :(");
        }
    }
}
