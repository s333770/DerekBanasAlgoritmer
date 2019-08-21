public class ArrayStructures {


    private int[] theArray=new int[50];
    private int arraySize=10;
    public void generateRandomArray(){
        for(int i=0;i<arraySize;i++){
            theArray[i]=(int)(Math.random()*10);
        }
    }


    public void printArray(){
        System.out.println("----------");
        for(int i=0; i<arraySize; i++){
            System.out.print("| "+i+" ");
            System.out.println("| "+theArray[i]+" |");
            System.out.println("----------");

        }
    }

    public int getArrayIndexValue(int index){
        if(index<arraySize){
            return theArray[index];
        }

        return 0;
    }
    public boolean doesArrayConttainValue(int searchValue){
        boolean arrayValue=false;
        for(int i=0; i<arraySize; i++){
            if(theArray[i]==searchValue){
                arrayValue=true;
            }
        }
        return arrayValue;
    }
    public String linearSearch(int value) {
        boolean valueInArray = false;
        String indexOfValue = "";
        System.out.println("The value were found in the following: ");
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                valueInArray = true;
                System.out.println(i + " ");
                indexOfValue += i + " ";


            }
        }
        return indexOfValue;
      /*  if(indexOfValue){
            //Ga meg på siste oppgave
        }
    }
    */
    }
    public int finnStorsteTall(){
        int maksVerdi=theArray[0];
        for(int i=0; i<arraySize; i++){
            if(theArray[i]>maksVerdi){
                maksVerdi=theArray[i];
            }

        }
        return maksVerdi;
    }

    public void sortering(){
        for(int i=1; i<arraySize; i++){
            int j=i;
            int toInsert=theArray[i];
            while((j>0)&&(theArray[j-1]>toInsert)){
                theArray[j]=theArray[j-1];
                j--;

            }




        }
    }




    public static void main(String[] args) {
        ArrayStructures newArray = new ArrayStructures();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println(newArray.getArrayIndexValue(2));
        System.out.println(newArray.doesArrayConttainValue(10));
        System.out.println(newArray.finnStorsteTall());
        newArray.sortering();
        newArray.printArray();

    }
}
