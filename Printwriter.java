import java.io.PrintWriter;
class Printwriter
{
    public static void main(String args[])
    {
        PrintWriter pw=new PrintWriter(System.out);
        pw.println("Hello world!");
        pw.print("This is a ");
        pw.print("print statement.");
        pw.close();
    }    
}
