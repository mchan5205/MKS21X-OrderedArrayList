import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int capacity){
    super(capacity)
  }
  public void set(int y, T value){
    if (value == null){
      throw new IllegalArgumentException();
    }
    else{
      super.set(y, value);
    }
  }
}
