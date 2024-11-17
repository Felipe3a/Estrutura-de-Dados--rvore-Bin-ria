public class Main {
    public static void main(String[] args) {
       
        ArvoreBinaria arvore = new ArvoreBinaria();

    
      

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(20);
        arvore.inserir(1);
        arvore.inserir(9);
        arvore.inserir(8);
        arvore.inserir(6);




        int countEsquerdaFestiva = arvore.contarEsquerdaFestiva();
        System.out.println("\nNumero de nos da esquerda festiva: " + countEsquerdaFestiva);
        System.out.println("\nArvore com recuos:");
        arvore.imprimirComRecuo();

       
    }
}
