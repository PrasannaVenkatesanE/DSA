class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> arr = new ArrayList<>();

        arr.add(Arrays.asList(1));
        for(int i=0;i<rowIndex;i++){
            List<Integer> prev = arr.get(arr.size()-1);
            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            temp.addAll(prev);
            temp.add(0);
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<prev.size()+1;j++){
                row.add(temp.get(j) + temp.get(j+1));
            }
            arr.add(row);
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));

        }
        return arr.get(arr.size()-1);
    }
}