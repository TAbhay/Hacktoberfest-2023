public class queue_array{
    static class queue{
        static int arr[];
        static int size;
        static int rear=-1;
        queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty() {
            return rear==-1;
        }
        //add/enqueue
        public static void add(int data) {
            if(rear==size-1)
            {
                System.out.println("Full queue");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //remove/dequeue-O(n)
        public static int remove() {
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek() {
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}