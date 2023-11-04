package appdemusica.modelos;

public class MinhasPreferidas {

    public void inclui(Audio a){
        if(a.getClassificacao() >=9){
          System.out.println(a.getTitulo() + " é considerado um sucesso absoluto e preferido por todos!");  
        }
        else{
            System.out.println(a.getTitulo() + " também é um dos que todo mundo está curtindo");
        }
    }
}
