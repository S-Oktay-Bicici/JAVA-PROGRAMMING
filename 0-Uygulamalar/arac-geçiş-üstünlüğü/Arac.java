public class Arac implements  Comparable<Arac>{
    public String surucu_adi;
    public String arac_turu;
    public int gecis_ustunlugu;
	
    public Arac(String surucu_adi,String arac_turu){
        this.surucu_adi=surucu_adi;
        this.arac_turu=arac_turu;
		
        if(arac_turu.equals("Kargo")){
            this.gecis_ustunlugu=1;
        }
        else if(arac_turu.equals("Polis")){
            this.gecis_ustunlugu=2;
        }
        else if(arac_turu.equals("Itfaiye")){
            this.gecis_ustunlugu=3;
        }
        else if(arac_turu.equals("Ambulans")){
            this.gecis_ustunlugu=4;
        }
        else {
            this.gecis_ustunlugu=0;
		}
    }

    @Override
    public int compareTo(Arac o) {
            if(this.gecis_ustunlugu<o.gecis_ustunlugu){
                return 2;
            }
            else if(this.gecis_ustunlugu>o.gecis_ustunlugu){
                return -2;
            }
            return 0;
    }

    @Override
    public String toString() {
        String aracBilgi="Sürücü Adı:"+surucu_adi+
                        "\nAraç Türü:"+arac_turu;
        return aracBilgi;
    }
}

