package br.com.fiap.main;

import org.apache.http.client.ClientProtocolException;
import java.io.IOException;
import java.util.Scanner;
import br.com.fiap.model.ConsultaCNPJ;
import br.com.fiap.service.CNPJService;

public class Teste {

    public static void main(String[] args) throws ClientProtocolException, IOException {
        CNPJService cnpjService = new CNPJService();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CNPJ que deseja consultar: ");
        String cnpj = scanner.nextLine();
        
        ConsultaCNPJ consultaCNPJ = cnpjService.getConsultaCNPJ(cnpj);
        
        if (consultaCNPJ != null) {
            System.out.println("CNPJ: " + consultaCNPJ.getCnpj());
            System.out.println("Razão Social: " + consultaCNPJ.getRazao_social());
            System.out.println("Nome Fantasia: " + consultaCNPJ.getNome_fantasia());
            System.out.println("Situação Cadastral: " + consultaCNPJ.getDescricao_situacao_cadastral());
            System.out.println("Tipo de Logradouro: " + consultaCNPJ.getDescricao_tipo_de_logradouro());
            System.out.println("Logradouro: " + consultaCNPJ.getLogradouro());
            System.out.println("Número: " + consultaCNPJ.getNumero());
            System.out.println("Complemento: " + consultaCNPJ.getComplemento());
            System.out.println("Bairro: " + consultaCNPJ.getBairro());
            System.out.println("CEP: " + consultaCNPJ.getCep());
            System.out.println("UF: " + consultaCNPJ.getUf());
            System.out.println("Município: " + consultaCNPJ.getMunicipio());
            System.out.println("Telefone: " + consultaCNPJ.getDdd_telefone_1());
            System.out.println("Capital Social: " + consultaCNPJ.getCapital_social());
        } else {
            System.out.println("Nenhum resultado encontrado para o CNPJ informado.");
        }
    }
}
