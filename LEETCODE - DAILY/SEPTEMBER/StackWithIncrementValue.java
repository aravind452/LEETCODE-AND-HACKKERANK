package SEPTEMBER;

public class StackWithIncrementValue {
  int maxSize;
  int top;
  int[] stack;

  public StackWithIncrementValue(int maxSize) {
    this.maxSize = maxSize;
    this.top = -1;
    stack = new int[maxSize];

  }

  public void push(int x) {
    if (top < maxSize - 1) {
      stack[++top] = x;

    }

  }

  public int pop() {
    if (top != -1) {
      return stack[top--];
    }
    return -1;

  }

  public void increment(int k, int value) {
    for (int i = 0; i <= Math.min(k, top); i++) {
      stack[i] += value;
    }

  }

  public static void main(String[] args) {
    StackWithIncrementValue stack = new StackWithIncrementValue(10);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println(stack.top);
    stack.increment(5, 100);

  }

}
