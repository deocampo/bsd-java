package com.deocampo.bsd.basic;
// ----------------------------------------------------------------------
// BigO_Example components
// ----------------------------------------------------------------------

/**
* Artifact factory.
*
* Code comes from : https://javadatastructuresandalgorithms.wordpress.com/2016/10/06/big-o-notation-tutorial-with-examples-in-java/
*
* @component
*/

// ----------------------------------------------------------------------
// Public methods
// ----------------------------------------------------------------------

class BigO_Example {

    public static void main(String[] args)
        throws java.io.IOException
    {
    
        int[] arr = {1, 2, 4, 6, 11, 56, 78, 123, 234, 300};
        //n is the number of input parameters
        //Here n=10

        singleLoop(arr);
        nestedLoop(arr);

        int pivot = 5;
        getToPivot(arr, pivot);

        smoosh(new int[]{1,2,3,4,5,5,5,5,9,10});
        //Here n=10

    }

static void singleLoop(int[] arr) {
    int numberOfOperations = 0;

    for (int i = 0; i < arr.length; i++) {
        numberOfOperations++;
    }
    System.out.println("Numberperations in singleLoop:" + numberOfOperations);
}

 static void nestedLoop(int[] arr) {
    int numberOfOperations = 0;

    for (int i = 0; i < arr.length; i++) {
        for (int y = 0; y < arr.length; y++) {
            numberOfOperations++;
        }
    }
    System.out.println("Numberperations in nestedLoop:" + numberOfOperations);
}


 static void getToPivot(int[] arr, int pivot) {
    int numberOfOperations = 0;

    int length = arr.length;
    int maxIndex = length - 1;

    int i = 0;
    int j = maxIndex;


    while (i < maxIndex && arr[i] < pivot) {         numberOfOperations++;         i++;     }     while (j > 0 && arr[j] > pivot) {
        numberOfOperations++;
        j--;
    }

    System.out.println("Numberperations in getToPivot:" + numberOfOperations);
}


static void smoosh(int[] arr) {
    int numberOfOperations = 0;
    int i = 0;
    int j = 0;

    while (i < arr.length) {
        arr[j] = arr[i];

        do {
            i++;
            numberOfOperations++;
        } while ((i < arr.length) && (arr[i] == arr[j]));
        j++;
    }
    System.out.println("Numberperations in smoosh:" + numberOfOperations);

}

}
