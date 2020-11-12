/*import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	String ln="";
	public Writer(String[][] user)
	{
		try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter("src/database.txt");

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

			
           	for (String[] u : user)
			{
				for(int i=0; i<=16; i++)
					{
						if(u[i]!=null)
						{
							if(i==16)
							{
							ln += u[i]+"\n";
							}
							else
							{
								ln += u[i]+",";
							}
						}
					}								
			}
           	
           	bufferedWriter.write(ln);
           	//System.out.println(ln);

           // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + "database.txt" + "'");
               
        }
	}
}
*/