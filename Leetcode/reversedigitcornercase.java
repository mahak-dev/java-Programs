class reversedigitcornercase {
    static int reversedigitcornercase(int num)
    {
        StringBuffer string = new StringBuffer(String.valueOf(num));
       
        string.reverse();

        num = Integer.parseInt(String.valueOf(string));

        return num;
    }
    public static void main(String args[]){
        int num = 004520;
        System.out.println("Reverse no. of " + reversedigitcornercase(num));
    }
}
