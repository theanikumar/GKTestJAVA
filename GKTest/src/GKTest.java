/*
 * Author: Aniket Kumar
 * Language Used: JAVA
 * Date of Creation: 23/10/2021
 * Website (URL): https://aniket.cu.ma/
 * Email: hello@aniket.cu.ma
 */

//Importing all the classes here.........

import java.util.*;
import java.util.Random;

public class GKTest {

	public static void main(String[] args) {
		
//Declaring all the variables here............
		int i;
		int ans;
		int correct =0;
		int point =0;
		int skipped = 0;
		int wrong = 0;
		int attempt;
		
		
		
//For Loop start here............
		
		for(i = 0; i <= 10; i++) {
				
			
//Generating a unique random number every time...........
			 Random randomNumGenerator = new Random();
			 
	              int randomInt = randomNumGenerator.nextInt(20);
	              
	       
//Switch cases start here for switching questions
	              
	              switch(randomInt) {
	              	
	              case 1:
	            	  System.out.println("Which crop is sown on the largest area in India?");
	            	  System.out.println("1. Rice");
	            	  System.out.println("2. Wheat");
	            	  System.out.println("3. Sugarcane");
	            	  System.out.println("4. Maize");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc1 = new Scanner(System.in);
	            	  ans = sc1.nextInt();
	            	  
	            	  if(ans == 1) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  break;
	            	  
	            	  //End of 1st question..........
	            	  
	            	  
	            	  
	            	  
	              case 2:
	            	  System.out.println("Eritrea, which became the 182nd member of the United Nations in 1993, is on the continent of");
	            	  System.out.println("1. Asia");
	            	  System.out.println("2. Africa");
	            	  System.out.println("3. Europe");
	            	  System.out.println("4. Australia");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc2 = new Scanner(System.in);
	            	  ans = sc2.nextInt();
	            	  
	            	  if(ans == 2) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  break;
	            	  
	            	  //End of 2st question..........
	            	  
	            	  
	            	  
	              case 3:
	            	  System.out.println("Which of the following personalities gave ‘The Laws of Heredity’?");
	            	  System.out.println("1. Robert Hook");
	            	  System.out.println("2. G.J. Mendel");
	            	  System.out.println("3. Charles Darwin");
	            	  System.out.println("4. William Harvey");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc3 = new Scanner(System.in);
	            	  ans = sc3.nextInt();
	            	  
	            	  if(ans == 2) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 3rd question..........
	            	  
	            	  
	            	  
	              case 4:
	            	  System.out.println("Garampani sanctuary is located at");
	            	  System.out.println("1. Junagarh, Gujarat");
	            	  System.out.println("2. Gangtok, Sikkim");
	            	  System.out.println("3. Kohima, Nagaland");
	            	  System.out.println("4. Diphu, Assam");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc4 = new Scanner(System.in);
	            	  ans = sc4.nextInt();
	            	  
	            	  if(ans == 4) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 4th question..........
	            	  
	            	  
	            	  
	              case 5:
	            	  System.out.println("Who is known as “The Saint of Gutters”?");
	            	  System.out.println("1. Baba Amte");
	            	  System.out.println("2. Mother Teresa");
	            	  System.out.println("3. Anna Hazare");
	            	  System.out.println("4. None of these");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc5 = new Scanner(System.in);
	            	  ans = sc5.nextInt();
	            	  
	            	  if(ans == 2) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 5th question..........
	            	  
	            	  
	            	  
	              case 6:
	            	  System.out.println("For which of the following disciplines is Nobel Prize awarded?");
	            	  System.out.println("1. Physics and Chemistry");
	            	  System.out.println("2. Physiology or Medicine");
	            	  System.out.println("3. Literature, Peace and Economics");
	            	  System.out.println("4. All of the above");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc6 = new Scanner(System.in);
	            	  ans = sc6.nextInt();
	            	  
	            	  if(ans == 4) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 6th question..........
	            	  
	            	  
	            	  
	              case 7:
	            	  System.out.println("Grand Central Terminal, Park Avenue, New York is the world’s");
	            	  System.out.println("1. Largest railway station");
	            	  System.out.println("2. Highest railway station");
	            	  System.out.println("3. Longest railway station");
	            	  System.out.println("4. None of the above");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc7 = new Scanner(System.in);
	            	  ans = sc7.nextInt();
	            	  
	            	  if(ans == 1) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 7th question..........
	            	  
	            	  
	              case 8:
	            	  System.out.println("Name the person who was also known as Deshbandhu.");
	            	  System.out.println("1. S. Radhakrishnan");
	            	  System.out.println("2. G.K. Gokhale");
	            	  System.out.println("3. Chittaranjan Das");
	            	  System.out.println("4. Madan Mohan Malviya");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc8 = new Scanner(System.in);
	            	  ans = sc8.nextInt();
	            	  
	            	  if(ans == 3) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 8th question..........
	            	  
	            	  
	              case 9:
	            	  System.out.println("FFC stands for");
	            	  System.out.println("1. Foreign Finance Corporation");
	            	  System.out.println("2. Film Finance Corporation");
	            	  System.out.println("3. Federation of Football Council");
	            	  System.out.println("4. None of the above");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc9 = new Scanner(System.in);
	            	  ans = sc9.nextInt();
	            	  
	            	  if(ans == 2) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 9th question..........
	            	  
	            	  
	              case 10:
	            	  System.out.println("Which of the following national parks is not listed in a UNESCO World Heritage site?");
	            	  System.out.println("1. Kaziranga");
	            	  System.out.println("2. Keoladeo");
	            	  System.out.println("3. Sundarbans");
	            	  System.out.println("4. Kanha");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc10 = new Scanner(System.in);
	            	  ans = sc10.nextInt();
	            	  
	            	  if(ans == 4) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 10th question..........
	            	  
	            	  
	            	  
	              case 11:
	            	  System.out.println("The capital of Uttarakhand is….");
	            	  System.out.println("1. Masoorie");
	            	  System.out.println("2. Dehra Dun");
	            	  System.out.println("3. Nainital");
	            	  System.out.println("4. None of these");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc11 = new Scanner(System.in);
	            	  ans = sc11.nextInt();
	            	  
	            	  if(ans == 2) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 11th question..........
	            	  
	            	  
	              case 12:
	            	  System.out.println("Fastest shorthand writer was");
	            	  System.out.println("1. Dr. G. (D) Bist");
	            	  System.out.println("2. J.R.(D) Tata");
	            	  System.out.println("3. J.M. Tagore");
	            	  System.out.println("4. Khudada Khan");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc12 = new Scanner(System.in);
	            	  ans = sc12.nextInt();
	            	  
	            	  if(ans == 1) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 12th question..........
	            	  
	            	  
	            	  
	              case 13:
	            	  System.out.println("In which state has the largest area?");
	            	  System.out.println("1. Maharashtra");
	            	  System.out.println("2. Madhya Pradesh");
	            	  System.out.println("3. Uttar Pradesh");
	            	  System.out.println("4. Rajasthan");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc13 = new Scanner(System.in);
	            	  ans = sc13.nextInt();
	            	  
	            	  if(ans == 4) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 13th question..........
	            	  
	            	  
	              case 14:
	            	  System.out.println("Geet Govind is a famous creation of ……");
	            	  System.out.println("1. Bana Bhatt");
	            	  System.out.println("2. Kalidas");
	            	  System.out.println("3. Jayadev");
	            	  System.out.println("4. Bharat Muni");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc14 = new Scanner(System.in);
	            	  ans = sc14.nextInt();
	            	  
	            	  if(ans == 3) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 13th question..........
	            	  
	              case 15:
	            	  System.out.println("Galileo was an Italian astronomer who");
	            	  System.out.println("1. developed the telescope");
	            	  System.out.println("2. discovered four satellites of Jupiter");
	            	  System.out.println("3. discovered that the movement of pendulum produces a regular time measurement");
	            	  System.out.println("4. All of the above");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc15 = new Scanner(System.in);
	            	  ans = sc15.nextInt();
	            	  
	            	  if(ans == 4) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 15th question..........
	            	  
	            	  
	              case 16:
	            	  System.out.println("The Maratha and The Kesri were the two main newspapers which were started by the following people?");
	            	  System.out.println("1. Lala Lajpat Rai");
	            	  System.out.println("2. Gopal Krishna Gokhale");
	            	  System.out.println("3. Bal Gangadhar Tilak");
	            	  System.out.println("4. Madan Mohan Malviya");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc16 = new Scanner(System.in);
	            	  ans = sc16.nextInt();
	            	  
	            	  if(ans == 3) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 16th question..........
	            	  
	              case 17:
	            	  System.out.println("When did the World Trade Organization come into existence?");
	            	  System.out.println("1. 1992");
	            	  System.out.println("2. 1993");
	            	  System.out.println("3. 1994");
	            	  System.out.println("4. 1995");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc17 = new Scanner(System.in);
	            	  ans = sc17.nextInt();
	            	  
	            	  if(ans == 4) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 17th question..........
	            	  
	            	  
	            	  
	              case 18:
	            	  System.out.println("Exposure to sunlight helps a person to improve his health because");
	            	  System.out.println("1. the infrared light kills bacteria in the body");
	            	  System.out.println("2. resistance power increases");
	            	  System.out.println("3. the pigment cells in the skin get stimulated and produce a healthy tan");
	            	  System.out.println("4. the ultraviolet rays convert skin oil into Vitamin D");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc18 = new Scanner(System.in);
	            	  ans = sc18.nextInt();
	            	  
	            	  if(ans == 4) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 18th question..........
	            	  
	            	  
	            	  
	              case 19:
	            	  System.out.println("The Lucknow session of Indian National Congress that took place in 1916 was presided by__?");
	            	  System.out.println("1. Rashbihari Ghosh");
	            	  System.out.println("2. Ambika Charan Majumdar");
	            	  System.out.println("3. Bhupendra Nath Bose");
	            	  System.out.println("4. None of the above");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc19 = new Scanner(System.in);
	            	  ans = sc19.nextInt();
	            	  
	            	  if(ans == 2) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 19th question..........
	            	  
	              case 20:
	            	  System.out.println("In which year did the Cabinet Mission arrived in India?");
	            	  System.out.println("1. 1942");
	            	  System.out.println("2. 1943");
	            	  System.out.println("3. 1945");
	            	  System.out.println("4. 1946");
	            	  System.out.println("5. Skip This Question");
	            	  
	            	  Scanner sc20 = new Scanner(System.in);
	            	  ans = sc20.nextInt();
	            	  
	            	  if(ans == 4) {
	            		System.out.println("Well Done! Your Answer is Correct");
	            		correct++;
	            		point = point + 4;
	            	  }
	            	  
	            	  else if(ans == 5){
	            		  System.out.println("You Skipped This Question");
	            		  skipped++;
	            	  }
	            	  
	            	  else {
	            		System.out.println("Sorry! Your answer is wrong");
	            		wrong++;
	            		point = point - 1;
	            	  }
	            	  
	            	  break;
	            	  //End of 20th question..........
	            	  
	            	  
	            	  
	              }//End of switch cases
	              
	              

		} //End of for loop
		
		
// All the Major calculations will be done here.....
	     attempt = correct + wrong;
	              
	              
//Final Result Output
	     
	     System.out.println("Your Final Result");
	     System.out.println("Attempt: " + attempt);
	     System.out.println("Correct: " + correct);
	     System.out.println("Wrong: " + wrong);
	     System.out.println("Skip: " + skipped);
	     System.out.println("Score: " + point);
	  
			
	} //End of main function
}//End of the program
