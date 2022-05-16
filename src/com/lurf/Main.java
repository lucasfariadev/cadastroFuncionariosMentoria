package com.lurf;

import com.lurf.models.Endereco;
import com.lurf.models.Gerente;
import com.lurf.models.OperadorDeCaixa;
import com.lurf.models.Vendedor;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua endereço", "casa hokage", "Konoha");

        System.out.println("------");

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Naruto Uzumaki");
        vendedor.setDocumento("153.258.962-88");
        vendedor.setValorSalario(2010d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);

        System.out.println(vendedor);

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Sasuke Uchiha", "123-456-789-00", 1500d, endereco);

        System.out.println(operadorDeCaixa);

        Gerente gerente = new Gerente();
        gerente.setNome("Boruto Uzumaki");
        gerente.setDocumento("234-546-978-00");
        gerente.setEndereco(endereco);
        gerente.setHorastrabalhadas(20);
        gerente.setValorHora(130d);

        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);

    }


}
