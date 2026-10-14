package org.example;

public class ContoBancario {
    private double Saldo;

    public ContoBancario (double saldo)
    {
        Saldo = saldo;
    }

    public ContoBancario()
    {
        this (0);
    }

    public void Aggiungi (double cash)
    {
        if (cash < 0) throw new ImportoNonValidoException();

        Saldo += cash;
    }

    public double Leggi()
    {
        return Saldo;
    }

    public void Preleva (double cash) throws SaldoInsufficienteException {
        if (cash < 0) throw new ImportoNonValidoException();

        if (Saldo - cash < 0)
        {
            throw new SaldoInsufficienteException(Saldo, cash);
        }
        else
        {
            Saldo -= cash;
        }
    }
}
