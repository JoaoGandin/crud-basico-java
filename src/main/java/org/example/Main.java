package org.example;

import org.example.model.Produto;
import org.example.service.ProdutoService;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ProdutoService service = new ProdutoService();

        Produto p1 = new Produto(1, "mouse", BigDecimal.valueOf(10.99));
        Produto p2 = new Produto(2, "teclado", BigDecimal.valueOf(20.99));
        Produto p3 = new Produto(3, "abacate", BigDecimal.valueOf(10.99));

        service.criarProduto(p1);
        service.criarProduto(p2);
        service.criarProduto(p3);

        service.atualizarPrecoProduto(3, BigDecimal.valueOf(1.99));
        service.deletarProduto(3);
        service.deletarProduto(22);

        for(Produto p : service.listarProduto()){
            System.out.println(p);
        }

    }
}
