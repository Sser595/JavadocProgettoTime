/**
 * La classe rappresenta e gestisce dati di tipo temporale
 */
public class Time {
    protected int minuti;
    protected int secondi;
    protected int ore;
  
    
    private boolean controllo(int secondi, int ore, int minuti){
        if(secondi>60 || minuti>60 || ore >24 || secondi<0 || minuti<0 || ore<0){
            return false;
        }
        return true;
    }
    /**
     * 
        Costruisce un oggetto Time dato in ingresso il numero di secondi.
     * @param secondi
     */
    public Time(int secondi) {
        ore = secondi / 3600;
        minuti = secondi / 60;
        secondi = secondi % 60;
    }
    /**
     * 
        Costruisce un oggetto Time dato in ingresso ore, minuti e secondi.
     * @param secondi
     * @param ore
     * @param minuti
     */
    public Time (int secondi, int ore, int minuti){
        if(!controllo(secondi, ore, minuti)){
            this.secondi=0;
            this.ore=0;
            this.minuti=0;
            return;
        }
        this.minuti= minuti;
        this.ore= ore;
        this.secondi= secondi;
    }
    /**
     * 
        Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi.
     * @return il numero totale dei secondi
     */
    public int convertiSecondi(){
        return (this.ore*3600)+(this.minuti*60)+this.secondi;
    }
    /**
     * 
        Vengono addizionati il numero di secondi specificati.
     * @param secondi
     */
    public void addSecondi(int secondi){
        secondi+=secondi;
        if(secondi>=60){
            secondi=secondi%60;
            minuti+=secondi/60;
            ore=secondi/3600;
        }
    }
    /**
     * restituisce il numero di minuti
     * @return il numero dei minuti
     */
    public int getMinuti() {
        return minuti;
    }
    /**
     * @deprecated
     * @param minuti
     */
    public void setMinuti(int minuti) {
    }
    /**
     * restituisce il numero di secondi
     * @return il numero dei secondi
     */
    public int getSecondi() {
        return secondi;
    }
    /**
     * @deprecated
     * @param secondi
     */
    public void setSecondi(int secondi) {
    }
    /**
     * restituisce il numero di ore
     * @return il numero delle ore 
     */
    public int getOre() {
        return ore;
    }
    /**
     * @deprecated
     * @param ore
     */
    public void setOre(int ore) {
        
    }
    /**
     * Restituisce una stringa che rappresenta l'oggetto
     * 
     * @return Rappresentazione testuale dell'oggetto Time {ore:minuti:secondi}
     */
    @Override
    public String toString(){
        return "ore: "+ore+" minuti: "+minuti+" secondi: "+secondi;
    }
    
}
