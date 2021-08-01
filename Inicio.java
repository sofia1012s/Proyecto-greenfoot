import greenfoot.*; 

/**
 * Pantalla de inicio del juego
 */

public class Inicio extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("inicio.mp3"); //musica de fondo    
    //fuente: https://www.bensound.com/royalty-free-music/track/acoustic-breeze
    /**
     * Tamaño de la pantalla, se adecua al de una computadora
     */
    public Inicio()
    {    
        super(1300, 700, 1); 
        prepare();
    }
    public void act()
    {
        backgroundMusic.playLoop(); //da play a la musica de fondo
    }
    
    private void prepare()
    {
        Next1 next1 = new Next1();
        addObject(next1,658,398);
        next1.setLocation(651,383);
    }
}
