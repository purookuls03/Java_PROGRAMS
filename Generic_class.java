class Generic_class <T> {
    private T v1;
//    private E v2;

    public void set(T tval) {
        v1 = tval;
//        v2 = tval2;
    }
//    public void setV2(E tval2) {
//        v2 = tval2;
//    }
    public T get(){
        return v1;
    }


    public static void main(String[] args) {
        Generic_class<String> obj1 = new Generic_class<String>();
        Generic_class<Integer> obj2 = new Generic_class<Integer>();
        obj1.set("PUROO");
        System.out.println(obj1.get());
        obj2.set(13);
        System.out.println(obj2.get());


    }
}
