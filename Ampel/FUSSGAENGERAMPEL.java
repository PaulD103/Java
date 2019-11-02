
/**
 * Write a description of class FUSSGAENGERAMPEL here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class FUSSGAENGERAMPEL
{    

    LAMPE lOben;
    LAMPE lUnten;
    int posX;
    int posY;
    String ampelphase;


    /**
     * Constructor for objects of class FUSSGAENGERAMPEL
     */
    FUSSGAENGERAMPEL()
    {
        lOben = new LAMPE();
        lUnten = new LAMPE();
        lOben.PositionSetzen(3,0);
        lUnten.PositionSetzen(3, 1);
        lOben.FarbeSetzen("rot");
        lUnten.FarbeSetzen("schwarz");
        ampelphase = "rot";
    }

     void RotSetzen()
    {
        lOben.FarbeSetzen("rot");
        lUnten.FarbeSetzen("schwarz");
        ampelphase = "rot";
    }
    
    void GruenSetzen()
    {
        lOben.FarbeSetzen("schwarz");
        lUnten.FarbeSetzen("gruen");
        ampelphase = "gruen";
    }
    
    void PositionSetzen(int xNeu, int yNeu)
    {
        if (xNeu>=-8 && xNeu<=7 && yNeu>=-8 && yNeu<=7)
        {
            posX = xNeu;
            posY = yNeu;
            lOben.PositionSetzen(xNeu, yNeu);
            lUnten.PositionSetzen(xNeu, yNeu + 1);
        }
        else
        {
            System.out.println("Die Koordinaten sind außerhalb des zulässigen Bereichs!");
        }
    }
    
    void Weiterschalten()
    {
        if (ampelphase == "rot")
        {
            GruenSetzen();
        }
        else 
        {
            RotSetzen();
        }
           
    }
}
