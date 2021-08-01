import greenfoot.*; 
public class WSEuropa extends World
{   
    public static int score;
    public WSEuropa()
    {    
        super(1300, 700, 1); 
        addObject (new BMapa(),760,335); //agrega botón para regresar al mapa principal
        addAllScores();
    }

    public void addAllScores()
    {
        score = EuropaW5.score;
        showText("Tu punteo final es: " + score +"/5", 555,344);
    }
}
