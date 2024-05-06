package Week2.homeworks;

import java.sql.SQLOutput;

public class Frequency {
    public static void main(String[] args) {
        //Initialization of the array
        int [] arr1  = {12,12,12,5,5,8,8,3,3,4,4,4,4,9,9};

        //for each element in the array
        for(int i=0;i<arr1.length;i++){
            boolean isCounted=false;
            int count=0;
                //check the elements if they are equal-> isCounted=true
                for(int j=0;j<i;j++){
                    if (arr1[j] == arr1[i]) {
                        isCounted = true;
                        break;
                    }
                }
                //If the element is not counted before, check with the others
                if(isCounted!=true){
                    for (int j = 0; j < arr1.length; j++) {
                        if (arr1[j] == arr1[i]) {
                            //increment count if the same value is exist
                            count++;
                        }
                    }
                    System.out.println(arr1[i]+" occured "+count+" times.");
                }
            }
        }
    }

