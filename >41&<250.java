class Main
    {
        public static void main(String arg[]){
        int sum=0;
        //for-loop for numbers 50-250
        for(int i=41;i<251;i++){
            // condition to check if number should be divided by 3 and not divided by 9 
            if(i%5==0){
                //adding values of array so that total sum can be calculated
                sum=sum+i;   
            }   
        }
        //final display output for the code 
        System.out.println(sum);
    }
}

/*

6195
*/
