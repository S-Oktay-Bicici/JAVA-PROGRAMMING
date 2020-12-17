
public interface IKullanici {
	
	void kullaniciKaydet(Kullanici kullanici);
	void kullaniciSil(int id);
	void kullaniciGuncelle(int id,Kullanici kullanici);
	void kullaniciGoruntule();
}
