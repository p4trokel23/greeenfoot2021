import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flower extends Actor
{
    public flower()
    { 
        GreenfootImage gfi = new GreenfootImage("rainbow flower.jpg");
        gfi.scale(60,60);
        this.setImage(gfi);
        
    }// gfi has no meaning
    


    public void act()
    {
        this.turn(5);
        System.out.println(this.getRotation());
        if(this.getRotation() ==0)
        {
         World W = this.getWorld();
        // W.remveObject(this);
        }
    }
        
}
