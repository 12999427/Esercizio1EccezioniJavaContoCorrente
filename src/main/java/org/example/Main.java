package org.example;

public class Main {
    static void main() {
        ContoBancario cb = new ContoBancario(100);

        try {
            cb.Preleva(120);
        } catch (SaldoInsufficienteException s)
        {
            IO.println(s.getMessage());
        }
        finally {

        }

        try {
            cb.Preleva(-10);
        } catch (ImportoNonValidoException | SaldoInsufficienteException i)
        {
            IO.println(i.getMessage());
        }

        try {
            cb.Preleva(40);
        } catch (SaldoInsufficienteException s) {
            IO.println(s.getMessage());
        } finally {
            IO.println(cb.Leggi());
        }

    }
}
