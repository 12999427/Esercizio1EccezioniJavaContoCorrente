package org.example;

public class SaldoInsufficienteException extends Exception {
    private double SaldoAttuale;
    private double ImportoRichiesto;

    public SaldoInsufficienteException(double saldoAttuale, double importoRichiesto)
    {
        SaldoAttuale = saldoAttuale;
        ImportoRichiesto = importoRichiesto;
        super("Saldo insufficiente");
    }
}
