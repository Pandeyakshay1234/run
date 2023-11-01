import java.lang.reflect.Array;
import java.util.*;
public class Constructor_generic_Tree {
     private static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
     }
     public static void main(String[] args) {
      int [] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
      Node root;
        Stack<Node> st = new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==-1)
            {
                st.pop();
            }
            else
            {
                
                Node  t = new Node();
               t.data = arr[i];
               if(st.size()>0){
               st.peek().children.add(t);
               st.push(t);
            }
              else{
                root =t;
              }
              st.push(t);
            
        }
     }
    }
}
