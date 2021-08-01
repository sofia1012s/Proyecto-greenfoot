import greenfoot.*; 

public class AsiaW1 extends World
{
    public static int score;//inicia el score/
    //se llaman a las distintas respuestas para crear una variedad de opciones
    Asia1A asia1A = new Asia1A();
    Asia2A asia2A = new Asia2A();
    Asia3A asia3A = new Asia3A();
    Asia4A asia4A = new Asia4A();
    Asia5A asia5A = new Asia5A();

    private int clickCount=0;
    //Esto permite que la persona solo pueda hacer click 1 vez en la pantalla del juego

    public AsiaW1() //agregando objetos al mundo
    {    
        super(1300, 700, 1); //tamaño del mundo
        addObject (new Asia1(),665,219);//añade la imagen al mundo
        addObject (new SW2(),1249,326);//añade boton siguiente para pasar a la siguiente pregunta
        addObject (new BMapa(),1226, 56); //agrega botón para regresar al mapa principal
        addObject (new negro(),104, 43); //agrega un cuadrito negro para que se vea mejor el score
        score = 0;//inicia el score en 0
        Order();//coloca las opciones de respuestas en ordenes distintos
    }

    public void act()//añade 1 punto al contador
    {
        if (clickCount<1)
        {
            if (Greenfoot.mouseClicked(asia1A))//Respuesta correcta
            {
                addScore(1); //añade 1 punto al score
                showText("Correcto!",666,125); //Muestra un mensaje de que la respuesta fue correcta
                clickCount++; //indica que ya se ha dado click a una respuesta
                Greenfoot.playSound("Correct.mp3"); //suena para indicar que se ha dado click y la respuesta es correcta
                //fuente de sonido: https://mixkit.co/free-sound-effects/game/?page=2
            }
            if (Greenfoot.mouseClicked(asia2A) || Greenfoot.mouseClicked(asia3A) || Greenfoot.mouseClicked(asia4A) || Greenfoot.mouseClicked(asia5A))
            //respuestas incorrectas
            {
                showText("Incorrecto",666,125); //Muestras mensaje de que la respuesta fue incorrecta
                Greenfoot.playSound("Wrong.mp3"); //suena para indicar que se ha dado click y la respuesta es incorrecta
                clickCount++; //indica que ya se ha dado click a una respuesta
                addScore(0); //no añade ningún punto al score
            } 
        }
    }

    public void Order() //permite tener las opciones de respuestas en ordenes distintos 
    {
        int order = Greenfoot.getRandomNumber(2); //3 numeros aleatorios
        if( order == 0) //primer orden aleatorio
        { 
            addObject (asia1A,239,533);
            addObject (asia2A,668,532);
            addObject (asia3A,1091,535);
        }
        else if( order == 1)//segundo orden aleatorio
        { 
            addObject (asia1A,1091,535);
            addObject (asia4A,239,533);
            addObject (asia5A,668,532);
        }
        else if( order == 2)//tercer orden aleatorio
        {
            addObject (asia1A,668,532);
            addObject (asia3A,1091,535);
            addObject (asia5A,239,533);
        }
    }

    public void addScore(int points)//añade el puntaje al mundo
    {
        score = score + points; //suma los puntos correctos
        showScore(); //función para mostrar el score
    }

    public void showScore()
    {
        showText("Score: " + score,105,42);//muestra el score sobre el cuadrito negro añadido previamente
    }

}
