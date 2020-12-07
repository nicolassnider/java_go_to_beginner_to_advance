package Seccion03.stack;

public class dynamicStack {
	private int stackSize;
	private int[] stackArr;
	private int top;
	public dynamicStack(int size) {
		this.stackSize=size;
		this.stackArr=new int[stackSize];
		this.top=-1;
		
	}
	
	
	public void push(int entry) {
		if(this.isStackFull()) {
			System.out.println("Stack is full.Increasing the capacity");
			this.increaseStackCapacity();
			
		}
		this.stackArr[++top]=entry;
	}
	
	public int pop() throws Exception{
		if(this.isStackEmpty()) {
			throw new Exception("Stack is empty can not remove element");
			
		} 
		int entry =this.stackArr[top--];
		System.out.println("Remove entry"+entry);
		return entry;
	}
	private boolean isStackEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	public long peek() {
		return stackArr[top];
	}
	private void increaseStackCapacity() {
		int [] newStack =new int [this.stackSize*2];
		for(int i=0;i<stackSize;i++) {
			newStack[i]=this.stackArr[i];
			
		}
		this.stackArr=newStack;
		this.stackSize=this.stackSize*2;
		
	}
	
public boolean isStackFull() {
	return (top==stackSize-1);
	
}
public static void main(String args[]) {
	dynamicStack stack=new dynamicStack(2);
	for(int i=1;i<10;i++) {
		stack.push(i);
		
	}
	for (int  i=1;i<13;i++) {
		try {
			stack.pop();
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}