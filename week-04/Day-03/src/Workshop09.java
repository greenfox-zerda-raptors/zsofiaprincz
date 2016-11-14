/**
 * Created by zsofiaprincz on 13/11/16.
 */


    /**************************************************************************************************
     * Workshop: Practice Exceptions: I have to have it my way.  When an exception occurs, I want a
     * special error message, namely "7's are cannibals!" printed.
     *
     *
     * So, I'm looking for the following output:
     * try - first statement
     * start - myMethod
     * An Exception Occurred
     * 7's are cannibals
     * Finally I did this instead
     * ::::FINISH LINE:::: out of the try/catch/finally statement
     *
     * Refer to Workshop07
     **************************************************************************************************/
import java.util.*;

    public class Workshop09{

        static void myMethod() throws Exception{
            throw new Exception("7's are cannibals");


        }// something should appear here before (see Workshop07)

        public static void main(String  args[]) {
            try{
                myMethod();
            } catch (Exception e){
                System.out.println("Finally I did this instead");
            }
        }// see Workshop07

    }

