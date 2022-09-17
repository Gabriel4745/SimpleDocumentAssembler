package documents;

import branches.Branch;

import java.util.ArrayList;
import java.util.List;

public class Document 
{
    private final int id;
    public List<Branch> branches = new ArrayList<>();
    private static int countIds = 0;

    public Document()
    {
        this.id = countIds;
        countIds += 1;
    }

    public List<Branch> getBranches() 
    {
        return branches;
    }

    public Branch getBranchById(int id)
    {
       Branch response = new Branch();
        for(Branch b : branches){
            if(b.getId() == id)
                response = b;
        };

        return response;
    }

    public int getId() 
    {
        return id;
    }
}
