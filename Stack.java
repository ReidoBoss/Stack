public class Stack{
   private int maxSize;
   private int[] stackArray;
   private int top;
   
   public Stack(int maxSize){
     this.maxSize = maxSize;
     this.stackArray = new int[maxSize];
     this.top = -1;
   }
   
   public boolean isFull(){
      return (maxSize-1 == top);
   }
   
   public boolean isEmpty(){
      return (top==-1);
   }
   
   public void push(int value){
      if(isFull()){
         System.out.println("Stack overflow");
      }
      else{
         stackArray[++top] = value;
      }
   }
   public int pop(){
      if(isEmpty()){
         System.out.println("Stack underflow");
      }
      else{
         return stackArray[--top];
      }
      return 0;
   }
   
   public int peek(){
      if(isEmpty()){
         System.out.println("Empty");
      }
      else{
         return stackArray[top];
      }
      
      return 0;
   }
   
   public void display(){
      if(isEmpty()){
         System.out.println("Empty");
      }
      else{
         for(int i = 0 ; i <= top; i ++){
            System.out.print(stackArray[i]+" ");
         }
      }
   }
   


}