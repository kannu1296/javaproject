package Cache;

//Interface Example
public interface Cacheable {
    boolean isExpired();
    Object getIdentifier();

}
