package sistema.clases;

public class PdfVO {

    /*Todo los atributos*/
    int iddieta;
    String nombrepdf;
    int idcoach;
    byte[] archivopdf;

    public PdfVO() {
    }

    /*Todo los codigos get*/

    public int getIddieta() {
        return iddieta;
    }

    public void setIddieta(int iddieta) {
        this.iddieta = iddieta;
    }

    public String getNombrepdf() {
        return nombrepdf;
    }

    public void setNombrepdf(String nombrepdf) {
        this.nombrepdf = nombrepdf;
    }

    public int getIdcoach() {
        return idcoach;
    }

    public void setIdcoach(int idcoach) {
        this.idcoach = idcoach;
    }

    public byte[] getArchivopdf() {
        return archivopdf;
    }

    public void setArchivopdf(byte[] archivopdf) {
        this.archivopdf = archivopdf;
    }
    

}
