/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;

  /*
    * constructs a Library
    * @param name Assigns a String name to the library
    * @param address Assigns a String address to the library
    * @param nFloors Assigns an int number of floors to the library
    */
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

  /*
     * adds the given title to the library collection
     * @param title The title that is to be added
     */

  public void addTitle(String title){
    collection.put(title, true);
  }

  /*
     * removes the given title to the library collection
     * @param title The title that is to be removed
     * @return Returns the title that was just removed
     */
  public String removeTitle(String title){
    collection.remove(title);
    return title;
  }

  /*
     * checks out a book by changing the hashtable value of the given title to be false if it was true
     * @param title The title that is to be checked out
     */

  public void checkOut(String title){
    collection.replace(title, true, false);
  }

  /*
     * returns a book by changing the hashtable value at the given title to be true if it was false 
     * @param title The title that is to be returned
     */

  public void returnBook(String title){
    collection.replace(title, false, true);
  } 

  /*
     * checks the collection for a certain title
     * @param title The title that is serached for within the collection
     * @return returns if the key is found in the collection (true/false)
     */

  public boolean containsTitle(String title){
    return collection.containsKey(title);
  } 

  /*
     * returns true if title is currently availible, and false if not
     * @param title The title that's availibility is to be checked
     * @return true if the title is availible, flase if not. 
     */
  public boolean isAvailable(String title){
    if (collection.getOrDefault(title, false) == true){
      return true;

    }
    else{
      return false;
    }
  } 

  /*
     * prints out the collection of titles and their true/false value
     */
  public void printCollection(){
    System.out.println("Our Collection:");
    System.out.println(collection.toString());
    
  } // prints out the entire collection in an easy-to-read way (including checkout status)
  
  public static void main(String[] args) {
    Library myLibrary = new Library("Lucy's Library", "15 Maple St", 5);
    myLibrary.addTitle("All about Geese");
    myLibrary.addTitle("All bout Java");
    myLibrary.addTitle("Pride and Prejudice");
    System.out.println(myLibrary.containsTitle("Random"));
    System.out.println(myLibrary.isAvailable("All about Geese"));
    myLibrary.checkOut("All about Geese");
    myLibrary.printCollection();
  }
  
}