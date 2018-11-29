package lhf.test;

@FunctionalInterface
public interface MyPredict<R,T> {
    R predit(T t,T t1);
}