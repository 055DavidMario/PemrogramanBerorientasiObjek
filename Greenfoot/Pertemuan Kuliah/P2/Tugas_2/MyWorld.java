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
    
    public void act()
    {
        addEnemy();
    }
    public void addEnemy()
    {
        if(Greenfoot.getRandomNumber(400)<3) //400 = waktu , 3 = x enemy muncul
        {
            addObject(new Enemy(),600,Greenfoot.getRandomNumber(400));
        }
        
        if(Greenfoot.getRandomNumber(100)<1) //100 = waktu , 1 = x enemy muncul
        {
            addObject(new A(),600,Greenfoot.getRandomNumber(400));
        }
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
        addObject(enemy,538,38);
        Enemy enemy3 = new Enemy(6);
        addObject(enemy3,552,338);
        A a2 = new A();
        addObject(a2,247,86);
    }
}