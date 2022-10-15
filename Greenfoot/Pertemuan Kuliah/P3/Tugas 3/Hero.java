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
        
        //move hero from keyboard
        moveHero();
        //laser
        shootLaser();
        //aksi
        getTouch();
    }
    
    public void moveHero()
    {
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
    
    public void shootLaser()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new Laser(), getX()+50,getY());
        }
    }
    
    //int laserTimer = 0;
    //public void shootLaser(){
    //    if (laserTimer == 30){
    //       getWorld().addObject(
    //        new Laser(),
    //        getX() + 5,
    //        getY()
    //        );    
    //        laserTimer = 0;
    //    }else{
    //        laserTimer++;
        //}
    //}
    
     public void getTouch()
    {
        if(isTouching(Enemy.class)||isTouching(LaserEnemy.class))
        {
            getWorld().addObject(new Boom(),getX(),getY());
            setLocation(112,180);
        }
}
}