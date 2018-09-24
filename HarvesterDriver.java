import kareltherobot.*;
/**
 * Write a description of class NasaBotDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HarvesterDriver implements Directions
{
    public static void main(String args[])
    {
        Harvester karel = new Harvester(2,2,East, 0);
        karel.harvestField();
    }
    static
    {
    	World.reset();	
    	World.readWorld("ch3_3.kwld");
    	World.setDelay(1);
    	World.setVisible(true);    	
    }
    
}
