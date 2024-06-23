import com.br.raijheckinny.dao.IProdutoDAO;
import com.br.raijheckinny.dao.ProdutoDAO;
import com.br.raijheckinny.domain.Produto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ProdutoTeste {
    IProdutoDAO dao;

    public ProdutoTeste(){
        dao = new ProdutoDAO();
    }

    @Test
    public void CadastroDeProduto(){
        Produto produto = new Produto();
        produto.setNome("Mesa");
        produto.setCodigo("A01");

        produto = dao.cadastrar(produto);
        Assert.assertNotNull(produto);
    }
}
