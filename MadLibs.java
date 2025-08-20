public class MadLibs {
  /*
   * This program generates a mad libbed story.
   * Author: JT
   * Date: 8/19/2025
   */
  public static void main(String[] args) {
    String name1 = "Nick";
    String adjective1 = "silly";
    String adjective2 = "freaky";
    String noun1 = "cranky parents";
    String noun2 = "Labubus";
    String verb1 = "dance";
    String noun3 = "song";
    String noun4 = "K-pop fans";
    String adjective3 = "angry";
    String name2 = "James";
    String place1 = "Los Angeles";
    String noun5 = "hotdogs";
    int number = 2067;
    String noun6 = "clanker";
    // The template for the story
    String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2
        + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to "
        + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3
        + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped "
        + name1 + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number
        + ", in a world where " + noun6 + "s ruled the world.";
    System.out.println(story);
  }
}
