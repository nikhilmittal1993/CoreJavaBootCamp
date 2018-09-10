import com.AccessModifierExample;

public class AcccessModifierMainClass {
    public static void main(String[] args) {
        AccessModifierExample accessModifierExample = new AccessModifierExample();
        System.out.println(accessModifierExample.b);
    }
}

class AccessModifierImpl extends AccessModifierExample {
    void method() {
        System.out.println(c);
    }
}