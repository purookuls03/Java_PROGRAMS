package File_handling;
import java.io.*;
import java.util.*;

public class FileRead {
    public Scanner s;
    public void OpenFile() {
        try {
             s = new Scanner(new File("Puroo.txt"));
        }
        catch(Exception e){
            System.out.println("File not found...");
        }
    }
    public void ReadFile(){
        while(s.hasNext())
        {
            System.out.print(s.next()+" ");
        }
    }
    public void CloseFile(){
        s.close();
    }

    public static void main(String[] args) {
        FileRead r = new FileRead();
        r.OpenFile();
        r.ReadFile();
        r.CloseFile();
    }

}
