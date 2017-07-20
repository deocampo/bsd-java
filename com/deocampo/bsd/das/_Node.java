package com.deocampo.bsd.das;

public class _Node {

	    protected int data;
	    protected _Node next, prev;
	 
	    /* Constructor */
	    public _Node()
	    {
	        next = null;
	        prev = null;
	        data = 0;
	    }
	    /* Constructor */
	    public _Node(int d, _Node n, _Node p)
	    {
	        data = d;
	        next = n;
	        prev = p;
	    }
	    public _Node(int val, Object object) {
			// TODO Auto-generated constructor stub
		}
		/* Function to set link to next node */
	    public void setLinkNext(_Node n)
	    {
	        next = n;
	    }
	    /* Function to set link to previous node */
	    public void setLinkPrev(_Node p)
	    {
	        prev = p;
	    }    
	    /* Funtion to get link to next node */
	    public _Node getLinkNext()
	    {
	        return next;
	    }
	    /* Function to get link to previous node */
	    public _Node getLinkPrev()
	    {
	        return prev;
	    }
	    /* Function to set data to node */
	    public void setData(int d)
	    {
	        data = d;
	    }
	    /* Function to get data from node */
	    public int getData()
	    {
	        return data;
	    }
	    
}
