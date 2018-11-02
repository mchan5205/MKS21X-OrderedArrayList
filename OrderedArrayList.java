import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int startingcapacity){
    super(startingcapacity);
  }
  private int compare(T thing){
    for (int i = 0; i < super.size(); i += 1){
      if (super.get(i).compareTo(thing) > 0){
        return i;
      }
    }
    return super.size();
  }
  public boolean add(T value){
    super.add(compare(value), value);
    return true;
  }
  public void add(int y, T value){
    super.add(compare(value), value);
  }
  public T set(int y, T value){
    T z = super.get(y);
    super.remove(y);
    super.add(compare(value),value);
    return z;
  }
}
