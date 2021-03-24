import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class CreateFile{
    
    public static void main(String[] args) {
        try {
            File myObj = new File("raghav.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());

                myWriter.write("Files in Java might be tricky, but it is fun enough!");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
                
            }
            else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
      e.printStackTrace();
        }
    }
}
