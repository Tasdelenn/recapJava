package Intro;

public class _10_stringOperations {

    public static void main(String[] args) {

        String message = "The weather is cool today.";   // String is char[] array !
        System.out.println(message);
        System.out.println("Count of elements = " + message.length());  // Number of letters on String
        System.out.println(message.charAt(4));  // Fifth char

        /**
        System.out.println("------------------------------");
        System.out.println(message.concat(" Owww No! "));
        System.out.println(message);

        System.out.println("------------------------------");
        String message2 = message.concat(" Yes of course!");    // Concat i daha sonra kullanacaksan, bi değişkene atamalısın !
        System.out.println(message2);

        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("."));

        char[] characters = new char[20];
        message.getChars(0,11,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf("is"));
        System.out.println(message.indexOf("w"));
        System.out.println(message.indexOf("W"));   // Bulamazsa -1 dönüyo
        System.out.println(message.lastIndexOf("w"));
        System.out.println(message.indexOf("a"));
        System.out.println(message.lastIndexOf("a"));   // Yine indexi veriyo ama bulmaya soldan başlıyo.
        */

        String newMessage = message.replace(' ','_');
        System.out.println(newMessage);
        System.out.println(message.substring(0,12));

        for(String word : message.split(" "))
        {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        String message3 = "               " + message + "       ---          ";
        System.out.println(message3);
        System.out.println(message3.trim());

    }
}
