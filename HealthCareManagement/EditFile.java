import java.io.*;

public class EditFile {

public static void main(String[] args) {

    try{
        String verify, putData;
        File file = new File("src/file.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("shutup, U ,are, right, ");
        bw.flush();

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        while( (verify=br.readLine()) != null )
        { 
            if(verify != null)
            {
                putData = verify.replaceAll("name","");
                bw.write(putData);
            }
        }
        br.close();
        bw.close();

    }catch(IOException e){
    e.printStackTrace();
    }
}
}