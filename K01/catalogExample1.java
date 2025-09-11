/**
 * An example of a program that uses the Catalog class
 *
 * @author Gabriela Montoya
 */
public class catalogExample1 {
    
    /**
     * code to be executed when running this class
     * @param args an array with the Strings passed when are invoking this program
     * 
     * This main ignores any input given as parameter and writes in the standard 
     * output "OOP"
     *
     */
    public static void main(String[] args) {

        Catalog courses = new Catalog(45);
        courses.addElem("OOP");
        courses.addElem("SU");
        courses.addElem("DEB");
        courses.addElem("ALG");
        courses.addElem("IWP");        
        courses.addElem("SLIAL");
        courses.addElem("DTG");
        courses.addElem("IMPR");        
        courses.addElem("PBL");
        String result = courses.find("OOP");
        System.out.println(result);
    }
}
