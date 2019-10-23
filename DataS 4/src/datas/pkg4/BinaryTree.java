package datas.pkg4;
public class BinaryTree {
    Node root;
    public BinaryTree(){
    }
    
    public void add(int x) {
        root=add(x,root);
        
    }
    public Node add(Integer x,Node bstree) {
        if (bstree==null)
            return new Node(x);
        if(x<bstree.value)
            bstree.left=add(x,bstree.left);
        else
            bstree.right=add(x,bstree.right);
        return bstree;
    }
    
    public boolean delete(int x){
        Node pred=root;
        Node p = root;
        boolean isLeft=false;
        if(root!=null){
        while(p.value!=x){
            pred=p;
            if(p.value>x){
                isLeft=true;
                p=p.left;
            }
            else{
                isLeft=false;
                p=p.right;
            }
            if(p==null){
                return false;
            }
        }
        if(p.left==null && p.right==null){
            if(p==root){
                root = null;
            }
            if(isLeft ==true){
                pred.left = null;
            }
            else{
                pred.right = null;
            }
        }
        else if(p.right==null){
            if(p==root){
                root = p.left;
            }
            else if(isLeft){
                pred.left = p.left;
            }
            else{
                pred.right = p.left;
            }
        }
        else if(p.left==null){
            if(p==root){
                root =p.right;
            }
            else if(isLeft){
                pred.left = p.right;
            }
            else{
                pred.right = p.right;
            }
        }
        else if(p.left!=null && p.right!=null){
            
            Node succ=getSucc(p);
            if(p==root){
                root = succ;
            }
            else if(isLeft){
                pred.left = succ;
            }
            else{
                pred.right = succ;
            }
            succ.left = p.left;
        }
        }
        else {
            deleteEmpty();
        }
        return true;
    }
    
    public Node deleteEmpty(){
        return root=null;
    }
    
    public Node getSucc(Node xNode){
        Node succ =null;
        Node pred =null;
        Node current = xNode.right;
        while(current!=null){
            pred = succ;
            succ = current;
            current = current.left;
        }
        if(succ!=xNode.right){
            pred.left = succ.right;
            succ.right = xNode.right;
        }
        return succ;
    }
    
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    public void preorder(Node root){
        if(root!=null){
            System.out.print(root.value + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    
    public void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.value + " ");
        }
    }
    
        public void traverse(Node root){
        if(root!=null){
            traverse(root.left);
            System.out.print(children(root) + " ");
            traverse(root.right);
        }
    }
        
         public Node treemin (Node x){
             if (x.left != null)
                return treemin(x.left);
             else 
                 return x;
         }
        
        public void emptyTree(){
        root=null;
    }
        
    public int children(Node node){
        if(node==null){
            return 0;
        }
        else if(node.left!=null && node.right!=null){
            return 2;
        }
        else if(node.left==null && node.right!=null){
            return 1;
        }
        else if(node.left!=null && node.right==null){
            return 1;
        }
        return 0;
    }
    public int count(Node root){
        int count=0;
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        else
            return 1+count(root.left)+count(root.right);
    }
}
