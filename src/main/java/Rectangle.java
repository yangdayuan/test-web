import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Scanner;

class Rectangle{

       public static void main(String args[]) throws IOException
       {
               int a = 4;
               int b = 6;
               a^=b^=a=a^b;
               System.out.println(a);
               System.out.println(b);
               char d = '你';
               int c = System.in.read();
               int e = System.in.read();
               int f = System.in.read();
               
               System.out.println(c);
               System.out.println(e);
               System.out.println(f);

               System.out.println((int)d);
               System.out.println((c << 8) | d);
               System.out.println(f);
       }

 
}