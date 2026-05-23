package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    private Empresa empresa;

    @BeforeEach
    void setUp() {
        empresa = new Empresa();
    }

    @Test
    void deveRetornarDadosFuncionario() {
        empresa.contratar("Funcionario 1", "Desenvolvedor", "TI");
        empresa.contratar("Funcionario 2", "Desenvolvedor", "TI");
        empresa.contratar("Funcionario 3", "Desenvolvedor", "TI");
        empresa.contratar("Funcionario 4", "Arquiteto de Software", "TI");;

        List<String> saida = Arrays.asList(
                "Funcionario{nome='Funcionario 1', cargo='Desenvolvedor', departamento='TI'}",
                "Funcionario{nome='Funcionario 2', cargo='Desenvolvedor', departamento='TI'}",
                "Funcionario{nome='Funcionario 3', cargo='Desenvolvedor', departamento='TI'}",
                "Funcionario{nome='Funcionario 4', cargo='Arquiteto de Software', departamento='TI'}");

        assertEquals(saida, empresa.obterFuncionarios());
    }

    @Test
    void deveRetornarTotalCargos() {
        empresa.contratar("Funcionario 1", "Desenvolvedor", "TI");
        empresa.contratar("Funcionario 2", "Desenvolvedor", "TI");
        empresa.contratar("Funcionario 3", "Desenvolvedor", "TI");
        empresa.contratar("Funcionario 4", "Arquiteto de Software", "TI");;

        assertEquals(2, CargoFactory.getTotalCargos());
    }

}