public class No {
    private long id;
    private No esq,dir;
    public No(long id, No esq, No dir){
    this.id = id; this.esq = esq; this.dir = dir;
    }
    public long getId() { return this.id; }
    public No getEsq() { return esq; }
    public No getDir() { return dir; }
}