public class Income {
    public static void main(String args[]){
        int income=6;
        float tax=0;
        if(income<5){
            tax=0;
            System.out.println("Tax: "+ tax);
        }
        else if(income>=5 && income <=10){
            tax=income*0.20f;
            System.out.println("Tax: "+ tax);
        }
        else{
            tax=income*0.30f;
            System.out.println("Tax: "+ tax);
        }
    }
}
