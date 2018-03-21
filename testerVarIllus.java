import java.util.*;

public class testerVarIllus {
    private int tester1;
    private String tester2;
    private char tester3;

    int tester4;
    //Print tester4
    double tester5;
    boolean tester6;
    //asdfhalskjhf
    //gsdfsdfgintadfgjskfgbdouble
    //faljshfbvlaiulong
    short tester7;

        public static void main(String[] args){
            /**
             * A program to randomize the order of words in a sentence given by the user.
             * by Brianna Castrogiovanni, Andrew Ducharme, and Andrew Himebaugh
             * Prepare: Set up a Scanner and the Random object, an array to store the sentence words, two arrayLists to allow mutation of the words
             * array and a nums array to choose our randomized order, a String variable to store the sentence
             * typed by the user, counter variables for the for loops, and a tester variable for the sentinel loop.
             * Input: Prompt the user for a sentence using a S.O.P. and get the input with a Scanner.
             * Process: Break the sentence up using the split method, place the individual words in an array then transfer to an arrayList,
             * and give each word a random number using Random. Using for loops, sort each word by its random value from greatest to least. Then print each.
             * Output: Print the randomized sentence, see above.
             */

            Scanner keyboard=new Scanner(System.in);
            Random number = new Random();
            String[] wordsInput;
            ArrayList<Integer> nums = new ArrayList<Integer>();
            List<String> words = new ArrayList<String>();
            String sentence;
            int x;


            int temp;
            int counter;


            boolean tester;
            tester = true;

            do{

                //takes input from users
                System.out.println("Please type a sentence to be randomized.");
                sentence=keyboard.nextLine();


                //puts words into ArrayList
                wordsInput = sentence.split(" ");
                words.addAll(Arrays.asList(wordsInput));

                //Assigns random values to each word spot.
                for(x = 0; x<words.size(); x++){
                    nums.add(number.nextInt(100) +1);
                }

                temp = 0;
                counter = words.size();
                //for loop runs as many times as there are words
                for(int y = 0; y<counter;y++) {

                    temp = 0;
                    x=0;

                    //if this is the last case where there is only one value left, just print
                    if(temp == words.size()-1) {
                        System.out.print(words.get(temp));
                    }
                    //else, run a loop to determine the largest value
                    else {
                        do {
                            if(x == nums.size()-1 && nums.get(x)>nums.get(temp)) {
                                temp = x;
                            }

                            else if(nums.get(x)>=nums.get(temp) && nums.get(x)>nums.get(x+1)) {
                                temp = x;
                            }
                            x++;
                        }while(x<nums.size());

                        //print largest value, remove from both arrayLists
                        System.out.print(words.get(temp)+ " ");
                        words.remove(temp);
                        nums.remove(temp);
                    }
                }

                //clears arrays
                words.remove(temp);
                nums.remove(temp);

                //Sentinel loop exiter
                System.out.println("");
                System.out.println("Would you like to try again? Y/N?");
                if(keyboard.nextLine().equalsIgnoreCase("n")) {
                    tester=false;
                }
            }while(tester);


            keyboard.close();
        }
    }

