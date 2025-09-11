/**
 * An example of a program that uses the Catalog class
 *
 * @author Gabriela Montoya
 */
public class catalogExample2 {
    
    /**
     * code to be executed when running this class
     * @param args an array with the Strings passed when are invoking this program
     * 
     * This main expects that at least one String is passed when it is invoked
     * and it is shows that String in the standard output if it is in catalog
     *
     * ... but it does not work as expected ...
     * can you identify the problem?
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
        String c = args[0];
        System.out.println("Course to find: *"+c+"*");
        String result = courses.find(c);
        System.out.println(result);
    }
}
