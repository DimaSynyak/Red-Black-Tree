package ua.dima.synyak.main;

import ua.dima.synyak.project.Node;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 7/1/15.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("/home/dmitriy/test");
        List<Node> list = new ArrayList<Node>();
        try {
            if (!file.exists()){
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            Node root = null;
            while (true){
                String str = reader.readLine();
                if (str == null){
                    break;
                }

                root = Node.insert(root, Integer.parseInt(str));
            }
            int diameter = Node.diameterOfTree(root, true);
            System.out.println(diameter);
            root = root;
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }



    }
}
