package Entidades;
public class Animes 
{
   private int Id;
   private String Animes;
   private int Temporadas;
   private String Estado;

    public Animes() {
    }

    public Animes(int Id, String Animes, int Temporadas, String Estado) {
        this.Id = Id;
        this.Animes = Animes;
        this.Temporadas = Temporadas;
        this.Estado = Estado;
    }

    public int getId() {
        return Id;
    }

    public String getAnimes() {
        return Animes;
    }

    public int getTemporadas() {
        return Temporadas;
    }

    public String getEstado() {
        return Estado;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setAnimes(String Animes) {
        this.Animes = Animes;
    }

    public void setTemporadas(int Temporadas) {
        this.Temporadas = Temporadas;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
   @Override
    public String toString()
    {
        return "Animes{"+"Id="+Id+",Animes="+Animes+",Temporadas="+Temporadas+",Estado="+Estado+"]";
    }
}
