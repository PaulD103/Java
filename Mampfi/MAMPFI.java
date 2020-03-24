class MAMPFI {
    int positionX;
    int positionY;
    boolean verwundbar;
    char blickrichtung;
    MAMPFISYMBOL darstellung;
    MAMPFI() {
        verwundbar = true;
        blickrichtung = 'O';
        darstellung = new MAMPFISYMBOL(1,1);
        darstellung.RadiusSetzen(20);
        darstellung.BogenArtSetzen(2);
        darstellung.BogenWinkelSetzen(300);
        darstellung.StartWinkelSetzen(30);
        darstellung.MundBewegtSichSetzen(true);
    }
    
    public void NachNordenBlicken() {
        blickrichtung = 'N';
        darstellung.StartWinkelSetzen(120);
    }
    public void NachSuedenBlicken() {
        blickrichtung = 'S';
        darstellung.StartWinkelSetzen(-60);
    }
    public void NachOstenBlicken() {
        blickrichtung = 'O';
        darstellung.StartWinkelSetzen(30);
    }
    public void NachWestenBlicken() {
        blickrichtung = 'W';
        darstellung.StartWinkelSetzen(210);
    }
    public void VerwundbarSetzen(boolean verwundbarNeu) {
        verwundbar = verwundbarNeu;
        if(verwundbar == true) {
            darstellung.FuellFarbeSetzen("gelb");
            darstellung.RandFarbeSetzen("gelb");
        } else {
            darstellung.FuellFarbeSetzen("blau");
            darstellung.RandFarbeSetzen("blau");
        }
    }
}

