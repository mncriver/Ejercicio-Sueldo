
public abstract class Empleado 
{
	String dni;
	String nombre;
	String apellido;
	String email;
	double sueldo_base;
	
	public String getDni()
	{
		return dni;
	}
	public void setDni(String dni)
	{
		this.dni = dni;
	}
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public double getSueldo_base() 
	{
		return sueldo_base;
	}
	public void setSueldo_base(double sueldo_base)
	{
		this.sueldo_base = sueldo_base;
	}
	public abstract double getSueldo();

}

