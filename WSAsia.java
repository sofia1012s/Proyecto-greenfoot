import greenfoot.*; 
public class WSAsia extends World
{   
    public static int score;
    public WSAsia()
    {    
        super(1300, 700, 1); 
        addObject (new BMapa(),760,335); //agrega botón para regresar al mapa principal
        addAllScores();

    }

    public void addAllScores()
    {
        score =AsiaW5.score;
        showText("Tu punteo final es: " + score +"/5", 555,344);
    }

 }
