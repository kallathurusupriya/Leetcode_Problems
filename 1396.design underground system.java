class UndergroundSystem {
    HashMap<Integer,String[]> in=new HashMap<>();
    HashMap<String,int[]> out=new HashMap<>();

    public UndergroundSystem() {}

    public void checkIn(int id,String s,int t){ in.put(id,new String[]{s,t+""}); }

    public void checkOut(int id,String s,int t){
        String[] a=in.remove(id);
        int[] b=out.getOrDefault(a[0]+"-"+s,new int[2]);
        b[0]+=t-Integer.parseInt(a[1]); b[1]++;
        out.put(a[0]+"-"+s,b);
    }

    public double getAverageTime(String s1,String s2){
        int[] a=out.get(s1+"-"+s2);
        return (double)a[0]/a[1];
    }
}
