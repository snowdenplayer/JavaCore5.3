public class Application {
    public static void main(String[] args) {
        String [] splitter1 = String.valueOf(Double.MAX_VALUE).split("\\.");
        String [] splitter2 = String.valueOf(Double.MIN_VALUE).split("\\.");
        String [] splitter3 = String.valueOf(Float.MAX_VALUE).split("\\.");
        String [] splitter4 = String.valueOf(Float.MIN_VALUE).split("\\.");
        int i1 = splitter1[1].length();
        int i2 = splitter2[1].length();
        int i3 = splitter3[1].length();
        int i4 = splitter4[1].length();

        System.out.println("Max Value double " + i1);
        System.out.println("Min Value double "+i2);
        System.out.println("Max Value float "+i3);
        System.out.println("Min Value float "+i4);
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Float.MIN_VALUE);
    }
}
