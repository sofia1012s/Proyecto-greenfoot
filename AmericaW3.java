import greenfoot.*; 

public class AmericaW3 extends World
{
    public static int score;//inicia el score/
    //se llaman a las distintas respuestas para crear una variedad de opciones
    America1A america1A = new America1A();
    America2A america2A = new America2A();
    America3A america3A = new America3A();
    America4A america4A = new America4A();
    America5A america5A = new America5A();

    private int clickCount=0;
    //Esto permite que la persona solo pueda hacer click 1 vez en la pantalla del juego

    public AmericaW3() //agregando objetos al mundo
    {    
        super(1300, 700, 1); //tamaño del mundo
        addObject (new America3(),665,219);//añade la imagen al mundo
        addObject (new MW4(),1249,326);//añade boton siguiente para pasar a la siguiente pregunta
        addObject (new BMapa(),1226, 56); //agrega botón para regresar al mapa principal
        addObject (new negro(),104, 43); //agrega un cuadrito negro para que se vea mejor el score
        score = 0;//inicia el score en 0
        Order();//coloca las opciones de respuestas en ordenes distintos
    }

    public void act()//añade 1 punto al contador
    {
        if (clickCount<1)
        {
            if (Greenfoot.mouseClicked(america3A))//Respuesta correcta
            {
                addScore(1); //añade 1 punto al score
                showText("Correcto!",666,125); //Muestra un mensaje de que la respuesta fue correcta
                clickCount++; //indica que ya se ha dado click a una respuesta
                Greenfoot.playSound("Correct.mp3"); //suena para indicar que se ha dado click y la respuesta es correcta
                //fuente de sonido: https://mixkit.co/free-sound-effects/game/?page=2
            }
            if (Greenfoot.mouseClicked(america1A) || Greenfoot.mouseClicked(america2A) || Greenfoot.mouseClicked(america4A) || Greenfoot.mouseClicked(america5A))
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
            addObject (america2A,239,533);
            addObject (america3A,668,532);
            addObject (america1A,1091,535);
        }
        else if( order == 1)//segundo orden aleatorio
        { 
            addObject (america3A,1091,535);
            addObject (america4A,239,533);
            addObject (america1A,668,532);
        }
        else if( order == 2)//tercer orden aleatorio
        {
            addObject (america1A,668,532);
            addObject (america4A,1091,535);
            addObject (america3A,239,533);
        }
    }

    public void addScore(int points)//añade el puntaje al mundo
    {
        score = AmericaW2.score + points; //suma los puntos correctos
        showScore(); //función para mostrar el score
    }

    public void showScore()
    {
        showText("Score: " + score,105,42);//muestra el score sobre el cuadrito negro añadido previamente
    }
}
