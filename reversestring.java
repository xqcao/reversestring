

public class reversestring {

	public static void main(String[] args) {		
		String word = "Do or do not, there is no try.";
		String result = toreservestring(word);
		System.out.println(result);
	}
	private static String toreservestring(String givestring) {
	    char[] oldc1 = givestring.toCharArray();
	    //System.out.println(oldc1);

	    //first step reverse all
	    int i=0, j=oldc1.length-1;
	    while (i < j) {
	        // change oldc1[i] and oldc1[j]
	        char t = oldc1[i];
	        oldc1[i] = oldc1[j];
	        oldc1[j] = t;
	       i++; 
	       j--;
	    }

	    
	    //second step reverse in one word,
	    int count1 = 0;		    
	    for(int ii = 0; ii < oldc1.length; ii++) {	    	
	    	count1 ++;
	    	if(oldc1[ii] == ' ' || ii == oldc1.length-1) {
	    		int x = ii-count1 + 1, y = ii-1; 	    			    		
	    		if(ii == oldc1.length-1) {
	    			 y = ii; 
	    		}
	    		while( x < y) {
	    			char tt = oldc1[ x ];
	    			oldc1[x] = oldc1[ y ];
	    			oldc1[y] = tt;
	    			x++; 
	    			y--;
	    		}
	    		count1 = 0;
	    	}
	    }
	    

	    
	    
	    //System.out.println(oldc1);
	    String res = new String(oldc1);
	    //System.out.println(b);
	    return res;
	}

}
