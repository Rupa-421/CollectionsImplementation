//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayList<Type>{
    private Object[] data;
    private int size;

    public ArrayList(){
        data=new Object[10];
        size=0;
    }

    public void add(Type element){
        if(size==data.length){
            resize();
        }
        data[size++]= element;
    }
    private void resize(){
        Object[] newData = new Object[data.length*2];
        System.arraycopy(data,0,newData,0,data.length);
        data = newData;
    }

    public Type get(int index){
        if(index>=data.length || index<0) throw new IndexOutOfBoundsException() ;
        return (Type) data[index];
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList =new ArrayList<>();
        arrayList.add("Rupa");
        arrayList.add("Pavan");
        arrayList.add("Amma");
        arrayList.add("nanna");
        arrayList.add("Rupa");
        arrayList.add("Pavan");
        arrayList.add("Amma");
        arrayList.add("nanna");
        arrayList.add("Rupa");
        arrayList.add("Pavan");
        arrayList.add("Amma");
        arrayList.add("nanna");
        arrayList.add("Rupa");
        arrayList.add("Pavan");
        arrayList.add("Amma");
        arrayList.add("nanna");
        arrayList.add("Rupa");
        arrayList.add("Pavan");
        arrayList.add("Amma");
        arrayList.add("nanna");
        arrayList.add("Rupa");
        arrayList.add("Pavan");
        arrayList.add("Amma");
        arrayList.add("nanna");
    for(int index = 0; index <13; index++){
        System.out.println(arrayList.get(index));
    }
    }
}