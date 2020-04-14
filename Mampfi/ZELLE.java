class ZELLE{
    int positionX;
    int positionY;
    boolean istMauer;
    ZELLENSYMBOL zSymbol;

    ZELLE(int xNeu, int yNeu){
        positionX = xNeu;
        positionY = yNeu;
        istMauer = false;
        zSymbol = new ZELLENSYMBOL(positionX,positionY);
        zSymbol.FuellFarbeSetzen("blau");
    }

    void IstMauerSetzen(boolean istMauerNeu){
        istMauer = istMauerNeu;
        if(istMauer == true){
            zSymbol.FuellungSichtbarSetzen(true);
        }
        else{
            zSymbol.FuellungSichtbarSetzen(false);
        }
    }
    
    boolean IstMauerGeben(){
        return istMauer;
    }
}