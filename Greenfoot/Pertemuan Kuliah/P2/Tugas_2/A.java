import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Enemy
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //memanggil constructor / tukang untuk bekerja
    public A()
    {
        setRotation(360);
    }
    
    //memanggil tukang yang lain untuk bekerja dengan isi (int)
    public A(int speed) //disebut internal variabel
    {
        setRotation(360);
        this.speed = speed; //this = memanggil class atau diri sendiri
    }
    
    public int speed = -4;
    
    public void act() //60 per detik
    {
        // Add your action code here.
        //setRotation(180);
        move(speed);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
