package ProtoType;

/**
 *
 * @author Quiej
 */
public interface Iprototype<T extends Iprototype> extends Cloneable {

    public T clone();

    public T deepclone();
}
