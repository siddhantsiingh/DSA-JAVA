package Stack;

import java.util.Stack;

public class Sort {
    public static void insert(Stack<Integer> s, int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        
        int top=s.peek();
        if(top>val){
            int temp=s.pop();
            insert(s,val);
            s.push(temp);
        }
        else{
            s.push(val);
        }
    }

    public static void sort(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int val= s.pop();
        sort(s);
        insert(s,val);
    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(5);
        s.push(2);
        s.push(3);
        s.push(10);
        s.push(6);

        sort(s);
        


        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

        
    }
}
