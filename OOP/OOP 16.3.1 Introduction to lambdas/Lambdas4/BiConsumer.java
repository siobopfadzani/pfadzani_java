package Lambdas4;
@FunctionalInterface
public interface BiConsumer<T,U>
 {
    public void accept(T t, U u);
}
