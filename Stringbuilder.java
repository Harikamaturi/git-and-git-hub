import java.util.*;
public class Stringbuilder{
    public static void main(String []args){
        StringBuffer buffer=new StringBuffer("It is used to specified index position");
        buffer.append("in java");
        System.out.println(buffer);
        int offset;
        buffer.insert(14,"insert text");
        buffer.reverse();
        System.out.println(buffer);

    }
}
