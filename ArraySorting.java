import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        char[] ch={'a','b','c','d','e','f','g','h','i'};

        String[] comb=new String[arr.length];

        for(int x=0;x<arr.length;x++){

            comb[x]=arr[x]+""+ch[x];
        }
        System.out.println(Arrays.toString(comb));

        //Sorting of array
//        int[] sort ={56,67,45,0,9};
//        int temp ;
//
//        for(int i=0;i<sort.length-1;i++){
//            for (int j = i+1; j <sort.length; j++) {
//                if (sort[i] > sort[j]) {
//                    temp = sort[i];
//                    sort[i] = sort[j];
//                    sort[j] = temp;
//                }
//                for(int t:sort){
//                    System.out.print(arr[t]+" ");
//                }

                for (int i = 0; i < sort.length - 1; i++) {
                    for (int j = i + 1; j < sort.length; j++) { // ✅ use j < sort.length
                        if (sort[i] > sort[j]) { // ✅ correct variable name
                            temp = sort[i];
                            sort[i] = sort[j];
                            sort[j] = temp;
                        }
                    }

                    // ✅ Print array after each outer loop
                    System.out.print("After pass " + (i + 1) + ": ");
                    for (int num : sort) { // ✅ correct loop
                        System.out.print(num + " ");
                    }
                    System.out.println();
            }
        }
        }


    }
}

