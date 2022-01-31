import java.util.Random;

public class ArrayTool {
    /**
     * ritorna il massimo di un array
     * @param array in cui cercare il massimo
     * @return ritorna il numero più grande presente nel array passato come parametro
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static byte massimo (byte array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        byte max = array[0];

        for (byte numero : array)
        {
            if (numero > max)
            {
                max = numero;
            }
        }

        return max;
    }
    
    /**
     * ritorna il massimo di un array
     * @param array in cui cercare il massimo
     * @return ritorna il numero più grande presente nel array passato come parametro
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static int massimo (int array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        int max = array[0];

        for (int numero : array)
        {
            if (numero > max)
            {
                max = numero;
            }
        }

        return max;
    }

    /**
     * ritorna il massimo di un array
     * @param array in cui cercare il massimo
     * @return ritorna il numero più grande presente nel array passato come parametro
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static long massimo (long array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        long max = array[0];

        for (long numero : array)
        {
            if (numero > max)
            {
                max = numero;
            }
        }

        return max;
    }

    /**
     * ritorna il massimo di un array
     * @param array in cui cercare il massimo
     * @return ritorna il numero più grande presente nel array passato come parametro
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static float massimo (float array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        float max = array[0];

        for (float numero : array)
        {
            if (numero > max)
            {
                max = numero;
            }
        }

        return max;
    }

    /**
     * ritorna il massimo di un array
     * @param array in cui cercare il massimo
     * @return ritorna il numero più grande presente nel array passato come parametro
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valideto
     */
    public static double massimo (double array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        double max = array[0];

        for (double numero : array)
        {
            if (numero > max)
            {
                max = numero;
            }
        }

        return max;
    }

    /**
     * ritorna il minimo di un array
     * @param array in cui cercare il minimo
     * @return ritorna il numero più piccolo presente nel array passato come parametro
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static byte minimo (byte array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        byte min = array[0];
        
        for (byte numero : array)
        {
            if (numero < min)
            {
                min = numero;
            }
        }

        return min;
    }

    /**
     * ritorna il minimo di un array
     * @param array in cui cercare il minimo
     * @return ritorna il numero più piccolo presente nel array passato come parametro
     * @throws Exception viene lanciato un errore se l'array passato come parametro in input è vuoto
     */
    public static int minimo (int array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        int min = array[0];
        
        for (int numero : array)
        {
            if (numero < min)
            {
                min = numero;
            }
        }

        return min;
    }

