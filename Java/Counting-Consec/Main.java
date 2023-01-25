class Main {
  public static String consec(int[] nums){
    int counter = 0; //Counts the consecutive numbers
    int maxConsec = 0; //Counts the max consecutive numbers
    int seqCount = 0;  //Counts the number of sequences
    String result = "{"; //Starts the formating for results
    

    for(int i = 0; i < nums.length - 1; i++){
      if(nums[i] < nums[i+1]){
        counter++;
      } else {
        counter = 0; // reset and includes number in next count
      }
      
      if(counter > maxConsec) { // compares the each number consecutive count
          maxConsec = counter;
          seqCount = 0;
        }
        
      if(counter == maxConsec){ //Counts the number of sequence
          seqCount++;
      }
       
      result += nums[i] + ", "; //Adds data to results
    }

    result += nums[nums.length - 1] + "}, " + seqCount + " of " + (maxConsec + 1) + "\'s";//Finalize results
    return result;
  }

  
  
  public static void main(String[] args) {
    int[][] Arrays = {
      {2, 2, 4, 1, 4},
      {7, 8, 5, 7, 7, 3, 2, 8},
      {7, 7, 9, 1, 2, 11, 9, 6, 2, 8, 9},
      {4, 18, 10, 8, 13, 16, 18, 1, 9, 6, 11, 13, 12, 5, 7, 17, 13, 3},
      {11, 16, 10, 19, 20, 18, 3, 19, 2, 1, 8, 17, 7, 13, 1, 11, 1, 18, 19, 9, 7, 19, 24, 2, 12}
    };

    for(int i = 0; i < Arrays.length; i++){
      System.out.println(consec(Arrays[i]));
    }
    
    
    
  }
}