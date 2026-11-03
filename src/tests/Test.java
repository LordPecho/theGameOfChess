package tests;

public class Test {
    
    /**
     * This is just a test template, used only to copy the for loop. 
     * Might be deleted later
     * 
     * MUST: 
     * 1. be copied to each piece
     * 2. when copied use only the for loop
     * 
     * getMovement_i_j: 
     *                 i is rowIntput
     *                 j is colInput
     * 
     * @param checkMethod check method
     */
    public static void test(boolean getMovement_i_j){
        for (int i=0; i<8; i++){
            String temp = "";
            for (int j = 0; j<8; j++){
                if(getMovement_i_j){
                    temp= temp + i + j + "T" +" ";
                }else{
                    temp= temp + i + j + "F" +" ";
                }
                
            }
            System.out.println(temp +"\n");
            
        }
        
    }

    //initial plan was to make each child of every piece child to have a static test but 
    // after consideration making tests in already existing classes is sufficient and would be more effitient since it is only one test
}
