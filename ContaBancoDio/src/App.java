import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por Favor, digite o nome do usuário: ");
        String nomeUsuario = teclado.nextLine();
        System.out.println("Por Favor, insira a conta do usuário "+ nomeUsuario+ " :");
        int conta = teclado.nextInt();
        teclado.nextLine(); // Consome a nova linha deixada por nextInt()
        System.out.println("Por Favor, insira a agencia do usuário "+ nomeUsuario + " :");
        String agencia = teclado.nextLine();
        System.out.println("Por Favor, insira o saldo da conta: ");
        Double saldo = teclado.nextDouble();

        ContaTerminal contaUsuario = new ContaTerminal(conta, agencia, nomeUsuario, saldo);
        /* 
                System.out.println("Conta criada com sucesso!");
                System.out.println("Nome do Usuário: " + contaUsuario.getNomeCliente());
                System.out.println("Conta: " + contaUsuario.getConta());
                System.out.println("Agência: " + contaUsuario.getAgencia());
                System.out.println("Saldo: " + contaUsuario.getSaldo());
           */     

        System.out.println("Olá " + contaUsuario.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é " + contaUsuario.getAgencia()+", conta "+ contaUsuario.getConta()+" e seu saldo " + contaUsuario.getSaldo() + " já está disponível para saque");
        teclado.close();

    }
}
