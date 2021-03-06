/*
TNPG: Benjamin (Jun Hong Wang, Brian Wang, Nicole Zhou)
APCS pd6
Lab06: Read/Review/Expand
2022-02-11
Time spent: 1 hrs
*/


import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();


  private static final String SPACE = " ";

  static{
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }


  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }

  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }
  }

  /**
   * returns a string containing all of the text in fileName (including punctuation),
   * with words separated by a single space
   */
  public static String textToString( String fileName )
  {
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));

      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();

    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }

  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment)
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }

  /**
   * Returns the ending punctuation of a string, or the empty string if there is none
   */
  public static String getPunctuation( String word )
  {
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }

    /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }

    return word;
  }

  /**
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }

  /**
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);

  }

  /**
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

  public static double totalSentiment(String fileName) {
    Double totalSent = 0.0;
    String review = textToString(fileName);
    if(review.length() < 1){
      return 0.0;
    }

    ArrayList<String> reviewArray = new ArrayList();

    while(review.indexOf(" ") != -1){
      String word = review.substring(0,review.indexOf(" "));
      word = removePunctuation(word);
      word = word.toLowerCase();

      reviewArray.add(word);
      review = review.substring(review.indexOf(" ") + 1);
      }
    review = removePunctuation(review);
    reviewArray.add(review);
    for(String testWord : reviewArray){
      totalSent += sentimentVal(testWord);
    }
    //System.out.println(reviewArray);
    return totalSent;
  }


  public static int starRating(String fileName) {
      double sent = totalSentiment(fileName);
      if(sent < -6){
        return 0;
      }
      else if(sent < -3){
        return 1;
      }
      else if(sent < 0){
        return 2;
      }
      else if(sent < 3){
        return 3;
      }
      else if(sent < 9){
        return 4;
      } else {
        return 5;
      }
  }

  //precon: Review is not 0 length
  public static String fakeReview(String fileName, boolean goodOrBad){
    String review = textToString(fileName);
    while(review.indexOf("*") != -1){
      String beforeAdj = review.substring(0, review.indexOf("*"));
      String afterAdj = review.substring(review.indexOf(" ", review.indexOf("*")));
      beforeAdj = beforeAdj.strip();
      afterAdj = afterAdj.strip();
      ArrayList<String> wordsArray = new ArrayList();
      if(goodOrBad == false){
        String descWords = textToString("negativeAdjectives.txt");
        while(descWords.indexOf("*") != -1){
          wordsArray.add(descWords.substring(0, descWords.indexOf("*")));
          descWords = descWords.substring(descWords.indexOf("*") + 1);
        }
        wordsArray.add(descWords);
      }
      else{
        String descWords = textToString("positiveAdjectives.txt");
        while(descWords.indexOf("*") != -1){
          wordsArray.add(descWords.substring(0, descWords.indexOf("*")));
          descWords = descWords.substring(descWords.indexOf("*") + 1);
        }
        wordsArray.add(descWords);
      }
      review = beforeAdj + " " + wordsArray.get((int)(Math.random() * wordsArray.size())) + " " + afterAdj;
    }
    return review;
  }

  public static void main(String[] args) {
    System.out.println(sentimentVal("happily"));
    System.out.println(sentimentVal("terrible"));
    System.out.println(sentimentVal("cold"));
    System.out.println(sentimentVal("great"));
    System.out.println(sentimentVal("lazy"));
    System.out.println(sentimentVal("horrific"));

    System.out.println(totalSentiment("SimpleReview.txt"));
    System.out.println(starRating("SimpleReview.txt"));

    System.out.println(totalSentiment("GoodReview.txt"));
    System.out.println(starRating("GoodReview.txt"));

    System.out.println(fakeReview("SimpleReview.txt", false));
  }
}
