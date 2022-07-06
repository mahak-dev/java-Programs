class reversedigitrecur{
    static int rev_num = 0;
    static int base_pos = 1;
    static int reversedigitrecur(int num)
{
    if(num>0){
        reversedigitrecur(num/10);
        rev_num+= (num%10)*base_pos;
        base_pos*=10;
    }
    return rev_num;
}
public static void main(String args[]) {
    int num = 4562;
    System.out.println(reversedigitrecur(num));
    
}
}