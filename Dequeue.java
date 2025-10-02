public class Dequeue<Type>{
    private static class Node<Type> {
        Type item;
        Node<Type> prev;
        Node<Type> next;

        Node(Type element, Node<Type> prev, Node<Type> next) {
            this.item = element;
            this.prev = prev;
            this.next = next;
        }
    }
        private Node<Type> head;
        private Node<Type> tail;
        private  int size;

         public Dequeue(){
            head=null;
            tail=null;
            size=0;
        }

        public void addFirst(Type element){
             if(element==null)
                 throw new IllegalArgumentException("cannot add null element");
             final Node<Type> oldHead=head;
             final Node<Type> newNode=new Node(element,null,oldHead);
             head=newNode;
             if(oldHead==null){
                 tail=newNode;
             }
             else{
                 oldHead.prev=newNode;
             }
             size++;
        }

        public void addLast(Type element){
             if(element==null)
                 throw  new IllegalArgumentException("cannot add null element");
             final Node<Type> oldTail=tail;
             final Node<Type> newNode = new Node(element,oldTail,null);
             tail=newNode;
             if(oldTail==null){
                 head=newNode;
             }
             else{
                 oldTail.next=tail;
             }
             size++;
            }

            public int size(){
             return size;
            }
            public boolean isEmpty(){
             return size==0;
            }

            public Type peekFirst(){
             if(head==null){
                 return null;
             }
             return head.item;
            }

            public Type peekLast(){
             if(tail==null){
                 return null;
             }
             return tail.item;
            }

            public Type removeFirst(){
             if(head==null)
                 throw new java.util.NoSuchElementException("Dequeue is empty");
             final Type element=head.item;
             final Node<Type> newHead=head.next;
             head.item=null;
             head.next=null;
             head=newHead;
             if(head==null){
                tail=null;
             }
             else{
            head.prev=null;
             }
             size--;
             return element;
            }

            public Type removeLast(){
             if(tail==null)
                 throw new java.util.NoSuchElementException("Dequeue is empty");
             final Type element=tail.item;
             final Node<Type> newTail=tail.prev;
             tail.item=null;
             tail.prev=null;
             tail=newTail;
             if(tail==null){
                 head=null;
             }
             else{
                 tail.next=null;
             }
             size--;
             return element; 
            }

            public static  void main(String[] args){
             Dequeue<String> dq=new Dequeue<>();
             dq.addFirst("Rupa");
             dq.addLast("Amma");
             dq.addFirst("Nanna");
             dq.addLast("Pavan");
             System.out.println(dq.peekFirst());
             dq.removeLast();
             System.out.println(dq.peekLast());
            }

}
