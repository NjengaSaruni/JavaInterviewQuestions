
public class References {
    public static void main(String[] args){
        Internal intern = new Internal(new String[]{
           "Peter" , "James"
        });
    }
}

class Internal {
    Internal(String[] strs){
        for(String str: strs){
            System.out.print(str);
        }
    }
}