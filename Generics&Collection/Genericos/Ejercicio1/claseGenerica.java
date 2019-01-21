package Ejercicio1;



public class claseGenerica <T>{

	private T var1;
	
	public claseGenerica() {}
	
	public claseGenerica(T var1) {
		this.var1 = var1;
	}
	
	void setVar1 (T var1) {
		this.var1 = var1;
	}
	
	T getVar1 () {
		return var1;
	}

}
