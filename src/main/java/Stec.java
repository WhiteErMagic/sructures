public class Stec {

    private int maxSize;
    private String[] stack;
    private int top;

    public Stec(int size){
        this.maxSize = size;
        this.stack = new String[this.maxSize];
        this.top = -1;
    }

    public boolean isEmpty(){
        return (this.top == -1);
    }

    public boolean isFull(){
        return (this.top == this.maxSize-1);
    }

    public void push(String i){
        this.stack[++this.top] = i;
    }


    public String pop(){
        return this.stack[this.top--];
    }

    public String peek(){
        return this.stack[this.top];
    }

}
