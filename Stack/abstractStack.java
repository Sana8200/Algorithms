
public abstract class abstractStack {
    int stack[];
    int size;
    int top;

    public abstractStack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = 0;
    }

    public abstract void push(int value);

    public abstract int pop();
}
