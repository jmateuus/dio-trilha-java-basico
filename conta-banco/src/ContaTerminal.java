import java.io.Console;
import java.util.Scanner;


public class ContaTerminal {    
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner sc = new Scanner(System.in);
        Console cs = System.console();
        
        System.out.println("Digite o número da conta: ");
        conta.setNumero(sc.nextInt());

        System.out.println("Digite o número da agência: ");
        conta.setAgencia(sc.next());
    
        System.out.println("Digite o nome do titular da conta: ");
        conta.setTitular(cs.readLine());
    
        System.out.println("Olá " +conta.getTitular() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo R$" + conta.getSaldo() + " ja esta disponível para saque.");
       
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("Digite o a operação que vc deseja efetuar: ");
        System.out.println("1-Depositar, 2-Sacar, 3-Sair");
        int operacao = Integer.parseInt(cs.readLine());

        boolean bSaindo = false;
        while (!bSaindo){
             if (operacao == 1) {
                System.out.println("Quanto deseja depositar na sua conta: ");
                conta.Depositar(sc.nextDouble());
                System.out.println("Voce agora tem um valor total de R$" + conta.getSaldo() + " no saldo da sua conta.");
                operacao = 0;

            }else if(operacao == 2){
                System.out.println("Quanto deseja sacar da sua conta: ");
                 conta.Sacar(sc.nextDouble());
                 System.out.println("Voce agora tem um valor total de R$" + conta.getSaldo() + " no saldo da sua conta."); 
                 System.out.println("Saindo..."); 

            }else if (operacao == 3) {
                System.out.println("Obrigado pela preferencia!!");
                bSaindo = true;
            }else{                            
                System.out.println("Digite o a operação que vc deseja efetutar: ");
                System.out.println("1-Depositar, 2-Sacar, 3-Sair");
                operacao = Integer.parseInt(cs.readLine());       
            }
        }
        sc.close();
    }
}