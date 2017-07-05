package com.deocampo.bsd.basic;
// ----------------------------------------------------------------------
// Echo components
// ----------------------------------------------------------------------

/**
* Artifact factory.
*
* @component
*/

// ----------------------------------------------------------------------
// Public methods
// ----------------------------------------------------------------------

public class Echo {
    public static void main (String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
    }
}
