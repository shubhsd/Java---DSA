package Lecture_11_Strings;

public class StringDemo {
    public static void main(String[] args) {
//        Character arrays can be modified
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        char[] fixedSizeCharArr = new char[20];
        System.out.println("Original array ");
        System.out.println(arr);
        arr[2] = 'f';
        System.out.println("Updated array ");
        System.out.println(arr);

//        STRINGS
//        Strings are immutable i.e. there value can't be changed'
        String s = "abc";
        s = "apple"; //Created new String object in the memory
//        s[0]='c'; //This won't work - Operation not supported
        System.out.println("String is " + s);
        System.out.println(s.length());
        System.out.println(s.charAt(1));


//        You can also get copy of the char array from the string
//        Conversion  string <==> character array and vice versa

//        Char array to String
        char[] arrch = {'a', 'b', 't', 's', 'y'};
        String a = new String(arrch);
        arrch[0] = 'x'; //Here char arr changed, not string
        System.out.println(a);
        System.out.println(arrch);

//        String to character array

        String b = "Hello";
        char[] bArr = b.toCharArray();
        System.out.println(b);
        System.out.println(bArr);
        bArr[0] = 'b'; //This can be updated as bArr is a character array
        System.out.println(b);
        System.out.println(bArr);

//        Converting back to String
        b = new String(bArr); //Means assigned new object to object reference b 
        System.out.println(b);
    }
}
