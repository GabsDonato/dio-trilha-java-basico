import java.util.Scanner;

public class ContaTerminal {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a class Scanner

        int Numero = 0;
        String Agencia = "";
        String NomeCliente = "";
        double Saldo = 0.0;        

        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        
        System.out.println("Bem vindo ao Banco do Terminal");
        System.out.println("Digite o número da sua conta:");
        Numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agencia:");
        Agencia = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        NomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        Saldo = scanner.nextDouble();

        // Obter pelo scanner os valores digitados pelo terminal 
        // exibir a mensagem da conta criada
        System.out.println("Conta criada com sucesso!");
        String mensagem = "Olá" + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " e seu número de conta é " + Numero + " e seu saldo" + Saldo + "Já esta diposnível para saque.";
        System.out.println(mensagem);
    }

    private static int extracted(Scanner scanner) {
        return scanner.nextInt();
    }
}
