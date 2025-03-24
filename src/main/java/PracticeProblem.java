public class PracticeProblem {
        static void insertionSort(char[] characters){
                for(int i = 1; i < characters.length; i++){
                        int index = i-1;
                        char key = characters[i];
                        for(;index >= 0 && key < characters[index]; index--){
                                characters[index+1] = characters[index];
                        }
                        characters[index+1] = key;
                }
        }

        public static void main(String args[]){}
}
