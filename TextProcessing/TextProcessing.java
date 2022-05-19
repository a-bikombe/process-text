package TextProcessing;

public class TextProcessing {

    public static void main(String[] args) {
        
        String str = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
        
        int len = str.length();    // How long is the string?
        System.out.println("This string is " + len + " characters long.");
            
            System.out.println("There are " + str.split(" ", -1).length + " spaces.");    // How many spaces are there?
        
        System.out.println("The offset of the last instance of \"incidunt ut\" is " + str.lastIndexOf("incidunt ut") + " characters.");
        
        System.out.println("There are " + str.split("sed", -1).length + " instances of \"sed\".");
        
        System.out.println("If you were to replace every \"sed\" substring with \"grep\", the resulting string would be " + str.replaceAll("sed", "grep").length() + " characters long.");    // If you replace all the "sed" substrings with "grep", what is the length of the resulting string?
        
        if (str.contains("reprehenerit")) {    // Is the substring "reprehenerit" present?
            System.out.println("The substring \"reprehenerit\" is present.");
        } else {
            System.out.println("The substring \"reprehenerit\" is not present.");
        }
        
        StringBuilder builtstr = new StringBuilder(str);    // Create a StringBuilder object from the String
        
        builtstr.insert(54, "orange");    // Insert the String "orange" at offset 54
        builtstr.deleteCharAt(20);    // Delete the 21st character
        builtstr.append("avocado");    // Append the string "avocado"
        
        int builtlen = builtstr.length();    // How long is the string?
        System.out.println("This StringBuilder string is " + builtlen + " characters long.");
        
        if (str.indexOf("orange") == str.lastIndexOf("orange")) {    // Do indexOf and lastIndexOf return the same value if you search for "orange"?
            System.out.println("indexOf and lastIndexOf return the same value if you search for \"orange\".");
        } else {
            System.out.println("indexOf and lastIndexOf do not return the same value if you search for \"orange\".");
        }
        
    }
    
}