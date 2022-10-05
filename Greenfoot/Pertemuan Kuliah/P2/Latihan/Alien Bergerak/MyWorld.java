import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
        Hero hero = new Hero();
        addObject(hero,112,180);

        Enemy enemy = new Enemy();
        addObject(enemy,555,60);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,282,265);
        Enemy enemy3 = new Enemy(6);
        addObject(enemy3,547,359);
        enemy3.setLocation(552,360);
        enemy3.setLocation(33,344);
        enemy3.setLocation(552,338);
    }
}
