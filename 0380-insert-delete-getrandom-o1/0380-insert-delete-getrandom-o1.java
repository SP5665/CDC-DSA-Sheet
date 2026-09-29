class RandomizedSet {
    List<Integer> list;
    Map<Integer, Integer> hm;
    public RandomizedSet() {
        list = new ArrayList<>();
        hm = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (hm.containsKey(val)) return false;
        list.add(val);
        hm.put(val, list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!hm.containsKey(val)) return false;
        int idx = hm.get(val);
        list.set(idx, list.get(list.size()-1));
        hm.put(list.get(idx), idx);
        list.remove(list.size()-1);
        hm.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */