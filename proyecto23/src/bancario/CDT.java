package bancario;

public class CDT {
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Valor inicial del CDT.
     */
    private double valorInvertido;

    /**
     * Inter�s mensual que del CDT
     */
    private double interesMensual;

    /**
     * Mes de apertura del CDT.
     */
    private int mesApertura;

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Inicializa el CDT. <br>
     * <b>post: </b> El valor invertido, el inter�s mensual y la fecha se inicializaron en 0.
     */
    public CDT( )
    {
        valorInvertido = 0;
        interesMensual = 0;
        mesApertura = 0;
    }

    /**
     * Retorna el inter�s que paga el banco mensualmente por este CDT.
     * @return Inter�s mensual del CDT.
     */
    public double darInteresMensual( )
    {
        return interesMensual;
    }

    /**
     * Inicia una inversi�n en un CDT .<br>
     * <b>post: </b> Se cambian los valores del CDT, con los valores recibidos. <br>
     * @param pMontoInvertido Monto de dinero que se va a invertir en el CDT. pMontoInvertido > 0.
     * @param pInteresMensual Inter�s mensual que va a ganar el CDT. pInteresMensual > 0.
     * @param pMes Mes de apertura del CDT. pMes > 0.
     */
    public void invertir( double pMontoInvertido, double pInteresMensual, int pMes )
    {
        valorInvertido = pMontoInvertido;
        interesMensual = pInteresMensual;
        mesApertura = pMes;
    }

    /**
     * Calcula el valor presente de la inversi�n teniendo en cuenta el inter�s de la cuenta. <br>
     * @param pMesActual Mes actual del simulador. pMesActual > 0.
     * @return Valor presente del dinero invertido en CDT.
     */
    public double calcularValorPresente( int pMesActual )
    {
        int mesesTranscurridos = pMesActual - mesApertura;
        return ( double ) ( valorInvertido + ( mesesTranscurridos * interesMensual * valorInvertido ) );
    }

    /**
     * Cierra el CDT y retorna el valor invertido m�s los intereses. <br>
     * <b>post: </b> Se retorn� el rendimiento del CDT, y se reinici� sus atributos a 0.
     * @param pMesActual Mes de cierre para calcular el rendimiento del CDT.
     * @return Valor de cierre del CDT.
     */
    public double cerrar( int pMesActual )
    {
        double valorCierre = calcularValorPresente( pMesActual );
        valorInvertido = 0;
        interesMensual = 0;
        mesApertura = 0;
        return valorCierre;
    }
}