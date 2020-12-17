

	abstract class GameCaculator{
	
	//bu abstract class ı extends eden her class bu metdou oveerride etmek zorunda
	public abstract void hesapla();
	
	public final void gameOver(){
		System.out.prilntln("Oyun bitti.");
	}
	
}