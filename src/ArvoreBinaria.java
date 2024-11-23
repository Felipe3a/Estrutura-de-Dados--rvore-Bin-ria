public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }


    public void inserir(long id) {
        this.raiz = inserirRecursivo(this.raiz, id);
    }


    private No inserirRecursivo(No atual, long id) {
        if (atual == null) {
            return new No(id, null, null); 
        }


        if (id < atual.getId()) {
            atual = new No(atual.getId(), inserirRecursivo(atual.getEsq(), id), atual.getDir());
        } 

        else if (id > atual.getId()) {
            atual = new No(atual.getId(), atual.getEsq(), inserirRecursivo(atual.getDir(), id));
        }

        return atual;
    }







    



    public int contarEsquerdaFestiva() {
        return contarEsquerdaFestivaRecursivo(this.raiz);
    }

    private int contarEsquerdaFestivaRecursivo(No atual) {
        if (atual == null) {
            return 0;
        }
        
        int count = 0;


        if (atual.getEsq() != null) {
            count++; 
            
        }

        count += contarEsquerdaFestivaRecursivo(atual.getEsq());
        count += contarEsquerdaFestivaRecursivo(atual.getDir());

        return count;
    }










    public void imprimirComRecuo() {
        imprimirComRecuoRecursivo(this.raiz, 0);
    }

    private void imprimirComRecuoRecursivo(No atual, int nivel) {
        if (atual != null) {

            for (int i = 0; i < nivel; i++) {
                System.out.print("  ");
            }
            System.out.println(atual.getId());  

            imprimirComRecuoRecursivo(atual.getDir(), nivel + 1);
            imprimirComRecuoRecursivo(atual.getEsq(), nivel + 1);
        }
    }
}
