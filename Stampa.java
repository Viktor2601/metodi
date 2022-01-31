public class Stampa 
{
    /**
     * stampa il messaggio che riceve come parametro  
     * @param messaggio variabile che contiene il messaggio da stampare 
     */
    public static void stampa (String messaggio)
    {
        System.out.println(messaggio);
    }

    /**
     * stampa dei trattini per spazziare i messaggi nel terminale 
     */
    public static void spazziatura ()
    {
        System.out.println("---------------------------------------------------------");
    }

    /**
     * stampa tutti i numeri del array in riga separati da una virgola
     * @param array da stamapare in output
     */
    public static void stampaArray (byte array[])
    {
        if (array.length <= 0 )
            return;

        for (byte numero : array)
        {
            System.out.print(numero + ", " );
        }
    }

    /**
     * stampa tutti i numeri del array in riga separati da una virgola
     * @param array da stamapare in output
     */
    public static void stampaArray (int array[])
    {
        if (array.length <= 0 )
            return;

        for (int numero : array)
        {
            System.out.print(numero + ", " );
        }
    }

     /**
     * stampa tutti i numeri del array in riga separati da una virgola
     * @param array da stamapare in output
     */
    public static void stampaArray (long array[])
    {
        if (array.length <= 0 )
            return;

        for (float numero : array)
        {
            System.out.print(numero + ", " );
        }
    }

    /**
     * stampa tutti i numeri del array in riga separati da una virgola
     * @param array da stamapare in output
     */
    public static void stampaArray (float array[])
    {
        if (array.length <= 0 )
            return;

        for (float numero : array)
        {
            System.out.print(numero + ", " );
        }
    }

    /**
     * stampa tutti i numeri del array in riga separati da una virgola
     * @param array da stamapare in output
     */
    public static void stampaArray (double array[])
    {
        if (array.length <= 0 )
            return;

        for (double numero : array)
        {
            System.out.print(numero + ", " );
        }
    }

     /**
     * stampa tutte le Stringhe del array in riga separati da una virgola
     * @param array da stamapare in output
     */
    public static void stampaArray(String array[])
    {
        if (array.length <= 0 )
            return;

        for (String parola : array)
        {
            System.out.print(parola + ", " );
        }
    }
}