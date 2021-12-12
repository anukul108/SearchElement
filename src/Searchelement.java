public class Searchelement {
    public boolean search(int arr[],int search_element){
        int flag=0;
        for (int i=0;i<5;i++){
            if(arr[i] == search_element) {
                flag=1;
            }

        }
        if(flag==1){
            System.out.println("true");
        }
        else if (flag==0){
            System.out.println("element not found");
        }
        flag=0;
        return true ;

    }

}

class main1{
    public static void main(String[] args) {
        int arr1[]=new  int[5];
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;
        Searchelement se=new Searchelement();
        se.search(arr1,90);

    }

}