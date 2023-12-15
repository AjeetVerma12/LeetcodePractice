class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,Integer> map=new HashMap<>();
        int size=paths.size();
        for(int i=0;i<size;i++) {
            map.put((paths.get(i).get(0)),1);
        }
        for(int i=0;i<size;i++) {
            String city=paths.get(i).get(1);
            if(!map.containsKey(city)) {
                return city;
            }
        }
        return "";
    }
}