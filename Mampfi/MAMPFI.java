class MAMPFI{
    int positionX;
    int positionY;
    boolean verwundbar;
    char blickrichtung;
    MAMPFISYMBOL darstellung;
    LABYRINTH laby;

    MAMPFI(){
        verwundbar = true;
        blickrichtung = 'O';
        darstellung = new MAMPFISYMBOL();
        darstellung.BogenArtSetzen(2);
        darstellung.RadiusSetzen(80);
        darstellung.BogenWinkelSetzen(300);
        darstellung.StartWinkelSetzen(30);
        laby = new LABYRINTH();
        laby.GaengeErstellen(); 
    }

    void NachNordenBlicken(){
        blickrichtung = 'N';
        darstellung.StartWinkelSetzen(120);
    }

    void NachSuedenBlicken(){
        blickrichtung = 'S';
        darstellung.StartWinkelSetzen(300);
    }

    void NachOstenBlicken(){
        blickrichtung = 'O';
        darstellung.StartWinkelSetzen(30);
    }

    void NachWestenBlicken(){
        blickrichtung = 'W';
        darstellung.StartWinkelSetzen(210);
    }

    void VerwundbarSetzen(boolean verwundbarNeu){
        verwundbar = verwundbarNeu;
        if(verwundbar == true){
            darstellung.FuellFarbeSetzen("gelb");
        }
        else{darstellung.FuellFarbeSetzen("blau");
        }
    }
    
    void NachNordenGehen(){
        NachNordenBlicken();
        if(positionY>0 && laby.IstMauerAufZelle(positionX,positionY-1)==false){
            positionY = positionY - 1;
            darstellung.PositionYSetzen(positionY);
        }
    }
    void NachSuedenGehen(){
        NachSuedenBlicken();
        if(positionY<laby.hoeheGeben()&& laby.IstMauerAufZelle(positionX,positionY+1)==false){
            positionY = positionY + 1;
            darstellung.PositionYSetzen(positionY);
        }
    }
    void NachOstenGehen(){
        NachOstenBlicken();
        if(positionX<laby.breiteGeben()&& laby.IstMauerAufZelle(positionX+1,positionY)==false){
            positionX = positionX + 1;
            darstellung.PositionXSetzen(positionX);
        }
    }
    void NachWestenGehen(){
        NachWestenBlicken();
        if(positionX>0 && laby.IstMauerAufZelle(positionX-1,positionY)==false){
            positionX = positionX - 1;
            darstellung.PositionXSetzen(positionX);
        }
    }
}