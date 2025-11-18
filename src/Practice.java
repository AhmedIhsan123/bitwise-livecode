public class Practice {
    public static void main(String[] args) {
        int color = 0xc4246d;
        int bMask = 0x0000FF;
        int gMask = 0x00FF00;
        int rMask = 0xFF0000;

        int blue = color & bMask;
        int green = (color & gMask) >> 8;
        int red = (color & rMask) >> 16;
        // int x = 0b10101; // 21
        // int p = 0b11001;
        // int y = 0xcf4e; // 53070
        // int z = 94; // 1011110

        // int q = x & p;

        // 10001
        // System.out.println(Integer.toBinaryString(q));
        System.out.println(Integer.toHexString(blue));
        System.out.println(Integer.toHexString(green));
        System.out.println(Integer.toHexString(red));
        
        // System.out.println(x);
        // System.out.println(y);
        // System.out.println(Integer.toBinaryString(z));
    }
}