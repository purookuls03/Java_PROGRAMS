public class Template_or_Generic_Method <T> {
    public void display(T arr[]){
        for(T R: arr){
            System.out.println(R);
        }
    }

    public static void main(String[] args) {
        String arr1[] = {"AAA","BBB","CCC"};
        Character arr2[] = {'A', 'B' , 'C' , 'D'};
        Integer arr3[] = {1,2,3,4,5,6,7};
        Template_or_Generic_Method obj = new Template_or_Generic_Method();
        obj.display(arr1);
        obj.display(arr2);
        obj.display(arr3);
    }
}
