import greenfoot.*; 
public class WSAfrica extends World
{   
    public static int score;
    public WSAfrica()
    {    
        super(1300, 700, 1); 
        addObject (new BMapa(),760,335); //agrega botón para regresar al mapa principal
        addAllScores();
    }

    public void addAllScores()
    {
        score =AfricaW5.score;
        showText("Tu punteo final es: " + score +"/5", 555,344);
    }

}
