import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (David Mario) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int lives = 3;
    public void act()
    {
        // Add your action code here.
        
        //menampilkan status
        showStatus();
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
    
    //Aksi ketika saling sentuh
     public void getTouch(){
        if(isTouching(Enemy.class)||isTouching(LaserEnemy.class))
        {
            getWorld().addObject(new Boom(),getX(),getY());
            setLocation(112,180);
            removeLife();
        }
    }
    //Enemy melewati layar lives hero berkurang
    //public void endLives(){
    //     if(isAtEdge(getEnemy())
    //    {
    //        removeLife();
    //    }
    //   }
    
    //mengurangi nyawa
    public void removeLife(){
        showStatus();
        lives--;
        testEndGame();
        }
    //Game Over
    public void testEndGame(){
        if(lives<0){
            setImage(new GreenfootImage("gameover.png"));
            setLocation(310,180);
            Greenfoot.stop();
        }
    }
    //Menampilkan text status
    public void showStatus(){
        getWorld().showText("Lives : "+lives,71,360);
    }
}
