class LABYRINTH{
    int breite;
    int hoehe;
    ZELLE[][] spielFlaeche;
    LABYRINTH(){
        breite = 10;
        hoehe = 10;
        spielFlaeche = new ZELLE[10][10];
        for (int y = 0; y < hoehe; y++){
            for(int x = 0; x < breite; x++){
                spielFlaeche[x][y] = new ZELLE(x,y);
            }
        }
    }
    LABYRINTH(int breiteNeu, int hoeheNeu){
        breite = breiteNeu;
        hoehe = hoeheNeu;
        spielFlaeche = new ZELLE[breite][hoehe];
        for (int y = 0; y < hoehe; y++){
            for(int x = 0; x < breite; x++){
                spielFlaeche[x][y] = new ZELLE(x,y);
            }
        }
    }
    int breiteGeben(){
        return breite;
    }
    int hoeheGeben(){
        return hoehe;
    }
    boolean IstMauerAufZelle(int positionX, int positionY){
        return spielFlaeche[positionX][positionY].IstMauerGeben();
    }
    
    void GaengeErstellen(){
        //individuelle Lösung
        for(int i = 1; i<=5; i++){
            spielFlaeche[i][1].IstMauerSetzen(true);
        }
        for(int i = 1; i<=4; i++){
            spielFlaeche[7][i].IstMauerSetzen(true);
        }
        for(int i = 6; i<=8; i++){
            spielFlaeche[1][i].IstMauerSetzen(true);
        }
        for(int i = 3; i<=5; i++){
            spielFlaeche[i][8].IstMauerSetzen(true);
        }
        for(int i = 7; i<=8; i++){
            spielFlaeche[i][8].IstMauerSetzen(true);
        }
        spielFlaeche[8][1].IstMauerSetzen(true);
        spielFlaeche[1][2].IstMauerSetzen(true);
        spielFlaeche[3][3].IstMauerSetzen(true);
        spielFlaeche[5][3].IstMauerSetzen(true);
        spielFlaeche[9][3].IstMauerSetzen(true);
        spielFlaeche[1][4].IstMauerSetzen(true);
        spielFlaeche[2][4].IstMauerSetzen(true);
        spielFlaeche[5][4].IstMauerSetzen(true);
        spielFlaeche[4][5].IstMauerSetzen(true);
        spielFlaeche[8][5].IstMauerSetzen(true);
        spielFlaeche[2][6].IstMauerSetzen(true);
        spielFlaeche[4][6].IstMauerSetzen(true);
        spielFlaeche[6][6].IstMauerSetzen(true);
        spielFlaeche[8][7].IstMauerSetzen(true);
    }
}
