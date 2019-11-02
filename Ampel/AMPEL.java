
class AMPEL
{
    LAMPE lOben;
    LAMPE lMitte;
    LAMPE lUnten;
    String ampelphase;

    AMPEL()
    {
        lOben = new LAMPE();
        lMitte = new LAMPE();
        lUnten = new LAMPE();
        lOben.PositionSetzen(0,0);
        lMitte.PositionSetzen(0, 1);
        lUnten.PositionSetzen(0, 2);
        lOben.FarbeSetzen("rot");
        lMitte.FarbeSetzen("schwarz");
        lUnten.FarbeSetzen("schwarz");
        ampelphase = "rot";
    }
    
    void RotSetzen()
    {
        lOben.FarbeSetzen("rot");
        lMitte.FarbeSetzen("schwarz");
        lUnten.FarbeSetzen("schwarz");
        ampelphase = "rot";
    }
    
    void RotgelbSetzen()
    {
        lOben.FarbeSetzen("rot");
        lMitte.FarbeSetzen("gelb");
        lUnten.FarbeSetzen("schwarz");
        ampelphase = "rotgelb";
    }
    
    void GruenSetzen()
    {
        lOben.FarbeSetzen("schwarz");
        lMitte.FarbeSetzen("schwarz");
        lUnten.FarbeSetzen("gruen");
        ampelphase = "gruen";
    }
    
    void GelbSetzen()
    {
        lOben.FarbeSetzen("schwarz");
        lMitte.FarbeSetzen("gelb");
        lUnten.FarbeSetzen("schwarz");
        ampelphase = "gelb";
    }
    void Weiterschalten()
    {
        if (ampelphase == "rot")
        {
            RotgelbSetzen();
        }
        else 
        {
            if (ampelphase == "rotgelb")
            {
                GruenSetzen();
            }
            else 
            {
                if (ampelphase == "gruen")
                {
                    GelbSetzen();
                }
                else
                {
                    RotSetzen();
                }
            }
            
        }
    }
    
}
