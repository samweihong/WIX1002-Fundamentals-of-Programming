package finalexam.Q4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        try {
            String filePath = "src/finalexam/nodelist.txt";
            Scanner sc = new Scanner(new FileInputStream(filePath));
            int numberOfNodes = 0;
            while (sc.hasNextLine())
                if (sc.nextLine().contains("NodeName"))
                    ++numberOfNodes;
            sc.close();

            sc = new Scanner(new FileInputStream(filePath));
            Node[] nodes = new Node[numberOfNodes];
            for (int i = 0; sc.hasNextLine(); i++) {
                String[] tokens = new String[6];
                String line;
                do {
                    line = sc.nextLine();
                    for (String arg : line.split(" "))
                        if (arg.startsWith("NodeName")) tokens[0] = arg.split("=")[1];
                        else if (arg.startsWith("CPUTot")) tokens[1] = arg.split("=")[1];
                        else if (arg.startsWith("CPUAlloc")) tokens[2] = arg.split("=")[1];
                        else if (arg.startsWith("RealMemory")) tokens[3] = arg.split("=")[1];
                        else if (arg.startsWith("AllocMem")) tokens[4] = arg.split("=")[1];
                        else if (arg.startsWith("Partition")) tokens[5] = arg.split("=")[1];
                } while (sc.hasNextLine() && !line.equals(""));
                Node node = new Node(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), tokens[5]);
                nodes[i] = node;
            }
            sc.close();

            System.out.println("+" + "-".repeat(52) + "+");
            System.out.println("| Node    Partitions      CPU       MEMORY     RATIO |");
            System.out.println("+" + "-".repeat(52) + "+");
            for (var node : nodes)
                System.out.println("| " + node + " |");
            System.out.println("+" + "-".repeat(52) + "+");
        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        }
    }
}
