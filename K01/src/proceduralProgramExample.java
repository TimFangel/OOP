/**
 * An example of a program that mainly follows the procedural paradigm
 *
 * @author Gabriela Montoya
 */
public class proceduralProgramExample {

    /**
     * procedure that finds an element in an array of elements
     * @param array an array with elements
     * @param elem an elem to find in array
     * 
     * @return Returns the element if it is in the array or null otherwise
     *
     */
    public static String find(String[] array, String elem) {

        String res = null;

        for (int i=0; i < array.length; i++) {
            if (array[i]==elem) {
                res = array[i];
            } 
        }    
        return res;
    }

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
        String result = find(courses, "OOP");
        System.out.println(result);
    }
}