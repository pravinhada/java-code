public class CompositeDemo {

    public static void main(String[] args) {
        Directory music = new Directory("MUSIC");
        Directory scorpions = new Directory("SCORPIONS");
        Directory dio = new Directory("DIO");

        File track1 = new File("Don't wary, be happy.mp3", 2.30f);
        File track2 = new File("track2.mp3", 3.33f);
        File track3 = new File("wind of change.mp3", 2.45f);
        File track4 = new File("Big city night.mq3", 3.10f);
        File track5 = new File("Rainbow in the dark.mp3", 2.55f);

        music.add(track1);
        music.add(scorpions);
        music.add(track2);
        music.add(track3);
        music.add(track4);
        music.add(dio);
        dio.add(track5);
        music.ls();
    }
}
