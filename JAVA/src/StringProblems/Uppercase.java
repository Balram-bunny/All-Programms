package StringProblems;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "BALRAM LIPINA";
        String[] words = input.split(" ");
        String result = "";
        String a="ankit";
        String b="rahul";
        a.concat("kumar");
        System.out.println(a);
        
        for (String word : words) {
            result = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        
        result = result.trim();
        System.out.println(result);
		

	}

}
