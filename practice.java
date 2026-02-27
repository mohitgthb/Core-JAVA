public class practice {
    
    //Print numbers with even digits:
    public int EvenDigitNo(int arr[]){

        for(int i=0; i< arr.length; i++){

            String str = String.valueOf(arr[i]);

            if(str.length() % 2 == 0) {
                System.out.println(arr[i]);
                return arr[i];
            }
        }
        return -1;
    }

    //check, is this special character ?
    public static boolean isSpecial(char c){
        return !Character.isLetterOrDigit(c);  //special if not letter or digit
    }

    //Reverse string but keep special characters position same
    public String reverseKeepSpecial(String s){

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right){

            if(isSpecial(arr[left])){
                left++;
            } else if(isSpecial(arr[right])){
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        System.out.println(new String(arr));
        return new String(arr);
    }

    public static void main(String[] args){
        
        int arr[] = {1, 123, 1234, 567, 22};
        String s = "a.b$c";

        practice obj = new practice();

       // obj.EvenDigitNo(arr);
        obj.reverseKeepSpecial(s);

        
    }
}
