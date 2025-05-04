public class Main{
    public static void main(String[] args)
    {
        WordMatch w = new WordMatch("mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("mississippi"));
        WordMatch g = new WordMatch("aaaabb");
        System.out.println(g.scoreGuess("a"));
        System.out.println(g.scoreGuess("aa"));
        System.out.println(g.scoreGuess("aaa"));
        System.out.println(g.scoreGuess("aabb"));
        System.out.println(g.scoreGuess("c"));
        WordMatch game = new WordMatch("concatenation");
        System.out.println(game.scoreGuess("ten"));
        System.out.println(game.scoreGuess ("nation"));
        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.scoreGuess("con" ));
        System.out.println(game.scoreGuess("cat"));
        System.out.println(game.findBetterGuess("con", "cat"));
    }
}
