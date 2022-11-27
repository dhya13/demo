package justfor.tests;

public class CheckParentheses {

    public static void main(String []args){
        String variable = "(([(])))";
        boolean check = isCheck(variable);
        System.out.println("la variable est bien checkée: "+check);
    }

    private static boolean isCheck(String variable) {
        if(variable==null || (variable!=null && variable.trim()==""))
            return true;
        String afterTrans =variable ;

       while (afterTrans.indexOf("()")!=-1 || afterTrans.indexOf("[]")!=-1){
           afterTrans=afterTrans.trim().replace("()","");
           afterTrans = afterTrans.trim().replace("[]","");
       }
        if(afterTrans.contains("(") || afterTrans.contains(")") || afterTrans.contains("[") || afterTrans.contains("]"))
            return false;


        return true;

    }

}
