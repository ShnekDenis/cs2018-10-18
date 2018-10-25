package by.it.shnek.lesson01;

public class Main {
    public static void main(String[] args) {
        for(byte i = 0; i != -1; ++i) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hexadecimal = Integer.toHexString(i);

            if (binary.length() > 8) { binary = binary.substring(binary.length() - 8); }
            binary = String.format("%8s", binary).replace(" ", "0");
            System.out.printf("%8s %4d %n", binary, i);

            if (octal.length() > 8) {
                octal = octal.substring(octal.length() - 8); }
                octal = String.format("%8s", octal).replace(" ", "0");
            System.out.printf("%8s %4d %n", octal, i);

            if (hexadecimal.length() > 8) { hexadecimal = hexadecimal.substring(hexadecimal.length() - 8); }
            hexadecimal = String.format("%8s", hexadecimal).replace(" ", "0");
            System.out.printf("%8s %4d %n", hexadecimal, i);

        }

    }
}
