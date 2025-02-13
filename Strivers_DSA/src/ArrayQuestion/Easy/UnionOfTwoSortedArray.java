package ArrayQuestion.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6};
        int[] b = {2, 3, 5};
        System.out.println(sortedArray(a,b));
    }
    //<-----------------Not optimal solution for large testcases-------------------------------------->
    //Time Compleixty : O( (m+n)log(m+n) ) . Inserting a key in map takes logN times, where N is no of elements in map
    //Space Complexity : O(m+n) {If Space of Union ArrayList is considered}

//    public static List< Integer > sortedArray(int []arr1, int []arr2) {
//        // Write your code here
//        int n = arr1.length;
//        int m = arr2.length;
//        HashMap<Integer,Integer > freq=new HashMap<>();
//        ArrayList<Integer> Union=new ArrayList<>();
//        for (int i = 0; i < n; i++)
//            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
//
//        for (int i = 0; i < m; i++)
//            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
//        for (int it: freq.keySet())
//            Union.add(it);
//        return Union;
//    }

    //<---------------------------Not optimal solution for large testcases-------------------------->
    //Time Compleixty : O((m+n)log(m+n)). Inserting an element in a set takes logN time, where N is no of elements in the set
    //Space Complexity : O(m+n) {If Space of Union ArrayList is considered}

//    public static List< Integer > sortedArray(int []arr1, int []arr2) {
//        int n = arr1.length;
//        int m = arr2.length;
//        HashSet<Integer> s=new HashSet<>();
//        ArrayList < Integer > Union=new ArrayList<>();
//        for (int i = 0; i < n; i++)
//            s.add(arr1[i]);
//        for (int i = 0; i < m; i++)
//            s.add(arr2[i]);
//        for (int it: s)
//            Union.add(it);
//        return Union;
//    }

    //<---------------------------Optimal Solution------------------------------->
    //Time complexity: O(m+n)
    //Space Complexity: O(m+n)
    public static List< Integer > sortedArray(int []arr1, int []arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0; // pointers
        ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size()-1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size()-1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}
