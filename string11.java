//final keyword vs immutabilty
//final keyword doesn't allow any changes to the current variable,method etc.

public class string11 {
    public static void main(String[] args) {
        int a=10;
        a=20;
        System.out.println(a);

        // final int a=10;
        // a=20;
        // System.out.println(a);

        //final keyword string ki mutability ko affect nhi krega that means append function to hmm easily perform kr skte hai lekin hmm reference change nhi kr sktee
        final StringBuffer sb=new StringBuffer("Virat");
        sb.append("Kohli");
        //for eg we cnnot refer some other string
        // sb=new StringBuffer("Sachin")
    
    }
}
