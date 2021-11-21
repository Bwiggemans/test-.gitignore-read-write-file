package nl.novi;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class readerWriter {
    private File file;
    private FileWriter pen;
    private BufferedWriter printer;
    private String tekst;
    private Scanner scan;

    public readerWriter(){

    }
    public void setTekst(String t){
       this.tekst = t;
    }
    public void write(String f){
        try{
            this.file = new File(f);
            this.pen = new FileWriter(this.file);
            this.printer = new BufferedWriter(this.pen);
            this.printer.write(this.tekst);
            this.printer.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void read(String f){
        try{
            this.file = new File(f);
            this.scan = new Scanner(this.file);
            this.tekst = "";
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                this.tekst += line;
        }
        System.out.println(this.tekst);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
