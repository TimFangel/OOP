/**
 * An example of a program that mainly follows the imperative paradigm
 *
 * @author Gabriela Montoya
 */
public class imperativeProgramExample {

    /**
     * code to be executed when running this class
     * @param args an array with the Strings passed when are invoking this program
     * 
     * This main ignores any input given as parameter and writes in the standard 
     * output "OOP"
     *
     */
    public static void main(String[] args) {
        String[ ] courses = {"OOP", "SU", "DEB", "ALG", "IWP", "SLIAL", "DTG", "IMPR", "PBL"};
        String result = null;

        for (int i=0; i < courses.length; i++) {
            if (courses[i]=="OOP") {
                result = courses[i];
            }
        }
        System.out.println(result);
    }
}