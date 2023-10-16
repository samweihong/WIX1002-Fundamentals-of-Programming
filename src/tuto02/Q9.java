package tuto2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a webpage URL: ");
        String url = scanner.nextLine();
        System.out.print("Please enter a keyword: ");
        String keyword = scanner.nextLine();

        int frequency = 0;

        String content = "";

        try {
            URL oracle = new URL(url);
            BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                content += inputLine + "\n";
            in.close();
        } catch (Exception e) {}

        Pattern pattern = Pattern.compile(keyword, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()) frequency++;

        System.out.println("Frequency of the keyword: " + frequency);
    }
}
