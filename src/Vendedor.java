
public class Vendedor extends Empleado {

	double porcenComision;
	double totalVtas;
	
	public double getSueldo()
	{
		return (getSueldo_base()*(((getPorcenComision()*getTotalVtas()))/ 100));
	}
	public double getPorcenComision() 
	{
		return porcenComision;
	}
	public void setPorcenComision(double porcenComision) 
	{
		this.porcenComision = porcenComision;
	}
	public double getTotalVtas() 
	{
		return totalVtas;
	}
	public void setTotalVtas(double totalVtas)
	{
		this.totalVtas = totalVtas;
	}


}
