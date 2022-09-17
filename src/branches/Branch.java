package branches;

import leaves.Leaf;
import nodes.Node;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Branch implements Node 
{
    private final int id;
    private final int parentId;
    private final List<Leaf> leaves = new ArrayList<>();
    private final Date createdAt = new Date();
    private static int countIds = 0;

    public Branch()
    {
        this.id = countIds + 1;
        this.parentId = countIds;
        countIds += 1;
    }

    @Override
    public void printElements() 
    {
            for(Leaf c: leaves)
            {
                System.out.print(c.getText() + "\t");
            }
    }

    public void addLeaf(String text)
    {
        Leaf leaf = new Leaf(text, leaves.size());
        leaves.add(leaf);
    }

    public List<Leaf> getLeaves() { return leaves; }

    public int getId() 
    {
        return id;
    }

    public int getParentId() 
    {
        return parentId;
    }

    public Date getCreatedAt(){ return createdAt; }
}
