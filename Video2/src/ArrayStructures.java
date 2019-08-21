public class ArrayStructures {

    private int[] theArray=new int[50];
    private int arraySize=10;
    public void generateRandomArray(){
        for(int i=0;i<arraySize;i++){
            theArray[i]=(int)(Math.random()*20);
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
    public void printHorizontalArray(){
        for (int i=0; i<arraySize; i++){
            System.out.print(i+" | ");
        }
        System.out.println();
        for(int i=0;i<arraySize;i++){
            System.out.print(theArray[i]+" | ");
        }
    }

    public String LinearSearchForValue(int value){
        boolean valueInArray=false;
        String indexWithValue="";
        for (int i=0; i<arraySize; i++) {
            if (theArray[i] == value) {
                valueInArray = true;
                indexWithValue += i + " " + value+"\n";
            }


        }
        return indexWithValue;
    }


   public void bubbleSort(){
        for (int i=arraySize-1; i>1; i--){ //Begynner på største verdi og jobber oss nedvoer
            for(int j=0; j<i; j++){
                if(theArray[j]>theArray[j+1]){
                    swapValues(j,j+1);
                }
            }
        }
       printHorizontalArray();
   }

   public void swapValues(int indexOne, int indexTwo){
        int temp=theArray[indexOne];
        theArray[indexOne]=theArray[indexTwo];
        theArray[indexTwo]=temp;
   }
   public void selectionSort(){
        for(int x=0; x<arraySize; x++){
            int minimum=x;
            for (int y=x; y<arraySize;y++){
                if(theArray[minimum]>theArray[y]){
                    minimum=y;
                }
            }
            swapValues(x,minimum);


        }
   }

   public void binarySearchForValue(int value){
        int lowIndex=0;
        int highIndex=arraySize-1;
        while(lowIndex<=highIndex){

            int middleIndex=(int)(highIndex+lowIndex)/2;
            if(theArray[middleIndex]<value){
                lowIndex=middleIndex+1;


            }
            else if(theArray[middleIndex]>value){
                highIndex=middleIndex-1;


            }
            else{
                System.out.print("\n Found a match for "+value+" at "+middleIndex);
              lowIndex=highIndex+1; // For å gå ut av loopen
            }

        }
   }
   public void insertionSort(){
        for(int i=1; i<arraySize; i++){
            int j=i;
            int toInsert=theArray[i];
            while((j>0) &&(theArray[j-1]>toInsert)){
                theArray[j]=theArray[j-1];
                j--;
            }
            theArray[j]=toInsert;
        }
   }


    public static void main(String[] args) {
        ArrayStructures newArray= new ArrayStructures();
        System.out.println("Generert array");
        newArray.generateRandomArray();
        newArray.printHorizontalArray();
        System.out.println();
        System.out.println("Bubble sort array");
        newArray.bubbleSort();
        System.out.println();
        System.out.println("Binary search for value");
        newArray.binarySearchForValue(10);
        System.out.println();

        ArrayStructures newArray2=new ArrayStructures();
        newArray2.generateRandomArray();
        newArray2.printHorizontalArray();
        System.out.println("Selection sort printing");
        newArray2.selectionSort();
        newArray2.printHorizontalArray();
        System.out.println();

        System.out.println("Array3");
        ArrayStructures newArray3= new ArrayStructures();
        newArray3.generateRandomArray();
        newArray3.printHorizontalArray();
        System.out.println("insertionSort");
        newArray3.insertionSort();
        newArray3.printHorizontalArray();






    }
}
