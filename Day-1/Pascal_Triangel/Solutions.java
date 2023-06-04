class Solution {
    public List<List<Integer>> generate(int N) {
      
      // Create a nested list to return the anwers
        List<List<Integer>> list = new ArrayList<>();

      // Create a list of size N and all the values in nested list mapped to 1
        for(int i =0; i < N; i++){
           Integer[] temp = new Integer[i+1];
           Arrays.fill(temp,1);
           list.add(Arrays.asList(temp));
        }

      // if the list has size of N and by using the formula we can get the solution
      // list.get(i-1).get(j-1)+list.get(i-1).get(j) to get the top row and field
        for(int i = 2; i < N ; i++){
            for(int j = 1; j < list.get(i).size()-1; j++){
                list.get(i).set(j, list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
        }


        return list;
    }
}
