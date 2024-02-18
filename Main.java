import java.io.*;
public class Main {
    public static void main(String []args){
        //System.out.println("Hello World");

            CitiesReader("cities");


    }
    public static void CitiesReader(String filename) {
        try(FileReader fr = new FileReader(filename + ".txt")) {
            int i;
            while((i = fr.read()) != -1){

                System.out.print((char)i);
            }
        }
        catch (IOException e){
            System.out.print(e.getMessage());
        }


    }
}
