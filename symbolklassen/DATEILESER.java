import java.io.File;

import backend.DateiLeser;



/**Diese Klasse dient zum Auslesen einer Datei, in die ein Labyrinth
 * gespeichert wurde.
 * @author Sebastian Zinkhahn
 * @version 29.03.2008
 */
class DATEILESER extends DateiLeser
{
	/**Der Name der Datei*/
	String dateiName;
	/**
	 * Erzeugt ein neues Objekt dieser Klasse.
	 * Um Dateien auslesen zu koennen, muss zunaechst eine Datei ausgewaehlt werden.
	 * @see DATEILESER#DateiManuellAuswaehlen()
	 * @see DATEILESER#DateiSetzen(String)
	 */
	public DATEILESER()
	{
	}
	
	/**Erzeugt ein neues Objekt dieser Klasse
	 * @param dateiNameNeu Der Name der Datei welche gelesen werden soll.
	 * Diese muss sich im selben Ordner befinden, wie das Projekt.
	 */
	public DATEILESER(String dateiNameNeu)
	{
		super(dateiNameNeu);
		dateiName = dateiNameNeu;
	}
	
	/**Diese Methode oeffnet ein Fenster, um eine Datei auszuwaehlen
	 * @see DateiLeser#DateiManuellAuswaehlen()
	 */
	public void DateiManuellAuswaehlen()
	{
		super.DateiManuellAuswaehlen();
	}
	
	/**Diese Methode setzt das Attribut {@link #dateiName} auf die uebergebene Datei.
	 * Wichtig ist dabei, dass die Datei im Haupt-Verzeichnis dieses Projekts gespeichert werden muss
	 * @param dateiName Der Name der Datei
	 * @see DateiLeser#DateiSetzen(java.lang.String)
	 */
	public void DateiNameSetzen(String dateiNameNeu)
	{
		super.DateiSetzen(dateiNameNeu);
		dateiName = dateiNameNeu;
	}
	
	/**Diese Methode liest die Daten zu der Zelle mit den uebergebenen x- und y-Kooerdinaten aus
	 * @param x die x-Position der gewuenschten Zelle
	 * @param y die y-Position der gewuenschten Zelle
	 * @return Gibt 'M'(Mauer) zurueck, wenn die Zelle eine Mauer ist, ansonsten 'K' (Kruemel)
	 * @see DateiLeser#ZellDatenAuslesen(int, int)
	 */
	public char ZellDatenAuslesen(int x, int y)
	{
		return super.ZellDatenAuslesen(x, y);
	}

	/**Diese Methode liest die Anzahl der Zellen in x-Richtung aus
	 * @return Die Anzahl der Zellen
	 * @see DateiLeser#ZellenAnzahlXAuslesen()
	 */
	public int ZellenAnzahlXAuslesen()
	{
		return super.ZellenAnzahlXAuslesen();
	}
	
	/**Diese Methode liest die Anzahl der Zellen in y-Richtung aus
	 * @return Die Anzahl der Zellen
	 * @see DateiLeser#ZellenAnzahlYAuslesen()
	 */
	public int ZellenAnzahlYAuslesen()
	{
		return super.ZellenAnzahlYAuslesen();
	}
	
	/**Diese Methode liest den Zellradius aus
	 * @return Der Zellradius
	 * @see DateiLeser#ZellenRadiusAuslesen()
	 */
	public int ZellenRadiusAuslesen()
	{
		return super.ZellenRadiusAuslesen();
	}
	
	/**Gibt die x-Position der StartZelle von Mampfi zurueck
	 * @return Die x-Position der StartZelle von Mampfi
	 * @see DateiLeser#StartPositionMampfiX()
	 */
	public int StartPositionXMampfi()
	{
		return super.StartPositionMampfiX();
	}
	
	/**Gibt die y-Position der StartZelle von Mampfi zurueck
	 * @return Die y-Position der StartZelle von Mampfi
	 * @see DateiLeser#StartPositionMampfiY()
	 */
	public int StartPositionYMampfi()
	{
		return super.StartPositionMampfiY();
	}
	
	/**Gibt die x-Position der StartZelle des Monsters mit der uebergebenen Nummer zurueck
	 * @param nummer Die Nummer des Monsters. Der Wert muss zwischen 0 und 3 liegen
	 * @return Die x-Position der StartZelle des Monsters
	 * @see DateiLeser#StartPositionMonsterX(int)
	 */
	public int StartPositionXMonster(int nummer)
	{
		return super.StartPositionMonsterX(nummer);
	}
	
	/**Gibt die y-Position der StartZelle des Monsters mit der uebergebenen Nummer zurueck
	 * @param nummer Die Nummer des Monsters. Der Wert muss zwischen 0 und 3 liegen
	 * @return Die y-Position der StartZelle des Monsters
	 * @see DateiLeser#StartPositionMonsterY(int)
	 */
	public int StartPositionYMonster(int nummer)
	{
		return super.StartPositionMonsterY(nummer);
	}
	
	/**Gibt die x-Position der Zelle des Powerkruemels mit der uebergebenen Nummer zurueck
	 * @param nummer Die Nummer des Monsters. Der Wert muss zwischen 0 und 3 liegen
	 * @return Die y-Position des Powerkruemels
	 * @see DateiLeser#PositionPowerKruemelX(int)
	 */
	public int PositionXPowerKruemel(int nummer)
	{
		return super.PositionPowerKruemelX(nummer);
	}
	
	/**Gibt die y-Position der Zelle des Powerkruemels mit der uebergebenen Nummer zurueck
	 * @param nummer Die Nummer des Monsters. Der Wert muss zwischen 0 und 3 liegen
	 * @return Die y-Position des Powerkruemels
	 * @see DateiLeser#PositionPowerKruemelY(int)
	 */
	public int PositionYPowerKruemel(int nummer)
	{
		return super.PositionPowerKruemelY(nummer);
	}
	
}
