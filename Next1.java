import greenfoot.*; 

public class Next1 extends Actor //Botón siguiente
{
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Mapa()); //cambia al siguiente mundo
            
            Greenfoot.playSound("next.wav"); //suena para indicar que se ha dado click
            //fuente: https://mixkit.co/free-sound-effects/game/?page=2
        }
    }    
    
    public Next1()
    {
        setImage(new GreenfootImage("Haz Click para continuar",25,greenfoot.Color.BLACK,greenfoot.Color.WHITE));
    }
    
}
