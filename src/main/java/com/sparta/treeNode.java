package com.sparta;

public class treeNode {
     int treeVal;
     treeNode leftNode;
     treeNode rightNode;
     treeNode parent;

    public treeNode(int treeVal, treeNode parent) {
        this.treeVal = treeVal;
        this.leftNode = null;
        this.rightNode = null;
        this.parent = parent;
    }

    public void addData(int val){
        if (val<this.treeVal){
            if (this.leftNode==null) {this.leftNode=new treeNode(val, this);}
            else this.leftNode.addData(val);
        }
        else {
            if (this.rightNode==null) {this.rightNode=new treeNode(val,this);}
            else this.rightNode.addData(val);
        }
    }

    //treeNode getNode()


}
