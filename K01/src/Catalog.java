/**
 * A class Catalog that stores a collection of elements 
 *
 * @author Gabriela Montoya
 */
public class Catalog {

    private String[] elems;
    private int size;
    
    /**
     * Constructor that creates a catalog with the maximum size given 
     * as parameter
     * @param maxSize the maximum size that the objects of this class can have
     */
    public Catalog(int maxSize) { 
        this.elems = new String[maxSize];
        this.size = 0;
    }
    
    /**
     * an instance method that adds one element to the catalog
     * @param e the element to add
     */
    public void addElem(String e) { 

        this.elems[size] = e; 
        this.size++;
    } 
    
    /**
     * an instance method that finds an element in the catalog
     * @param e an elem to find in the catalog
     * 
     * @return Returns the element if it is in the catalog or null otherwise
     *
     */    
    public String find(String e) {
        String res = null;
        for (int i=0; i < this.elems.length; i++) {
            String currentElem = this.elems[i];
            if (currentElem==e) {
                res = currentElem;
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