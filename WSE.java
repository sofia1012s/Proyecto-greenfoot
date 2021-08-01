import greenfoot.*; 

public class WSE extends Actor //Botón siguiente
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new WSEuropa()); //cambia al siguiente mundo
            
            Greenfoot.playSound("next.wav"); //suena para indicar que se ha dado click
            //fuente: https://mixkit.co/free-sound-effects/game/?page=2
        }
    }    
}
