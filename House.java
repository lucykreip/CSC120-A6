/* This is a stub for the House class */
import java.util.ArrayList;

public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;
 
  /*
    * constructs a Cafe
    * @param name Assigns a String name to the house
    * @param address Assigns a String address to the house
    * @param nFloors Assigns an int number of floors to the house
    */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  }

  /*
     * checks the given value for if the house has a dining room
     * @return boolean value for whether or not the house has a dining room
     */
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  /*
     * provides the number of residents in the house
     * @return the length of the residents list in the house
     */
  public int nResidents(){
    return residents.size();
  }

  /*
     * adds the resident to the house if they move in
     * @param name Added to the residents ArrayList
     */
  public void moveIn(String name){
    if (! residents.contains(name)){
      residents.add(name);
    }
    else{
      throw new RuntimeException(name + " already lives here!");
    }
  }

  /*
     * removes given resident from the house then they move out, unless they do not live in the house currently
     * @param name Person to be removed from the residents ArrayList
     * @return The name of the resident who moved out
     */
  public String moveOut(String name){
    if (! isResident(name)){
      throw new RuntimeException(name + " does not live here.");
    }
    else{
      residents.remove(name);
    }
    return name;
  }

  /*
     * checks if a person is a resident
     * @param person String to be checked in the residents ArrayList for
     * @return boolean Whether or not the person is a resident
     */
  public boolean isResident(String person){
    boolean isRes = true;
    if (residents.contains(person)){
      isRes = true;
    }
    else{
      isRes = false;
    }
    return isRes;
  }

  public static void main(String[] args) {
    House myHouse = new House("Lucy's House", "15 Maple St.", 4, true);
    System.out.println(myHouse);
    System.out.println(myHouse.hasDiningRoom());
    myHouse.moveIn("Lucy");
    System.out.println(myHouse.nResidents());
    System.out.println(myHouse.isResident("Lucy"));


    
  }

}