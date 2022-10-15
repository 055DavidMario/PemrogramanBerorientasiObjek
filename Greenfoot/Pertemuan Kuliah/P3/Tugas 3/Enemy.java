import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //memanggil constructor / tukang untuk bekerja
    public Enemy()
    {
        setRotation(180);
    }
    
    //memanggil tukang yang lain untuk bekerja dengan isi (int)
    public Enemy(int speed) //disebut internal variabel
    {
        setRotation(180);
        this.speed = speed; //this = memanggil class atau diri sendiri
    }
    
    public void removeEnemy()
    {
        if(isAtEdge())
        {
            // menghapus object dari world ketika sudah di ujung
            getWorld().removeObject(this); 
        }
    }
    
    public int speed = 1;
    
    public void act() //60 per detik
    {
        // Add your action code here.
        //setRotation(180);
        move(speed);
        removeEnemy();       
        shootLaser();
    }
    
    int laserTimer = 0;
    public void shootLaser()
    {
        if (laserTimer == 120){
            getWorld().addObject(
            new LaserEnemy(),
            getX() - 60,
            getY()
            );
            laserTimer = 0;
        }else{
            laserTimer++;
        }
    }
}