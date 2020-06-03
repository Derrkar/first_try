package Lesson28_Access_Modifiers;

public class AccessControlDemo
{
    //Private member variable
    private String privateMemberVariable = null;

    //Private member method
    private String privateMethod(){
        return privateMemberVariable;
    }

    public AccessControlDemo(String str) {
        privateMemberVariable = str;
    }

    public void demoAccessOtherClass(AccessControlDemo otherInstance)
    {
        //Access private members of second instance
        System.out.println("Private member variable :" + otherInstance.privateMemberVariable);
        System.out.println("Private member method :" + otherInstance.privateMethod());
    }

    public static void main(String[] args) {
        AccessControlDemo firstInstance = new AccessControlDemo("first instance");
        AccessControlDemo secondInstance = new AccessControlDemo("second instance");

        firstInstance.demoAccessOtherClass(secondInstance);
    }
}
