class StringPomnilnik{
    //StringBuffer
    int dolzina =
    String pomnilnik = "niz";  // nizpa

    boolean lahkoSpreminjamo = false;
    boolean nemoremoSpreminjati;

    {
        // inicializacijski blok
        nemoremoSpreminjati = false;
    }
    
    void append(String pomn){  // pa
        pomnilnik += pomn;
    }
        
    // podatkovni top - tip, ki ga vračami iz metode
    // ime - vedenje objetka/razreda poimenujemo
    String vrednost(){
        return pomnilnik;
        }  

        String konstantnaVrednost(){
            return "vrednost"
        }   
}