public class CWG_14String_Method {
    public static void main(String[] args) {
        String name = "gaurav";
        System.out.println(name.length());
        // System.out.println(name.toLowerCase());
        // System.out.println(name.toUpperCase());
        // String nonTrimmString = "    Gaurav     ";
        // System.out.println(nonTrimmString);
        // System.out.println(nonTrimmString.trim());

        // System.out.println(name.substring(2)); // 2 se start hoga
        // System.out.println(name.substring(1,4)); // 1 se start hoga but not 4 tak 3 tak hoga
        // System.out.println(name.replace("u", "n"));
        // System.out.println(name.replace("rav", "tham"));
        // System.out.println(name.charAt(2));
        // System.out.println(name.indexOf("ra"));
        System.out.println(name.lastIndexOf("ras"));
        System.out.println(name.equalsIgnoreCase("Gaurav"));
    }
}
