package Queue;

public class UsingArray {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr= new int[n];
            size=n;
            rear=-1;

        }
        public static boolean isEmpty(){
            if(rear==-1){
                return true;
            } 
            return false;
        } 
        //add
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
            }
            rear+=1;
            arr[rear]=data;

        }

        //remove
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front =arr[0];
            for(int i=1;i<=rear;i++){
                arr[i-1]=arr[i];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String args[]){
        Queue q= new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}
