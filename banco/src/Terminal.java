import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Terminal {

    public static void main(String[] args) {

        //DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YYYY");

        Cliente cliente1 = new Cliente("Maria", LocalDate.of(1990, 8, 01));
        ContaBancaria conta1 = new ContaBancaria(cliente1, "0001", "25820-8");
        conta1.depositar(500.00);


        Cliente cliente2 = new Cliente("João", LocalDate.of(1982, 5, 13));
        ContaBancaria conta2 = new ContaBancaria(cliente1, "0002", "15830-9");
        conta2.depositar(500.00);


        conta1.sacar(250.00);
        System.out.println(conta1.consultarSaldo());

        conta1.transferir(conta2, 180.00);
        System.out.println(conta1.consultarSaldo());
        System.out.println(conta2.consultarSaldo());

        conta1.consultarSaldo();
        System.out.println(conta1.consultarSaldo());

        conta1.consultarExtratoPoPeriodo(LocalDate.of(2023, 06, 01), LocalDate.of(2023,06,17));

        conta1.sacar(70.00);

        conta1.cancelarConta("Troca de banco");
        System.out.println(conta1.isAtiva());

    }
}
