import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Person myperson = new Person("Zach",39);
//
//        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));
//        output.writeObject(myperson);
//        output.writeObject(new java.util.Date()

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("object.dat"));
        Person inputPerson = (Person)(input.readObject());
        java.util.Date date = (java.util.Date)(input.readObject());
        System.out.println(inputPerson.name + " " + inputPerson.age + " " + date);





    }
}