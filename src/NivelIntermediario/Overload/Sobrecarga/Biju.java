package NivelIntermediario.Overload.Sobrecarga;

public enum Biju {
    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yugito", 2),
    ISOBU("Isobu", "Yagura", 3),
    SON_GOKU("Son Goku", "Roshi", 4),
    KOKUO("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fuu", 7),
    GYUKI("Gyuki", "Killer bee", 8),
    Kurama("Kurama", "Naruto", 9);

    private String nomeBiju;
    private String Jinchuriki;
    private int numeroDeCaldas;

    Biju() {
    }

    Biju(String nomeBiju, String jinchuriki, int numeroDeCaldas) {
        this.nomeBiju = nomeBiju;
        Jinchuriki = jinchuriki;
        this.numeroDeCaldas = numeroDeCaldas;
    }

    public String getNomeBiju() {
        return nomeBiju;
    }

    public void setNomeBiju(String nomeBiju) {
        this.nomeBiju = nomeBiju;
    }

    public String getJinchuriki() {
        return Jinchuriki;
    }

    public void setJinchuriki(String jinchuriki) {
        Jinchuriki = jinchuriki;
    }

    public int getNumeroDeCaldas() {
        return numeroDeCaldas;
    }

    public void setNumeroDeCaldas(int numeroDeCaldas) {
        this.numeroDeCaldas = numeroDeCaldas;
    }
}
