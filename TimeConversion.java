public class TimeConversion {

    public static String timeConversion(String s) {
    // Write your code here
        String post = s.substring(s.length()-2);
        String[] time = s.substring(0, s.length()-2).split(":");
        
        if ((post.equals("PM") && !time[0].equals("12"))) {
            time[0] = (Integer.parseInt(time[0]) + 12) + "";
        }
        
        if (post.equals("AM") && time[0].equals("12")) {
            time[0] = "00";
        }
        return String.join(":", time);

    }
}
