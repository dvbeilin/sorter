package com.sparta;

import java.util.ArrayList;

public class TreeNode {
     int treeVal;
     TreeNode leftNode;
     TreeNode rightNode;
     TreeNode parent;

    public TreeNode(int treeVal, TreeNode parent) {
        this.treeVal = treeVal;
        this.leftNode = null;
        this.rightNode = null;
        this.parent = parent;
    }

    public void addData(int val){
        if (val<this.treeVal){
            if (this.leftNode==null) {this.leftNode=new TreeNode(val, this);}
            else this.leftNode.addData(val);
        }
        else {
            if (this.rightNode==null) {this.rightNode=new TreeNode(val,this);}
            else this.rightNode.addData(val);
        }
    }

    ArrayList<Integer> getData (){
        ArrayList<Integer> out=new ArrayList<Integer>();
        if (this.leftNode!=null){
            out.addAll(this.leftNode.getData());
        }
        out.add(this.treeVal);
        if (this.rightNode!=null){
            out.addAll(this.rightNode.getData());
        }
        return out;
    }

}
