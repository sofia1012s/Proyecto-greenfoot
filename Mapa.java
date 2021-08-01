import greenfoot.*;

/**
 * Pantalla de mapa del juego
 * Aquí se seleccionarán los distintos continentes a los que se desea llegar
 */
public class Mapa extends World
{
    public Mapa()
    {    
        super(1300, 700, 1); 
        prepare();
    }
    
    private void prepare()
    {
        Africa africa = new Africa();
        addObject(africa,674,384);
        africa.setLocation(683,397);
        America america = new America();
        addObject(america,309,365);
        Asia asia = new Asia();
        addObject(asia,983,261);
        Europa europa = new Europa();
        addObject(europa,682,232);
        Oceania oceania = new Oceania();
        addObject(oceania,1066,522);
    }
}
