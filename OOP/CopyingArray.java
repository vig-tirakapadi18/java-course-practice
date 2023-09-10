public class CopyingArray {
    public static void main(String[] args) {
        String name = "Vighnesh";
        char arr[] = name.toCharArray();
        int size = arr.length;
        char arr2[] = new char[size];

        int i = 0;
        while(i != size) {
            arr[i] = arr2[i];
            i++;
        }

        // System.out.println("The original array is: "+arr);
        // System.out.println("The copied array is: "+ arr2);
    }
}
