/*
 * File: NameSurferEntry.java
 * --------------------------
 * This class represents a single entry in the database.  Each
 * NameSurferEntry contains a name and a list giving the popularity
 * of that name for each decade stretching back to 1900.
 */
import acm.program.*;
import acm.util.*;
import java.io.*;
import java.util.*;


public class NameSurferEntry extends ConsoleProgram implements NameSurferConstants {

/* Constructor: NameSurferEntry(line) */
/**
 * Creates a new NameSurferEntry from a data line as it appears
 * in the data file.  Each line begins with the name, which is
 * followed by integers giving the rank of that name for each
 * decade.
 */
	public NameSurferEntry(String line) {
        // Reads the line from the speficied file and stores it in "line"
        try {
            BufferedReader rd = new BufferedReader(new FileReader(DATA_FILE));
            while (true) {
                line = rd.readLine();
                if (line == null) break;
                println(line);
            }
            rd.close();
        } catch (IOException ex) {
            throw new ErrorException(ex);
        }
        // Segments the the string in two parts, the name and the ranking data, using the
        // StringTokenizer Class



        // Stores the key and value for each name in a HashMap
        names = new HashMap<String, Arrays>();
    }

/* Method: getName() */
/**
 * Returns the name associated with this entry.
 */
	public String getName() {
		// You need to turn this stub into a real implementation //
		return null;
	}

/* Method: getRank(decade) */
/**
 * Returns the rank associated with an entry for a particular
 * decade.  The decade value is an integer indicating how many
 * decades have passed since the first year in the database,
 * which is given by the constant START_DECADE.  If a name does
 * not appear in a decade, the rank value is 0.
 */
	public int getRank(int decade) {
        // You need to turn this stub into a real implementation //
        return 0;
	}

/* Method: toString() */
/**
 * Returns a string that makes it easy to see the value of a
 * NameSurferEntry.
 */
	public String toString() {
		// You need to turn this stub into a real implementation //
		return "";
	}


/* Private constants */
    private static final String DATA_FILE = "/Users/nicolasechavarria/Documents/Personal/Stanford University/SEE/CS106A/Assignments/CS106A_06/names-data-one-line.txt";

/* Private instance variables */
    private String record;
    private HashMap<String, Arrays> names;
    
}

