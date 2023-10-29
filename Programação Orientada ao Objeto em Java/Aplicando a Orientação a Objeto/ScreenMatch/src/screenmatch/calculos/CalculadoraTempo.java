package screenmatch.calculos;

import screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui(Titulo t){
        tempoTotal+= t.getDuracaoEmMinutos();

    }
}
