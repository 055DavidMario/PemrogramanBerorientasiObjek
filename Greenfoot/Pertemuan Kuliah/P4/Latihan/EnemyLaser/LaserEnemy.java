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
    private int speed = 3  ;
    public void act()
    {
        // Add your action code here.
        move(speed);
        setRotation(180);       
        laserCollision();
    }
    
    private void laserCollision(){
        if (isTouching(Laser.class)){
            getWorld().addObject(
            new Boom(),
            getX(),
            getY()
            );
            removeTouching(Laser.class); //ketika terkena laser hero
            getWorld().removeObject(this); //enemy mati
        }else if (isAtEdge())
            getWorld().removeObject(this); //ketika diujung enemy hilang
        }
}
