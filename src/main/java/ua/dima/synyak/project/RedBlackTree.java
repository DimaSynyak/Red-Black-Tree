package ua.dima.synyak.project;

/**
 * Created by root on 7/1/15.
 */
public interface RedBlackTree<T1, T2> {
    public T2 get(T1 k);
    public void add(T1 k, T2 v);
    public void remove(T1 k);
}
