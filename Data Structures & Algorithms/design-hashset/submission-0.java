class MyHashSet {
    private List<Integer> metadata;

    public MyHashSet() {
        metadata = new ArrayList<>();
    }

    public void add(int key) {
        if (!metadata.contains(key)) {
            metadata.add(key);
        }
    }

    public void remove(int key) {
        metadata.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        return metadata.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */