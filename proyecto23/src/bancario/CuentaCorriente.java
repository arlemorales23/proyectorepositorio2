package bancario;
public class CuentaCorriente
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Saldo actual de la cuenta corriente.
     */
    private double saldo;

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Inicializa la cuenta corriente. <br>
     * <b>post: </b> Se inicializ� el saldo en 0.
     */
    public CuentaCorriente( )
    {
        saldo = 0;
    }

    /**
     * Retorna el saldo de la cuenta del cliente. <br>
     * @return Saldo de la cuenta corriente.
     */
    public double darSaldo( )
    {
        return saldo;
    }

    /**
     * Consigna un monto de dinero en la cuenta del cliente. <br>
     * <b>post: </b> El saldo se increment� en el monto de dinero dado. <br>
     * @param pMonto Monto de dinero a consignar en la cuenta. pMonto > 0.
     */
    public void consignarMonto( double pMonto )
    {
        saldo = saldo + pMonto;
    }

    /**
     * Retira un monto de dinero de la cuenta del cliente. <br>
     * <b>post: </b> El saldo se redujo en el monto de dinero dado.
     * @param pMonto Monto de dinero a retirar en la cuenta. pMonto > 0.
     */
    public void retirarMonto( double pMonto )
    {
        saldo = saldo - pMonto;
    }
}