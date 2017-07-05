package com.deocampo.bsd.basic;
// ----------------------------------------------------------------------
// Count components
// ----------------------------------------------------------------------

/**
* Artifact factory.
*
* @component
*/

// ----------------------------------------------------------------------
// Public methods
// ----------------------------------------------------------------------

class Count {
    public static void main(String[] args)
        throws java.io.IOException
    {
        int count = 0;

        while (System.in.read() != -1)
            count++;
        System.out.println("Input has " + count + " chars.");
    }
}

