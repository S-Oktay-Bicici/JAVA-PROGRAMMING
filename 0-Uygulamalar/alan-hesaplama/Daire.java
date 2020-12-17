

	public class Daire extends Hesaplama{
		private double yaricap;
		public Daire(double yaricap) {
			this.yaricap = yaricap;
		}
		
		@Override
		double alan() {
			return Math.PI*(yaricap*yaricap);   
		}

		public double getYaricap() {
			return yaricap;
		}

		public void setYaricap(double yaricap) {
			this.yaricap = yaricap;
		}
	}
