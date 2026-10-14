class Solution {
    public String frequencySort(String s) {
       
       Map <Character,Integer> map=new HashMap<>();

        
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
       } 

       List <Character> list=new ArrayList<>(map.keySet());

        Collections.sort(list,(a,b)-> map.get(b)-map.get(a) );


        StringBuilder apache = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            char ch = list.get(i);

            for (int j = 0; j < map.get(ch); j++) {
                apache.append(ch);
            }
        }


        return apache.toString();
    }


}