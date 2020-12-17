public class Vasıta {

    private String marka;
    private int model;
    private  String renk;
    private double fiyat;
	
	Vasıta(){
	}

    public void goster(){
        System.out.println(getMarka()+" "+getModel()+" "+getRenk()+" "+getFiyat());
    }


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
