package Algorithm.Searching.Linear;

public class LinearSearch {
    int[] array;
    int ele;
    public LinearSearch(int[] array,int ele){
        this.array = array;
        this.ele = ele;
    }
    public int search(){
        for(int i = 0 ; i < array.length;i++){
            if (array[i] == ele){
                return i;
            }
        }
        return -1;
    }

}
