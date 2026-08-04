public class Literal{
  public static void main(String[] args){

    int var1 = 42;
    int var2 = 052; //0 at the front represents OCTAL
    int var3 = 0b101010; //0b at the front represents BINARY
    int var4 = 0x2A; //0x represents hexadecimal

    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var3);
    System.out.println(var4);

    System.out.println("===========");
    System.out.println(Integer.toBinaryString(var1));
    System.out.println(Integer.toOctalString(var1));
    System.out.println(Integer.toHexString(var1));

    System.out.println("===========");
    byte byteVar = 45;
    System.out.println(byteVar);
    System.out.println(Byte.MIN_VALUE);
    System.out.println(Byte.MAX_VALUE);

    short shortVar = 45;
    System.out.println(shortVar);
    System.out.println(Short.MIN_VALUE);
    System.out.println(Short.MAX_VALUE);

    long longVar = 21474836499L; //L or l (long literal)
    System.out.println(longVar);

    float floatVar = 23.324F; //F or f (float literal)
    System.out.println(floatVar);

    double doubleVar = 234.3242;
    System.out.println(doubleVar);

    System.out.println("===========");
    char charVar='a';
    System.out.println(charVar);

    char charVar1 = 65;
    System.out.println(charVar1);


    double doubleVar1 = '\u0016';  //UNICODE REPRESENTATION
    System.out.println(doubleVar1);

    char charVar3 = 065;
    System.out.println(charVar3);

    char charVar4 = 0x65;
    System.out.println(charVar4);

    boolean bVar = true;
    System.out.println(bVar);

  }
}