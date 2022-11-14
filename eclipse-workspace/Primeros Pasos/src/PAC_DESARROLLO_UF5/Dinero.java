package PAC_DESARROLLO_UF5;

public abstract class Dinero {
	
	//Métodos getters y setters
	public double getDinero() {
		
		return this.dinero;
	}
	
	public void setDinero(double dinero) {
		
		this.dinero = dinero;
	}
	
	public String getDescription() {
		
		return this.description;
	}
	
	public void setDescription(String description) {
		
		this.description = description;
	}
	
	//Variables que se heredarán
	protected double dinero;
	protected String description;

}


