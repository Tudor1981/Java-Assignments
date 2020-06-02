import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.commons.lang3.RandomStringUtils;


public class ListInssertions {

    private ArrayList<String> arrayList;
    private LinkedList<String> linkedList;

    public ListInssertions(int n){

        arrayList = new ArrayList<String>();
        linkedList = new LinkedList<String>();
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                //String random = RandomStringUtils.randomAlphanumeric(3);
                arrayList.add(i, "s1w");
                linkedList.add(i, "s1w");
            }
        }else {
            n = 1;
            arrayList.add(0, "s1w");
            linkedList.add(0, "s1w");
        }
    }

    public void addArrayList(int pos, String elem){
        arrayList.add(pos, elem);
    }
    public void addLinkedList(int pos, String elem){
        linkedList.add(pos, elem);
    }
    public int sizeArrayList(){
        return arrayList.size();
    }
    public int sizeLinkedList(){
        return linkedList.size();
    }
}
