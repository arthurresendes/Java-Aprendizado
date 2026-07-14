package br.com.arthur;

public class ProdutoImportadora {
    private String nameProd;
    private Double price;
    private Integer qtd;
    private String nameImp;

    public ProdutoImportadora() {
    }

    public ProdutoImportadora(String nameProd, Double price, Integer qtd, String nameImp){
        this.nameProd = nameProd;
        this.price = price;
        this.qtd = qtd;
        this.nameImp = nameImp;
    }

    public String getNameProd() {
        return nameProd;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQtd() {
        return qtd;
    }

    public String getNameImp() {
        return nameImp;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public void setNameImp(String nameImp) {
        this.nameImp = nameImp;
    }

    @Override
    public String toString() {
        return "ProdutoImportadora: " +
                "Nome do produto='" + nameProd + '\'' +
                ", Preço=" + price +
                ", Quantidade=" + qtd +
                ", Empresa='" + nameImp + '\'';
    }
}
