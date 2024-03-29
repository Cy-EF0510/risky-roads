import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Oak_log extends Actor
{
    public void act()
    {
        Actor wombat = getOneIntersectingObject(test.class);
        if (wombat != null)
        {
            getWorld().removeObject(wombat);
            Greenfoot.stop();
        }
        if (getX() == getWorld().getWidth()-1 || getY() == getWorld().getHeight()-1) 
        {
            getWorld().removeObject(this);
        } else {
            move(1);
            moveScrollingLog();
        }
    }
    public void moveScrollingLog()
    {
        setLocation(getX(),getY()+1);
    }
}