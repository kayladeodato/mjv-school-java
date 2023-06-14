package banco;

import java.time.LocalDate;

public class Terminal {
    public static void main(String[] args) {


        Cliente cliente1 = new Cliente("Maria", LocalDate.of(1990,8,01));
        ContaBancaria conta1 = new ContaBancaria(cliente1, "0001", "25820-8");
        conta1.depositar(500.00);


        Cliente cliente2 = new Cliente("João", LocalDate.of(1982,5,13));
        ContaBancaria conta2 = new ContaBancaria(cliente1, "0002", "15830-9");
        conta2.depositar(500.00);


        conta1.sacar(120.00);
        System.out.println(conta1.consultarSaldo());

        conta1.consultarExtrato();


    }
}
