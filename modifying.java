public class modifying {
    public static void main(String[] args) {
        //concat(): add two strings
        String s1 = "Hello";
        String s2 = "java program";
        
        System.out.println(s1+s2);
        System.out.println(s1.concat(s2));

        //replace(): to change the strings or chars
        String s3 = "hel hel progral hel program hel";
        //syntx: string.replace(old, new)
        System.out.println(s3);
        System.out.println(s3.replace("hel", "hai"));

        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println(c);



        



    }
    
}
