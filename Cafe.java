/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups;

    /*
     * constructs a Cafe
     * @param name Assigns a String name to the cafe
     * @param address Assigns a String address to the cafe
     * @param nFloors Assigns an int number of floors to the cafe
     */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 50;
        this.nCreams = 50;
        this.nCups = 50;
        System.out.println("You have built a cafe: ☕");
    }

    /*
     * reduces number of each parameter by the associated value when a coffee is sold, as well as cup by 1
     * @param nCoffeeOunces Amount of coffee bought
     * @param nSugarPackets Amount of sugar packets used
     * @param nCreams Amount of cream splashes used
     */
    public void sellCoffee(int nCoffeeOunces, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= nCoffeeOunces;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        if (this.nCoffeeOunces < 10){
            this.restock(100, 50, 50, 50);
        }

    }

    /*
     * restocks the parameters to entered values
     * @param nCoffeeOunces Amount of coffee to restock to
     * @param nSugarPackets Amount of sugar to restock to
     * @param nCreams Amount of cream to restock to
     * @param nCups Amount of cups to restock to
     */

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    
    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Lu's Cafe", "1 Chapin Way", 1);
        myCafe.sellCoffee(12, 5, 10);
        System.out.println(myCafe.nCoffeeOunces);
        System.out.println(myCafe.nSugarPackets);
        System.out.println(myCafe.nCreams);
        System.out.println(myCafe.nCups);
        myCafe.sellCoffee(80, 5, 10);
        System.out.println(myCafe.nCoffeeOunces);
        System.out.println(myCafe.nSugarPackets);
        System.out.println(myCafe.nCreams);
        System.out.println(myCafe.nCups);
        System.out.println(myCafe);
    }
    
}
