import greenfoot.*; 

public class EW2 extends Actor //Botón siguiente
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new EuropaW2()); //cambia al siguiente mundo
            
            Greenfoot.playSound("next.wav"); //suena para indicar que se ha dado click
            //fuente: https://mixkit.co/free-sound-effects/game/?page=2
        }
    }    
}
