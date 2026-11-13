package relacionamentoentreclasses;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
         l[0] = new Lutador("Pretty Boy" , "Inglaterra", 31, 1.75f, 68.0f, 11, 2, 1);
         l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
         l[2] = new Lutador("SnapShadow", "EUA", 25, 1.80f, 75.0f, 8, 1, 4);
         l[3] = new Lutador("Dead Code", "Japão", 27, 1.72f, 65.5f, 10, 2, 1);
         l[4] = new Lutador("Ninja", "Coreia do Sul", 22, 1.70f, 60.0f, 12, 4, 0);
         l[5] = new Lutador("CodeBreaker", "Alemanha", 26, 1.85f, 80.0f, 9, 2, 3);
         
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0], l[5]);
        UFC01.lutar();

    }
}
