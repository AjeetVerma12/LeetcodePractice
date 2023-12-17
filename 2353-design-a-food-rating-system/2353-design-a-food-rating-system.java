class FoodRatings {
    
    private HashMap<String,Integer> foodRating = new HashMap<>();
    private HashMap<String,String> foodCuisine = new HashMap<>();
    private Map<String, TreeSet<Pair<Integer, String>>> cuisineFood = new HashMap<>();
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        int n=foods.length;
        for(int i=0;i<n;i++) {
            foodRating.put(foods[i],ratings[i]);
            foodCuisine.put(foods[i],cuisines[i]);
            cuisineFood.computeIfAbsent(cuisines[i], k -> new TreeSet<>((a, b) -> {
                    int compareByRating = Integer.compare(a.getKey(), b.getKey());
                    if (compareByRating == 0) {
                        return a.getValue().compareTo(b.getValue());
                    }
                    return compareByRating;
                }))
                .add(new Pair(-ratings[i], foods[i]));
        }
    }
    
    public void changeRating(String food, int newRating) {
        String cuisine = foodCuisine.get(food);
        TreeSet<Pair<Integer, String>> cuisineSet = cuisineFood.get(cuisine);
        Pair<Integer, String> oldElement = new Pair<>(-foodRating.get(food), food);
        cuisineSet.remove(oldElement);
        foodRating.put(food,newRating);
        cuisineSet.add(new Pair<>(-newRating, food));
    }
    
    public String highestRated(String cuisine) {
        Pair<Integer, String> highestRated = cuisineFood.get(cuisine).first();
        return highestRated.getValue();
    }
}

/*
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */