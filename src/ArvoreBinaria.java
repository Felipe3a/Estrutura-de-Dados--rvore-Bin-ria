public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // Método para inserir um novo nó na árvore
    public void inserir(long id) {
        this.raiz = inserirRecursivo(this.raiz, id);
    }

    // Método recursivo para inserir um novo nó na árvore
    private No inserirRecursivo(No atual, long id) {
        if (atual == null) {
            return new No(id, null, null);  // Cria um novo nó com filhos null
        }

        // Se o id a ser inserido for menor que o id do nó atual, insere na subárvore esquerda
        if (id < atual.getId()) {
            atual = new No(atual.getId(), inserirRecursivo(atual.getEsq(), id), atual.getDir());
        } 
        // Se o id a ser inserido for maior que o id do nó atual, insere na subárvore direita
        else if (id > atual.getId()) {
            atual = new No(atual.getId(), atual.getEsq(), inserirRecursivo(atual.getDir(), id));
        }

        return atual;
    }

    // Método para contar os nós da esquerda festiva
    public int contarEsquerdaFestiva() {
        return contarEsquerdaFestivaRecursivo(this.raiz);
    }

    private int contarEsquerdaFestivaRecursivo(No atual) {
        if (atual == null) {
            return 0;
        }
        
        int count = 0;

        // Verifica se o nó atual tem um filho à esquerda
        if (atual.getEsq() != null) {
            count++;  // Contabiliza o nó como parte da esquerda festiva
        }

        // Chama recursivamente nas subárvores esquerda e direita
        count += contarEsquerdaFestivaRecursivo(atual.getEsq());
        count += contarEsquerdaFestivaRecursivo(atual.getDir());

        return count;
    }

    // Método para imprimir os nós da árvore com recuos
    public void imprimirComRecuo() {
        imprimirComRecuoRecursivo(this.raiz, 0);
    }

    private void imprimirComRecuoRecursivo(No atual, int nivel) {
        if (atual != null) {
            // Imprime recuos para os níveis da árvore
            for (int i = 0; i < nivel; i++) {
                System.out.print("  ");
            }
            System.out.println(atual.getId());  // Imprime o id do nó

            // Chama recursivamente para o nó da direita e depois para o nó da esquerda
            imprimirComRecuoRecursivo(atual.getDir(), nivel + 1);
            imprimirComRecuoRecursivo(atual.getEsq(), nivel + 1);
        }
    }
}
