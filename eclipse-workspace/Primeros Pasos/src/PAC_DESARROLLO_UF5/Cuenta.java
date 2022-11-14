package PAC_DESARROLLO_UF5;

import java.util.List;
import java.util.ArrayList;

public class Cuenta{
	
	public Cuenta(Usuario usuario) {
		
		this.usuario = usuario;
		this.saldo = 0.0;
	}
	
	public double getSaldo(){
		
		return this.saldo ;
	}
	
	public void setSaldo(double saldo){
		
		this.saldo = saldo;
	}
	
	 public Usuario getUsuario(){
		 
		 return this.usuario;
	 }
	 
	 public void setUsuario(Usuario usuario){
		 
		 this.usuario = usuario;
	 }

	 public double addIngresos(String description, double cantidad){
		 Ingreso ingreso = new Ingreso(cantidad,description);
		 this.ingresos.add(ingreso);		 
		 return this.saldo += cantidad;
	 }
	 
	 
	 public double addGastos(String description, double cantidad){
		 		 
		 try {
			 this.saldo -= cantidad;
			 if(this.getSaldo() < 0){
				 this.saldo = 0.0;
				 throw new GastoException();	 
			 }
		 }catch(GastoException error){
			 System.out.println(error.getMessage());
			 return this.saldo;
		 }
		 this.gastos.add(new Gasto(cantidad,description));
		 
		 return this.saldo;


		 
	 }
	 
	 public List<Ingreso> getIngresos(){
		 
		 return this.ingresos;
		 
		 
	 }
	 
	 public List<Gasto> getGastos(){
		 
		 return this.gastos;
	 }

	 
	//Sobre escritura del método
	@Override
	public String toString() {
			
		return  this.usuario.toString() + 
				"Saldo: " + this.saldo +
				"Lista Gastos: " + this.getGastos()+
				"Lista Ingresos" + this.getIngresos();
				
		}
	
	private double saldo;
	private Usuario usuario; 
	private List<Gasto> gastos = new ArrayList<>();
	private List<Ingreso> ingresos = new ArrayList<>();
}
