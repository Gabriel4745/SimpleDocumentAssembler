package leaves;

import nodes.Node;

public class Leaf implements Node 
{
    private  String text;
    private  int id;

    public Leaf(String text, int id)
    {
        this.text = text;
        this.id = id;
    }

    @Override
    public void printElements() 
    {
        System.out.println(text);
        System.out.println(id);
    }

    public String getText() 
    {
        return text;
    }

    public int getId() 
    {
        return id;
    }
}
