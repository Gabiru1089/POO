import java.util.Scanner;
public class View
{
    private Scanner sc;
    private int opcao;
    private Area area = new Area(1,1);

    public void showMenu()
    {


        System.out.printf("** MENU **");
        System.out.printf("\n(1) Área de um triangulo");
        System.out.printf("\n(2) Área de um quadrado");
        System.out.printf("\n(9) Sair");

        this.sc = new Scanner(System.in);

        System.out.printf("\nOpção: ");
        this.opcao = sc.nextInt();

        if (this.opcao == 9)
        {
            System.out.printf("\nSaindo...");
            System.exit(0);
        }

        System.out.printf("\nBase: ");
        area.setBase(sc.nextDouble());

        System.out.printf("\nAltura: ");
        area.setAltura(sc.nextDouble());

        if (this.opcao == 1)
        {
            System.out.printf("\nÁrea de um triângulo com base %.2f e altura %.2f é %.3f", area.getBase(), area.getAltura(), area.triangulo());
        }
        if (this.opcao == 2)
        {
            System.out.printf("\nÁrea de um quadrado com base %.2f e altura %.2f é %.3f", area.getBase(), area.getAltura(), area.quadrado());
        }
    }
}
