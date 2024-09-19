import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
        //test scores and students
        //writeUTF writes strings
        output.writeUTF("Liam");
        output.writeDouble(85.5);
        output.writeUTF("Susan");
        output.writeDouble(95.0);
        output.writeUTF("Chandra");
        output.writeDouble(55.0);


        DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));

        while(input.available() > 0) {
            System.out.println(input.readUTF() + " " + input.readDouble());
        }



    }
}