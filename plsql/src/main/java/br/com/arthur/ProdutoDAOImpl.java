package br.com.arthur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOImpl implements Methods {

    @Override
    public List<ProdutoImportadora> listarProdutos() {

        List<ProdutoImportadora> lista = new ArrayList<>();

        String sql = "SELECT * FROM vw_products_imports";

        try (
                Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()
        ) {

            while (rs.next()) {

                ProdutoImportadora produto = new ProdutoImportadora();

                produto.setNameProd(rs.getString("name"));
                produto.setPrice(rs.getDouble("preco"));
                produto.setQtd(rs.getInt("quantidade"));
                produto.setNameImp(rs.getString("Nome_importadora"));

                lista.add(produto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public Double calcularDesconto(Double preco) {

        String sql = "{ ? = call calcular_desconto(?) }";

        try (
                Connection conn = ConnectionFactory.getConnection();
                CallableStatement cs = conn.prepareCall(sql)
        ) {

            cs.registerOutParameter(1, Types.DECIMAL);
            cs.setDouble(2, preco);

            cs.execute();

            return cs.getDouble(1);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void cadastrarImportadora(String nome) {

        String sql = "{ call cadastrar_importadora(?) }";

        try (
                Connection conn = ConnectionFactory.getConnection();
                CallableStatement cs = conn.prepareCall(sql)
        ) {

            cs.setString(1, nome);

            cs.execute();

            System.out.println("Importadora cadastrada com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void cadastrarProd(String nome, Double price, Integer qtd,Boolean disponivel ,Integer id_importadora){
        String sql = "{ call cadastrar_prod(?,?,?,?,?) }";

        try (
                Connection conn = ConnectionFactory.getConnection();
                CallableStatement cs = conn.prepareCall(sql)
        ) {

            cs.setString(1, nome);
            cs.setDouble(2, price);
            cs.setInt(3, qtd);
            cs.setBoolean(4, disponivel);
            cs.setInt(5, id_importadora);

            cs.execute();

            System.out.println("Produto cadastrado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}