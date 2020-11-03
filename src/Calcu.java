public class Calcu {
    public static void main(String[] args){
        double retVal = 0;
        int a = 0;
        String b = "";
        int c = 0;
        Exception e = null;
        try {
            a = Integer.parseInt(args[0]);
            b = args[1];
            c = Integer.parseInt(args[2]);
        } catch (Exception ex){
            e = ex;
            System.out.println("Input harus dengan format [number] [operator] [number]. Operator: + - X /. Contoh: 2 + 3");
        }

        if (e == null){
        if(b.equals("X")){
            retVal = a*c;
            System.out.println(retVal);
        } else if(b.equals("+")){
            retVal = a+c;
            System.out.println(retVal);
        } else if(b.equals("-")){
            retVal = a-c;
            System.out.println(retVal);
        } else if (b.equals("/")){
            retVal = a/c;
            System.out.println(retVal);
        }
        }
    }
}
