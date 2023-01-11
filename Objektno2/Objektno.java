class Objektno{
    public static void main(String[] args){
        System.out.println("Objektno programiranje");

        // objekt / instanca razreda
        StringBuffer sb = new StringBuffer();
        sb.append("pa");
        System.out.println(sb);
        sb.append("ram");
        System.out.println(sb);
        System.out.println("-------------")

        StringPomnilnik sp = new StringPomnilnik();
        sp.append("pa");
        System.out.println(sp.vrednost());
        sp.append("ram");
        System.out.println(sp.vrednost())
        System.out.println("-------------")
        
        StringPomnilnik sp2 = new StringPomnilnik();
        System.out.println(sp2.vrednost());

        /* Lastnosti:
           -Vedenje (ang. behavior): določeno z metodami
           -Stanje (ang. state): hrani odziv na klic metode
           -Enoznačnost (ang. identity):  omogoča razlikovanje z drugimi objekti, ki imajo isto vedenje in stanje
        */
    }
}