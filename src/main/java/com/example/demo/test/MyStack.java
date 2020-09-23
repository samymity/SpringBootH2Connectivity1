public class MyStack {

    int a[] = new int[1000];
    int top;

    MyStack()
    {

        top =-1;
    }


    public boolean push( int x)

    {
        a[++top ] = x;
        return true ;

    }


    public void  pop()
    {
        a[top] = 0;
        top = top-1;


    }

}

class Main {
    public static void main(String args[]) {
        MyStack stack = new  MyStack();
        stack.push (1);
        stack.push (2);
        stack.pop();
        stack.push (3);

        for( int i=0;i<5 ;  i++)
        {
            System.out.println(stack.a[i]);
        }
        System.out.println(stack.a.length);



    }
}