    /**
     * ritorna il minimo di un array
     * @param array in cui cercare il minimo
     * @return ritorna il numero più piccolo presente nel array passato come parametro
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static long minimo (long array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        long min = array[0];
        
        for (long numero : array)
        {
            if (numero < min)
            {
                min = numero;
            }
        }

        return min;
    }

    /**
     * ritorna il minimo di un array
     * @param array in cui cercare il minimo
     * @return ritorna il numero più piccolo presente nel array passato come parametro
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static float minimo (float array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        float min = array[0];
        
        for (float numero : array)
        {
            if (numero < min)
            {
                min = numero;
            }
        }

        return min;
    }

    /**
     * ritorna il minimo di un array
     * @param array in cui cercare il minimo
     * @return ritorna il numero più piccolo presente nel array passato come parametro
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static double minimo (double array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        double min = array[0];
        
        for (double numero : array)
        {
            if (numero < min)
            {
                min = numero;
            }
        }

        return min;
    }

    /**
     * ritorna la media dei numeri presenti nel array
     * @param array di cui si fa la media 
     * @return ritorna la media dei valori presenti nel array
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static int media (int array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        int somma = 0;
        int media = 0;

        for (int numero : array)
        {
            somma += numero;
        }

        media = somma / array.length;

        return  media;
    }

    /**
     * ritorna la media dei numeri presenti nel array
     * @param array di cui si fa la media 
     * @return ritorna la media dei valori presenti nel array
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static long media (long array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        long somma = 0;
        long media = 0;

        for (long numero : array)
        {
            somma += numero;
        }

        media = somma / array.length;

        return  media;
    }

    /**
     * ritorna la media dei numeri presenti nel array
     * @param array di cui si fa la media 
     * @return ritorna la media dei valori presenti nel array
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static float media (float array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        float somma = 0;
        float media = 0;

        for (float numero : array)
        {
            somma += numero;
        }

        media = somma / array.length;

        return  media;
    }

    /**
     * ritorna la media dei numeri presenti nel array
     * @param array di cui si fa la media 
     * @return ritorna la media dei valori presenti nel array
     * @throws Exception viene lanciato un errore se le dimensioni del array non sono valide
     */
    public static double media (double array[]) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("Le dimensioni del array non sono valide.");
        }

        double somma = 0;
        double media = 0;

        for (double numero : array)
        {
            somma += numero;
        }

        media = somma / array.length;

        return  media;
    }

    /**
     * genera un array con una dimensione passata come parametro e lo riempe con dei numeri generati casualmente che vanno da 0 a max
     * @param grandezzaArray numero delle celle del array 
     * @param max numero massimo che si può generare
     * @return ritorna un array riempito con dei numeri casuali 
     * @throws Exception viene lanciato un errore se un valore in input non soddisfa dei requesiti 
     */
    public static int[] generaArrayCasuale (int grandezzaArray, int max) throws Exception
    {
        if (grandezzaArray <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        if (max < 0)
        {
            throw new Exception("Il valore massimo deve essere maggiore o uguale a zero");
        }

        int risultato[] = new int[grandezzaArray];
        
        for (int i = 0; i < grandezzaArray; i++)
        {
            risultato[i] = generaNumeroCasuale(max);
        }

        return risultato;
    }

    /**
     * genera un array con una dimensione passata come parametro e lo riempe con dei numeri generati casualmente che vanno da 0 a max
     * @param grandezzaArray numero delle celle del array 
     * @param max numero massimo che si può generare
     * @return ritorna un array riempito con dei numeri casuali 
     * @throws Exception viene lanciato un errore se un valore in input non soddisfa dei requesiti
     */
    public static float[] generaArrayCasuale (int grandezzaArray, float max) throws Exception
    {
        if (grandezzaArray <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        if (max < 0)
        {
            throw new Exception("Il valore massimo deve essere maggiore o uguale a zero");
        }

        float risultato[] = new float[grandezzaArray];
        
        for (int i = 0; i < grandezzaArray; i++)
        {
            risultato[i] = generaNumeroCasuale(max);
        }

        return risultato;
    }

    /**
     * genera un array con una dimensione passata come parametro e lo riempe con dei numeri generati casualmente che vanno da 0 a max
     * @param grandezzaArray numero delle celle del array 
     * @param max numero massimo che si può generare
     * @return ritorna un array riempito con dei numeri casuali 
     * @throws Exception viene lanciato un errore se un valore in input non soddisfa dei requesiti
     */
    public static double[] generaArrayCasuale (int grandezzaArray, double max) throws Exception
    {
        if (grandezzaArray <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        if (max < 0)
        {
            throw new Exception("Il valore massimo deve essere maggiore o uguale a zero");
        }

        double risultato[] = new double[grandezzaArray];
        
        for (int i = 0; i < grandezzaArray; i++)
        {
            risultato[i] = generaNumeroCasuale(max);
        }

        return risultato;
    }

    /**
     * cerca un numero dentro un array e restituisce true o false
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna true se il numero è presente dentro al array o false se il numero non è presente dentro al array
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static boolean ricercaNumeroBool (int array[], int numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                trovato = true;
            }

            indice++;
        }

        return trovato;    
    }

    /**
     * cerca un numero dentro un array e restituisce true o false
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna true se il numero è presente dentro al array o false se il numero non è presente dentro al array
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static boolean ricercaNumeroBool (long array[], long numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                trovato = true;
            }

            indice++;
        }

        return trovato;    
    }

    /**
     * cerca un numero dentro un array e restituisce true o false
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna true se il numero è presente dentro al array o false se il numero non è presente dentro al array
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static boolean ricercaNumeroBool (float array[], float numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                trovato = true;
            }

            indice++;
        }

        return trovato;    
    }

    /**
     * cerca un numero dentro un array e restituisce true o false
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna true se il numero è presente dentro al array o false se il numero non è presente dentro al array
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static boolean ricercaNumeroBool (double array[], double numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                trovato = true;
            }

            indice++;
        }

        return trovato;    
    }

    /**
     * cerca un numero dentro un array e restituisce il numero da cercare 
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna il numero da cercare
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static int ricercaNumero (int array[], int numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        int numeroTrovato = 0;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                numeroTrovato = array[indice];
                trovato = true;
            }

            indice++;
        }

        return numeroTrovato;    
    }


    /**
     * cerca un numero dentro un array e restituisce il numero da cercare 
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna il numero da cercare
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static long ricercaNumero (long array[], long numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        long numeroTrovato = 0;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                numeroTrovato = array[indice];
                trovato = true;
            }

            indice++;
        }

        return numeroTrovato;    
    }


    /**
     * cerca un numero dentro un array e restituisce il numero da cercare 
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna il numero da cercare
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static float ricercaNumero (float array[], float numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        float numeroTrovato = 0;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                numeroTrovato = array[indice];
                trovato = true;
            }

            indice++;
        }

        return numeroTrovato;    
    }


    /**
     * cerca un numero dentro un array e restituisce il numero da cercare 
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna il numero da cercare
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static double ricercaNumero (double array[], double numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        double numeroTrovato = 0;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                numeroTrovato = array[indice];
                trovato = true;
            }

            indice++;
        }

        return numeroTrovato;    
    }


    /**
     * cerca un numero dentro un array e restituisce la posizione dove si trova il numero da cercare
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna la posizione del numero da cercare
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static int ricercaNumeroIndice (int array[], int numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                trovato = true;
            }

            indice++;
        }

        return indice;    
    }

    /**
     * cerca un numero dentro un array e restituisce la posizione dove si trova il numero da cercare
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna la posizione del numero da cercare
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static int ricercaNumeroIndice (long array[], long numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                trovato = true;
            }

            indice++;
        }

        return indice;    
    }


    /**
     * cerca un numero dentro un array e restituisce la posizione dove si trova il numero da cercare
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna la posizione del numero da cercare
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static int ricercaNumeroIndice (float array[], float numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                trovato = true;
            }

            indice++;
        }

        return indice;    
    }

    /**
     * cerca un numero dentro un array e restituisce la posizione dove si trova il numero da cercare
     * @param array in cui cercare il numero
     * @param numeroDaCercare dentro al array
     * @return ritorna la posizione del numero da cercare
     * @throws Exception viene lanciato un errore se la grandezza del array non è valida
     */
    public static int ricercaNumeroIndice (double array[], double numeroDaCercare) throws Exception
    {
        if (array.length <= 0)
        {
            throw new Exception("La grandezza del array deve essere maggiore di zero");
        }

        boolean trovato = false;
        int indice = 0;

        while (indice < array.length-1 && !trovato)
        {
            if (array[indice] == numeroDaCercare)
            {
                trovato = true;
            }

            indice++;
        }

        return indice;    
    }



    /**
     * genera un numero casuale da 0 a max 
     * @param max soglia massima per generare il numero
     * @return ritorna un numero casuale
     * @throws Exception viene lanciato un errore se il valore max non è valido 
     */
    private static int generaNumeroCasuale (int max) throws Exception
    {
        if (max < 0)
        {
            throw new Exception("Il valore massimo deve essere maggiore o uguale a zero");
        }

        Random random = new Random();
        return random.nextInt(max);
    }

    /**
     * genera un numero casuale da 0 a max 
     * @param max soglia massima per generare il numero
     * @return ritorna un numero casuale
     * @throws Exception viene lanciato un errore se il valore max non è valido 
     */
    private static float generaNumeroCasuale (float max) throws Exception
    {
        if (max < 0)
        {
            throw new Exception("Il valore massimo deve essere maggiore o uguale a zero");
        }

        Random random = new Random();
        return random.nextFloat(max);
    }

    /**
     * genera un numero casuale da 0 a max 
     * @param max soglia massima per generare il numero
     * @return ritorna un numero casuale
     * @throws Exception viene lanciato un errore se il valore max non è valido 
     */
    private static double generaNumeroCasuale (double max) throws Exception
    {
        if (max < 0)
        {
            throw new Exception("Il valore massimo deve essere maggiore o uguale a zero");
        }

        Random random = new Random();
        return random.nextDouble(max);
    }

}
