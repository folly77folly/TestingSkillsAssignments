public class GlobalAndLocalVariable {
    //public variable
    String myName = "Sola Ademola Global Variable";

    void isLocal()
    {
        // this is a local variable
        String myName = "Sola Ademola is a Local Variable";
        System.out.println(myName);
    }


    public static void main(String[] args) {
        GlobalAndLocalVariable myObj = new GlobalAndLocalVariable();
        myObj.isLocal();
        System.out.println(myObj.myName);

    }
}
