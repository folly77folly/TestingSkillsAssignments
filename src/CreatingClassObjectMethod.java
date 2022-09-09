public class CreatingClassObjectMethod {

    public String callMethod()
    {
        return ("this is class method been called");
    }

    public static void main(String[] args) {
        CreatingClassObjectMethod myObj = new CreatingClassObjectMethod();
        String result = myObj.callMethod();
        System.out.println(result);
    }
}
