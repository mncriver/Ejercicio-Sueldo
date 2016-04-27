
public class Administrativo extends Empleado{

	double hs_extras;
	double hs_mes;
	
	public double getSueldo()
	{
		return (getSueldo_base()*(((getHs_extras()*1.5)+getHs_mes())/ getHs_mes()));
	}

	public double getHs_extras() {
		return hs_extras;
	}

	public void setHs_extras(double hs_extras) {
		this.hs_extras = hs_extras;
	}

	public double getHs_mes() {
		return hs_mes;
	}

	public void setHs_mes(double hs_mes) {
		this.hs_mes = hs_mes;
	}
}
