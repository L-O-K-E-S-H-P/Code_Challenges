class Solution {
    public String capitalizeTitle(String title) {
        title=title.toLowerCase();

        String words[]=title.split(" ");

        StringBuilder db = new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            if(words[i].length()<3)
            {
                db.append(words[i]+" ");
            }
            else
            {
                char ch=words[i].charAt(0);
                ch=Character.toUpperCase(ch);
                String new_word=ch+words[i].substring(1);
                db.append(new_word+" ");
            }
        }
        String result=db.toString();
        return result.trim();
        
    }
}
