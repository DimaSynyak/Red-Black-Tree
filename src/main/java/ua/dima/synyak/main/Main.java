package ua.dima.synyak.main;

import ua.dima.synyak.project.BStree;

/**
 * Created by root on 7/1/15.
 */
public class Main {
    public static void main(String[] args) {
        BStree<Integer, Integer> tree = new BStree<Integer, Integer>();

        for (int i = 0; i < 100; i++) {
            tree.add((int)(Math.random() * 10), (int) (Math.random() * 10));
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(tree.get(i));
        }

    }
}
