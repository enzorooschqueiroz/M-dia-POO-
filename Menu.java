import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int option;

        Aluno aluno = new Aluno();

        System.out.println("Digite o RA do aluno");
        aluno.setRA(scanner2.nextInt());

        System.out.println("Digite a Nota da primeira prova : ");
        aluno.setNtPrv1(scanner2.nextDouble());

        System.out.println("Digite a Nota da Segunda prova : ");
        aluno.setNtPrv2(scanner2.nextDouble());

        System.out.println("Digite a Nota do Primeiro trabalho : ");
        aluno.setNtTrab1(scanner2.nextDouble());

        System.out.println("Digite a Nota do Segundo Trabalho : ");
        aluno.setNtTrab2(scanner2.nextDouble());

        do{

            System.out.println("1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("2 - Exibir Média dos Trabalhos/Provas");
            System.out.println("3 - Exibir Média Final");
            System.out.println("4 - Sair");
            System.out.println("Escolha a Interação : ");
            option = scanner.nextInt();

            switch (option) {
                case 1:

                    System.out.println(String.format("RA do Aluno %d", aluno.getRA()));
                    System.out.println(String.format("A nota da primeira prova foi : %.2f ", aluno.getNtPrv1()));
                    System.out.println(String.format("A nota da segunda prova foi : %.2f ", aluno.getNtPrv2()));
                    System.out.println(String.format("A nota do primeiro trabalho foi : %.2f ", aluno.getNtTrab1()));
                    System.out.println(String.format("A nota do segundo trabalho foi : %.2f", aluno.getNtTrab2()));

                    break;
            
                case 2:

                    System.out.println(String.format("RA do Aluno %d", aluno.getRA()));
                    System.out.println(String.format("A média das notas das provas foi : %.2f", aluno.calcMediaProva()));
                    System.out.println(String.format("A média das notas dos trabalhos foi : %.2f", aluno.calcMediaTrab()));
                    break;

                case 3:

                    System.out.println(String.format("RA do Aluno %d", aluno.getRA()));
                    System.out.println(String.format("A Média total é : %.2f", aluno.calcMediaTotal()));
                    break;
                
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida... Tente novamente.");

            }
        } while (option != 4);
        
        scanner.close();
        scanner2.close();
    }
}
