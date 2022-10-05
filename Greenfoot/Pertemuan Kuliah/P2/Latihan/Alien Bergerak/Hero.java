import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        //Menggerakkan ke atas
        if (Greenfoot.isKeyDown("W"))
            setLocation(getX(), getY()-3);
        if (Greenfoot.isKeyDown("Up"))
            setLocation(getX(), getY()-3);
        
        //Menggerakkan ke bawah
        if (Greenfoot.isKeyDown("S"))
            setLocation(getX(), getY()+4);
        if (Greenfoot.isKeyDown("Down"))
            setLocation(getX(), getY()+4);
        
        //Menggerakkan ke kiri
        if (Greenfoot.isKeyDown("A"))
            setLocation(getX()-3, getY());
        if (Greenfoot.isKeyDown("Left"))
            setLocation(getX()-3, getY());
        
        //Menggerakkan ke kanan
        if (Greenfoot.isKeyDown("D"))
            setLocation(getX()+4, getY());
        if (Greenfoot.isKeyDown("Right"))
            setLocation(getX()+4, getY());
    }
}
