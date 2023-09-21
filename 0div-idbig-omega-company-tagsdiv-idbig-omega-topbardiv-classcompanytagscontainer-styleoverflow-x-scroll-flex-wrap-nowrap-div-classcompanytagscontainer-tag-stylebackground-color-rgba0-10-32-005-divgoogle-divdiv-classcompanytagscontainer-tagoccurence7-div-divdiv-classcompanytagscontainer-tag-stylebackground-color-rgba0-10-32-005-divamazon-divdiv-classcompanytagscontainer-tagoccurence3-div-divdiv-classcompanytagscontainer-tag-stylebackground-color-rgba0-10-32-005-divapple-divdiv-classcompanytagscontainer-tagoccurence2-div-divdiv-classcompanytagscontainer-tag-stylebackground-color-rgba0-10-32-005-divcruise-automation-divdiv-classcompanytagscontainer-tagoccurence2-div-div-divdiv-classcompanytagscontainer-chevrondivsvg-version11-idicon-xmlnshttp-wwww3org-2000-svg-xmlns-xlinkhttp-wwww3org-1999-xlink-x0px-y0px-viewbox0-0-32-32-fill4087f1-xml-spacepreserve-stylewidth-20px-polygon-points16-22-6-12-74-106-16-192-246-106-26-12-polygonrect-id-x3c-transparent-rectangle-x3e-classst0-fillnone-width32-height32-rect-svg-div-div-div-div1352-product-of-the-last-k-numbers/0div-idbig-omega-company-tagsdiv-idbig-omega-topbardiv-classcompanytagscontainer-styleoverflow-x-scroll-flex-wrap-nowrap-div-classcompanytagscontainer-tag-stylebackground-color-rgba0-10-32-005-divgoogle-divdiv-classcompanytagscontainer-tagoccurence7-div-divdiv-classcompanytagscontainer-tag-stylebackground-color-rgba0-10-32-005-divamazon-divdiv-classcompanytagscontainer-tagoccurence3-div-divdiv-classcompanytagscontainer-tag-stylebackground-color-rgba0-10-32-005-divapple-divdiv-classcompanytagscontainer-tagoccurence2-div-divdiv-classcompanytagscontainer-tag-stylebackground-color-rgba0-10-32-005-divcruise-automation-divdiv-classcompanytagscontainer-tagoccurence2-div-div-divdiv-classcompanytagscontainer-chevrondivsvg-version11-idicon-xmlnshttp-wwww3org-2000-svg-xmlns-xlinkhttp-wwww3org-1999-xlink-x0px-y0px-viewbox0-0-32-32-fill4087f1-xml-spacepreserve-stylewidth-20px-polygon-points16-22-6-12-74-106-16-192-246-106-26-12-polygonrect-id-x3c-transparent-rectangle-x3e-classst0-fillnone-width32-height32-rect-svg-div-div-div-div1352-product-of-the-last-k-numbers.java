class ProductOfNumbers {

    public List<Integer> nums;
    public ProductOfNumbers() {
        nums=new ArrayList<>();
    }
    
    public void add(int num) {
        nums.add(num);
    }
    
    public int getProduct(int k) {
        int l=nums.size()-1;
        int i;
        int product=1;
        for(i=0;i<k;i++)
        {
            product *= nums.get(l--);
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */