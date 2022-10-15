import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserEnemy extends Actor
{
    /**
     * Act - do whatever the LaserEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int speed = 2  ;
    public void act()
    {
        // Add your action code here.
        move(speed);
        setRotation(180);       
        laserCollision();
    }
    
     public void laserCollision(){
        if (isTouching(Laser.class)){
            getWorld().addObject(
            new Boom(),
            getX(),
            getY()
            );
            removeTouching(Laser.class);
            getWorld().removeObject(this);
        }else if (isAtEdge())
            getWorld().removeObject(this);
        }
    
}
