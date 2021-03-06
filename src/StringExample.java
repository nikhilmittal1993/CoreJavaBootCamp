public class StringExample {
    public static void main(String[] args) {
        String a  = "abc";
        System.out.println(a.hashCode());
        a += "def";
        System.out.println(a.hashCode());

        String b = a;
        String c = new String("abc");

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append("abc");
        System.out.println(stringBuilder.hashCode());
        System.out.println(stringBuilder.toString());

        StringBuffer s = new StringBuffer("abc");
        s.append("xyz");
        System.out.println(s); // returns abcxyz
        s.append(1);
        System.out.println(s); // returns zbcxyz1
    }
}
