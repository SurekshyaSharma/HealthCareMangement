/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatabaseReader {

    public String[][] DB() {

        String csvFile = "database.txt";// The name of the file to open.
        String line = "";
        String cvsSplitBy = ",";
        String[][] user = new String[100][20];

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
            	//read first line.
                // use comma as separator
                String[] x = line.split(cvsSplitBy); 
                if(x[0]!=null)
                user[Integer.parseInt(x[0])] = x;                
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return user;

    }

}*/