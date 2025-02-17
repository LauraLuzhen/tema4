package boletin3.ej4;

public class ParseToBoolean {

	int arg;
	
	public int getArg() {
		return arg;
	}

	public void setArg(int arg) {
		if (arg == 1 && arg == 0) {
			this.arg = arg;
		}
	}

	public boolean parseToBoolean (int arg) {
		boolean res;
		
		if (arg == 0) {
			res = false;
		} else {
			res = true;
		}
		
		return res;
	}
}
