import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int capacity){
    super(capacity);
  }
  public T set(int y, T value){
    if (value == null){
      throw new IllegalArgumentException("no null values");
    }
    else{
      return super.set(y, value);
    }
  }
  public boolean add(T value){
    if (value == null){
      throw new IllegalArgumentException("no null values");
    }
    else{
      return super.add(value);
    }
  }
  public void add(int y, T value){
    if (value == null){
      throw new IllegalArgumentException("no null values");
    }
    else{
      super.add(y, value);
    }
  }
}
