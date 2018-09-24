import kareltherobot.*;
/**
 * Write a description of class Pinsetter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Harvester extends UrRobot
{
    /**
     * Constructor for objects of class Pinsetter
     */
    public Harvester(int st, int ave, Direction dir, int beeps)
    {
        super (2,2, East, 0);
    }
    
    public void harvestField()
    {
        move();
        harvestOneRow();
        nextRowEast();
        harvestOneRow();
        nextRowWest();
        harvestOneRow();
        nextRowEast();
        harvestOneRow();
        nextRowWest();
        harvestOneRow();
        nextRowEast();
        harvestOneRow();
        move();
        
        
    }
    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
        
    }
    public void harvestOneRow()
    {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        
        
    }   
    public void nextRowEast()
    {
        turnLeft();
        move();
        turnLeft();
        
        
    }
    public void nextRowWest()
    {
        turnRight();
        move();
        turnRight();
        
        
    }
}
