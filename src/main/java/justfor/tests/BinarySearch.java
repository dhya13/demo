package justfor.tests;

public class BinarySearch {

    public static void main(String []args){
        int value = 5;
        MyNode node7 = new MyNode(null, null, 16);
        MyNode node8 = new MyNode(null, null, 2);
        MyNode node9 = new MyNode(null, null, 6);
        MyNode  node4 = new MyNode(node8, node9, 5);
        MyNode node5 = new MyNode(null, null, 8);
        MyNode node6 = new MyNode(node7, null, 17);
        MyNode  node1 = new MyNode(null, node6, 13);
        MyNode  node2 = new MyNode(node4, node8, 7);
        MyNode root = new MyNode(node2, node1, 9);


        MyNode sNode = getNodeByValue(root, value);
        System.out.println("Searched value is "+sNode.getLeft());

    }

    private static MyNode getNodeByValue(MyNode root, int value) {

        if(root==null)
            return null;
        else if(root.getVal()== value)
            return root;
        else if(root.getVal() > value)
            return getNodeByValue(root.getLeft(),value);
        else
            return getNodeByValue(root.getRight(),value);
    }
}


class MyNode{

    MyNode left;
    MyNode right;
    int val;

    public MyNode() {
    }

    public MyNode(MyNode left, MyNode right, int val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }

    public MyNode getLeft() {
        return left;
    }

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public MyNode getRight() {
        return right;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
