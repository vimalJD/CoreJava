public class Calc3{
 
    public Calc3() {
        // TODO Auto-generated constructor stub
    }
     
    public int execute(int op1, int op2){       
        return op1 + op2;
    }
     
    public void printresult(String[] args){
         
        int op1 = Integer.parseInt(args[0]);
        int op2 = Integer.parseInt(args[1]);
        System.out.println("The First value: " + op1);
        
//	showresult("Reult is  " + args + execute(op1, op2));

	showresult("Result is " + execute(op1, op2));
    }
 
    private void showresult(String result) {
        // TODO Auto-generated method stub
        System.out.println(result);
    }
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calc3 calc = new Calc3();
         
        calc.printresult(args);
 
    }
 
}