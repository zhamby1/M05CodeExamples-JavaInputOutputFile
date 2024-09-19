import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        //crate an output stream to a file
        FileOutputStream output = new FileOutputStream("temp.dat");
        for(int i = 1; i <= 10; i++){
            output.write(i);
        }

        //create input stream to read data

        FileInputStream input = new FileInputStream("temp.dat");
        int value;
        //-1 represent end of file
        while((value = input.read()) != -1){
            System.out.print(value + " ");
        }

    }
}