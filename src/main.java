import branches.Branch;
import documents.Document;
import logs.Log;
import java.util.Scanner;
import java.util.List;

public class main 
{
    public static void main(String[] args) 
    {
        Document document = new Document();
        Log log = new Log(document);
                int option = 0;
                do
                {
                    System.out.println("--- GERENCIAMENTO DA ARVORE ---");
                    System.out.println("1 - Adicionar Branch");
                    System.out.println("2 - Adicionar Leaf");
                    System.out.println("3 - Mostrar Document");
                    System.out.println("4 - Criar exemplo pedido no teste");
                    System.out.println("5 - Sair");

                    Scanner scan = new Scanner(System.in);
                    option = scan.nextInt();

                    switch(option)
                    {
                        case 1:
                            document.branches.add(new Branch());
                            System.out.println("Branch adicionado com sucesso!");
                            break;

                        case 2:
                            System.out.println("Selecione o branch em que deseja adicionar a Leaf:");
                            printBranches(document.branches);

                            int branchId = scan.nextInt();
                            Branch branch = document.getBranchById(branchId);
                            
                            System.out.println("Digite o nome da Leaf");
                            scan = new Scanner(System.in);
                            String leafName = scan.nextLine();

                            branch.addLeaf(leafName);
                            break;

                        case 3:
                            log.getLog();
                            break;

                        case 4:
                            createSampleDocument(document);
                            System.out.println("Documento do exemplo criado com sucesso!");
                            break;

                        case 5:
                            System.out.println("Tchau!");
                            break;
                    }
                }
                while(option != 5);
    }

    public static void printBranches(List<Branch> branches)
    {
        for(Branch b : branches){
            System.out.println("Id: " + b.getId());
        }
    }

    public static void createSampleDocument(Document document){
        Branch branch1 = new Branch();
        branch1.addLeaf("leaf");
        document.branches.add(branch1);

        Branch branch2 = new Branch();
        branch2.addLeaf("leaf");
        branch2.addLeaf("leaf");
        document.branches.add(branch2);

        Branch branch3 = new Branch();
        branch3.addLeaf("leaf");
        branch3.addLeaf("leaf");
        document.branches.add(branch3);
    }
}