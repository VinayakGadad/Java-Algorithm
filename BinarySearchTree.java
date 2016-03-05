package CS501_HW6_15226;

public class BinarySearchTree {
    Node root;
    public BinarySearchTree(int[] input){
        for(int i = 0; i<input.length;i++){
            Node node=new Node(input[i]);
            treeInsert(this,node);
            if(i==0)
                this.root=node;
      }
    }
    
    public void treeInsert(BinarySearchTree tree,Node z){
        Node y=null;
        Node x=tree.root;
        if(z == null)
            return;
        while (x != null){
            y=x;
            if(z.key < x.key)
                x=x.left;
            else
                x=x.right;
        }
        z.parent=y;
        if(y == null)
           tree.root = z;
        else if(z.key < y.key)
            y.left = z;
        else
            y.right = z;
        
       }
    
    public Node iterativeTreeSearch(Node x, int key, boolean showPath){
        if(showPath)
            System.out.print("\n Searching for Key = " + key);
        if(x != null && showPath)
            System.out.print(" takes path: " + x.key);
        while(x != null && key != x.key){
            if(key < x.key)
                x=x.left;
            else
                x = x.right;
            if(x != null && showPath)
                System.out.print(" " + x.key);
        }
        if( x==null && showPath){
            System.out.print(" null ");
            System.out.print(" \n unable to find node.key = " + key);
        }
        return x;
    }
    
    public Node treeMinimum(Node x){
        while(x.left != null)
            x=x.left;
        return x;
        
    }
    
    public Node treeSuccessor(Node x){
        
        if(x.right != null)
            return treeMinimum(x.right);
        Node y = x.parent;
        while(y != null && x== y.right){
            x = y;
            y = y.parent;
        }
        return y;
        
       }
    
    public void inorderTreeWalk(Node x){
        if(x != null){
            inorderTreeWalk(x.left);
            System.out.print(x.key + " ");
            inorderTreeWalk(x.right);
            
        }
    }
