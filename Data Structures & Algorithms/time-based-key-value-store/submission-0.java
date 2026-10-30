class TimeMap {

    class TimeValue{
        Integer timeStamp;
        String value;

        public TimeValue(String value, int timeStamp){
            this.timeStamp = timeStamp;
            this.value = value;
        }
    }

    private Map<String , List<TimeValue>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new TimeValue(value,timestamp));
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";

        List<TimeValue> list = map.get(key);
        String result = "";

        int l = 0;
        int r = list.size() - 1;

        while(l <= r){
            int mid = (r + l) / 2;
            if(list.get(mid).timeStamp <= timestamp){
                result = list.get(mid).value;
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return result;
    }
}
