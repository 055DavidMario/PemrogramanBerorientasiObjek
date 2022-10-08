import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class  RobotWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public  RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,465,155);
        
        Scorepane scorepane = new Scorepane();
        addObject(scorepane,132,150);
        
        Home home = new Home();
        addObject(home,461,263);
        
        Block block = new Block();
        addObject(block,130,208);
        
        Robot robot = new Robot();
        addObject(robot,401,309);
        
        Pizza pizza = new Pizza();
        addObject(pizza,80,257);
        
        pizza.setLocation(347,143);
        robot.setLocation(372,306);
    }
}
