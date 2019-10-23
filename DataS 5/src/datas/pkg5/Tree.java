package datas.pkg5;
public class Tree {
    public Node root;
    
    public Tree(){
        root=null;
    }
    
    public void add(String father, String son){
        Node parent, current;
        Node newMember = new Node(son);
        
        if(root==null)
            root=newMember;
        
        else{
            parent=findName(father, root);
            if(parent.left==null){
                parent.left=newMember;
            }
            else{
                current=parent.left;
                while(current.right!=null){
                    current=current.right;
                }
                current.right=newMember;
            }
                
        }  
    }
          
    public Node findName(String name, Node tree){
        Node current=tree;
        if(current.son.equals(name))
            return current;
        if(current.left!=null){
            Node q = findName(name, current.left);
            if(q!=null){
                return q;
            }
        }
        if(current.right!=null){
            return findName(name, current.right);
        } 
        return null;
    }
    
    public void printTree(Node tree){
        if(tree!=null){
            System.out.println(tree.son);
            printTree(tree.left);
            printTree(tree.right);
        }
    }
    public Node findFather(String name, Node tree){
        Node p = findName(name, tree);
        Node current = tree;
        if(current.left!=null && (current.left==p || (current.left).right==p || current.left.right.right==p)){
            return current;
        }
        else{
            Node father=null;
            if(current.left!=null){
                father = findFather(name, current.left);
            }
            else if(current.right!=null){
                father = findFather(name, current.right);
            }
            return father;
        }
    }
    
    public Node findBrother(String name, Node tree){
        Node p = findName(name, tree);
        Node current=tree;
        if(current.right!=null && (current.right==p || current.right.right==p))
            return current;
        else{
            Node brother =null;
            if(current.left!=null){
                brother = findBrother(name, current.left);
            }
            else if(current.right!=null){
                brother=findBrother(name, current.right);
            }
            else 
                System.out.println(p.son + " doesn't have an older brother");
            return brother;
        }
    }
    public Node findYBrother(String name, Node tree){
        Node p = findName(name, tree);
        Node current=p;
        if(p.right!=null){
            while(p.right!=null){
                current=current.right;
                return current;
            }
        }
        else
            System.out.println(p.son + " doesn't have a younger brother");
        return null;
    }
    
    public Node findSon(String name, Node tree){
        Node p=findName(name, tree);
        Node current=p;
        if(p.left!=null){
            return p.left;
        }
        else
            System.out.println(p.son + " doesn't have a son");
        return null;
    }
    public Node findYSon(String name, Node tree){
        Node p = findName(name, tree);
        Node current=p;
        if(p.left!=null){
            current=p.left;
            if(current.right!=null){
                while(current.right!=null){
                    current=current.right;
                    return current;
                }
            }
            else
                return current;
        }
        else
            System.out.println(p.son + " doesn't have a son");
        return null;
    }
}
