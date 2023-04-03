package bancario;
public class CuentaAhorros
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Saldo actual de la cuenta de ahorro.
     */
    private double saldo;

    /**
     * Inter�s mensual que paga la cuenta de ahorro.
     */
    private double interesMensual;

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Inicializa la cuenta de ahorro con el inter�s mensual que paga el banco. <br>
     * <b>post: </b> Se inicializ� el saldo en 0 y el inter�s mensual en 0.006.
     */
    public CuentaAhorros( )
    {
        saldo = 0;
        interesMensual = 0.006;
    }

    /**
     * Retorna el saldo del cliente. <br>
     * @return Saldo de la cuenta de ahorros.
     */
    public double darSaldo( )
    {
        return saldo;
    }

    /**
     * Retorna el inter�s mensual. <br>
     * @return Inter�s mensual de la cuenta de ahorros.
     */
    public double darInteresMensual( )
    {
        return interesMensual;
    }

    /**
     * Consigna un monto de dinero en la cuenta del cliente. <br>
     * <b>post: </b> El saldo se increment� en el monto de dinero ingresado. <br>
     * @param pMonto Monto de dinero a consignar en la cuenta. pMonto > 0.
     */
    public void consignarMonto( double pMonto )
    {
        saldo = saldo + pMonto;
    }

    /**
     * Retira un monto de dinero de la cuenta de ahorros. <br>
     * <b>post: </b> El saldo se redujo en el valor dado.
     * @param pMonto Monto de dinero a retirar de la cuenta de ahorros. pMonto > 0.
     */
    public void retirarMonto( double pMonto )
    {
        saldo = saldo - pMonto;
    }

    /**
     * Actualiza el saldo de la cuneta de ahorros sum�ndole los intereses (ha pasado un mes). <br>
     * <b>post: </b> El saldo actual se actualiz� aplicando el porcentaje de inter�s mensual respectivo.
     */
    public void actualizarSaldoPorPasoMes( )
    {
        saldo = saldo + ( saldo * interesMensual );
    }
}