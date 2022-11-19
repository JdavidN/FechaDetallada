package modelo;

public class FechaDetallada extends Fecha
{

    
    private static String meses[]={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};

    public FechaDetallada(int dia, int mes, int anio) 
    {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    public String toString()
    {
        return getDia() + " de " + meses[getMes()-1] + " de " + getAnio();

    }
}  


