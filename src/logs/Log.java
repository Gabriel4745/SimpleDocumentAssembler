package logs;

import branches.Branch;
import documents.Document;

import java.util.Date;

public class Log 
{
    Document document;
    public Log(Document document)
    {
        this.document = document;
    }

    public void getLog()
    {
        printLines(2);
        logDocument();
    }

    private void logBranches()
    {
        int size = document.branches.size();
        System.out.print("Total Branches: ");
        System.out.println(size);
    }

    private void logLeaves()
    {
        int size;
        printLines(1);
        System.out.println("Branch Informations: ");
        for(Branch c: document.branches)
        {
            size = c.getLeaves().size();
            System.out.print("Branch: ");
            System.out.println(c.getId());
            System.out.print("Leafs: ");
            c.printElements();
            System.out.println(size);
            System.out.print("Date: ");
            System.out.println(c.getCreatedAt());
            printLines(1);
        }
    }

    private void logDocument()
    {
        for(Branch b: document.branches)
        {
            System.out.println("----- Branch " + b.getId() + " -----"  + "Created at: " + b.getCreatedAt());
            b.printElements();
            printLines(1);
        }
    }

    private void logNow()
    {
        Date date = new Date();
        System.out.println(date);
    }

    private void printLines(int lines)
    {
        for(int i = 0; i < lines; i++)
        {
            System.out.println();
        }
    }
}
