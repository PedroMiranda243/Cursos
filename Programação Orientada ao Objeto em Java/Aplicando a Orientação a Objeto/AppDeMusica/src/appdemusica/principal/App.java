package appdemusica.principal;

import appdemusica.modelos.MinhasPreferidas;
import appdemusica.modelos.Musica;
import appdemusica.modelos.Podcast;

public class App {
    public static void main(String[] args) throws Exception {
        Musica m1 = new Musica();
        m1.setTitulo("Time Left");
        m1.setArtista("ZUTOMAYO");
        
        for (int i = 0; i < 1000; i++) {
            m1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            m1.curte();
        }

        Podcast p1 = new Podcast();
        p1.setTitulo("BolhaDev");
        p1.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            p1.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            p1.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
       preferidas.inclui(p1);
       preferidas.inclui(m1);

         
    }
}
