/**
 * Created by IntelliJ IDEA.
 * User: nicolasechavarria
 * Date: 3/19/12
 * Time: 9:01 PM
 * To change this template use File | Settings | File Templates.
 */

import acm.program.*;
import acm.util.*;

import java.io.*;
import java.util.*;

public class NameSurferTester extends ConsoleProgram {

    public void run() {
        getLine();
    }

    private void getLine() {
        try {
            BufferedReader rd = new BufferedReader(new FileReader(DATA_FILE));
            while (true) {
                line = rd.readLine();
                if (line == null) break;
                println(line);
                // Segments the the string in two parts, the name and the ranking data, using the
                // StringTokenizer Class
                println("In tokenizer");
                String result = "";
                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                while (tokenizer.hasMoreTokens()) {
                  String token = tokenizer.nextToken();
                  if (Character.isLetter(token.charAt(1))){
                      name = token;
                      println(name);
                  } else {
                      //TODO Change strings to integers
                      String[] ranking = new String[10];
                      for (int i = 0; i < 10; i++) {
                          println(token);
                          ranking[i] = token;  
                      }
                      println(ranking);
                  }
                }
                println(result);

                // Stores the key (string) and value    (array) for each name in a HashMap
                //names = new HashMap<String, Arrays>();
            }
            rd.close();
        } catch (IOException ex) {
            throw new ErrorException(ex);
        }

    }
                
    
    




    /* Private constants */
    private static final String DATA_FILE = "/Users/nicolasechavarria/Documents/Personal/Stanford University/SEE/CS106A/Assignments/CS106A_06/names-data-one-line.txt";

    /* Private instance variables */
    private String line;
    private HashMap<String, Arrays> names;
    private String name;
    

    
}
