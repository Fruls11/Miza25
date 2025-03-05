/**
 * Razdred za prikaz uporabe dedovanja
 * razširja razdred steklenica
 * 
 * @author Blaž Fujan
 * @version 18
 */

public class PivskaSteklenica extends Steklenica {

    // Vse lastnosti od nadrazreda se prenesejo
    // Deklariramo dodatne lastnosti, ki so skupne le pivskim steklenicam

    /**
     * Znamka piva
     */

    private String znamka;

    /**
     * Temperatura piva v steklenici v stopinjah celzija
     */

    private double temperatura;

    /**
     * Konstruktor za inicializacijo nove pivske steklenice, ki je polna in zaprta
     * Inicializira vse lastnosti
     * 
     * @param k Kapaciteta steklenice v (ml)
     * @param z Znamka piva
     * @param t Začetna temperatura steklenice
     */
    public PivskaSteklenica(int k, String z, double t) {


        // Pokličemo konstruktor nadrazreda - Steklenica
        // ki bo inicializiral lastnosti nadrazreda
        super(k, "Pivo");

        // Inicializiramo dodatne lastnosti
        znamka = z;
        temperatura = t;
        System.out.println("Pivska steklenica je znamke " + z);

    }

   /**
     * Konstruktor za inicializacijo nove pivske steklenice, ki je polna in zaprta
     * Inicializira vse lastnosti
     * 
     * @param k Kapaciteta steklenice v (ml)
     * @param z Znamka piva
     */
    public PivskaSteklenica(int k, String z) {

        // Pokličemo drug konstruktor nadrazreda
        this(k, z, 8.0);
        
    }
}
