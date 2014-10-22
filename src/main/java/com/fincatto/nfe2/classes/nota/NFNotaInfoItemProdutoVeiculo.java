package com.fincatto.nfe2.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import com.fincatto.nfe2.classes.NFBase;
import com.fincatto.nfe2.classes.NFNotaInfoCombustivelTipo;
import com.fincatto.nfe2.classes.NFNotaInfoEspecieVeiculo;
import com.fincatto.nfe2.classes.NFNotaInfoItemProdutoVeiculoCondicao;
import com.fincatto.nfe2.classes.NFNotaInfoItemProdutoVeiculoCondicaoChassi;
import com.fincatto.nfe2.classes.NFNotaInfoItemProdutoVeiculoRestricao;
import com.fincatto.nfe2.classes.NFNotaInfoItemProdutoVeiculoTipoOperacao;
import com.fincatto.nfe2.classes.NFNotaInfoTipoVeiculo;
import com.fincatto.nfe2.classes.NFNotaInfoVeiculoCor;
import com.fincatto.nfe2.validadores.BigDecimalParser;
import com.fincatto.nfe2.validadores.IntegerValidador;
import com.fincatto.nfe2.validadores.StringValidador;

public class NFNotaInfoItemProdutoVeiculo extends NFBase {

    @Element(name = "tpOp", required = true)
    private NFNotaInfoItemProdutoVeiculoTipoOperacao tipoOperacao;

    @Element(name = "chassi", required = true)
    private String chassi;

    @Element(name = "cCor", required = true)
    private String codigoCor;

    @Element(name = "xCor", required = true)
    private String descricaoCor;

    @Element(name = "pot", required = true)
    private String potencia;

    @Element(name = "cilin", required = true)
    private String cilindrada;

    @Element(name = "pesoL", required = true)
    private String pesoLiquido;

    @Element(name = "pesoB", required = true)
    private String pesoBruto;

    @Element(name = "nSerie", required = true)
    private String numeroSerie;

    @Element(name = "tpComb", required = true)
    private NFNotaInfoCombustivelTipo tipoCombustivel;

    @Element(name = "nMotor", required = true)
    private String numeroMotor;

    @Element(name = "CMT", required = true)
    private String capacidadeMaximaTracao;

    @Element(name = "dist", required = true)
    private String distanciaEntreEixos;

    @Element(name = "anoMod", required = true)
    private Integer anoModeloFabricacao;

    @Element(name = "anoFab", required = true)
    private Integer anoFabricacao;

    @Element(name = "tpPint", required = true)
    private String tipoPintura;

    @Element(name = "tpVeic", required = true)
    private NFNotaInfoTipoVeiculo tipoVeiculo;

    @Element(name = "espVeic", required = true)
    private NFNotaInfoEspecieVeiculo especieVeiculo;

    @Element(name = "VIN", required = true)
    private NFNotaInfoItemProdutoVeiculoCondicaoChassi condicaoChassi;

    @Element(name = "condVeic", required = true)
    private NFNotaInfoItemProdutoVeiculoCondicao condicao;

    @Element(name = "cMod", required = true)
    private String codigoMarcaModelo;

    @Element(name = "cCorDENATRAN", required = true)
    private NFNotaInfoVeiculoCor corDENATRAN;

    @Element(name = "lota", required = true)
    private Integer lotacao;

    @Element(name = "tpRest", required = true)
    private NFNotaInfoItemProdutoVeiculoRestricao restricao;

    public void setTipoOperacao(final NFNotaInfoItemProdutoVeiculoTipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public void setChassi(final String chassi) {
        StringValidador.exatamente17(chassi);
        this.chassi = chassi;
    }

    public void setCodigoCor(final String codigoCor) {
        StringValidador.exatamente4(codigoCor);
        this.codigoCor = codigoCor;
    }

    public void setDescricaoCor(final String descricaoCor) {
        StringValidador.tamanho40(descricaoCor);
        this.descricaoCor = descricaoCor;
    }

    public void setPotencia(final String potencia) {
        StringValidador.exatamente4(potencia);
        this.potencia = potencia;
    }

    public void setCilindrada(final String cilindrada) {
        StringValidador.exatamente4(cilindrada);
        this.cilindrada = cilindrada;
    }

    public void setPesoLiquido(final BigDecimal pesoLiquido) {
        this.pesoLiquido = BigDecimalParser.tamanho9Com4CasasDecimais(pesoLiquido);
    }

    public void setPesoBruto(final BigDecimal pesoBruto) {
        this.pesoBruto = BigDecimalParser.tamanho9Com4CasasDecimais(pesoBruto);
    }

    public void setNumeroSerie(final String numeroSerie) {
        StringValidador.exatamente9(numeroSerie);
        this.numeroSerie = numeroSerie;
    }

    public void setTipoCombustivel(final NFNotaInfoCombustivelTipo tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setNumeroMotor(final String numeroMotor) {
        StringValidador.exatamente21(numeroMotor);
        this.numeroMotor = numeroMotor;
    }

    public void setCapacidadeMaximaTracao(final BigDecimal capacidadeMaximaTracao) {
        this.capacidadeMaximaTracao = BigDecimalParser.tamanho9Com4CasasDecimais(capacidadeMaximaTracao);
    }

    public void setDistanciaEntreEixos(final String distanciaEntreEixos) {
        StringValidador.exatamente4(distanciaEntreEixos);
        this.distanciaEntreEixos = distanciaEntreEixos;
    }

    public void setAnoModeloFabricacao(final int anoModeloFabricacao) {
        IntegerValidador.exatamente4(anoModeloFabricacao);
        this.anoModeloFabricacao = anoModeloFabricacao;
    }

    public void setAnoFabricacao(final int anoFabricacao) {
        IntegerValidador.exatamente4(anoFabricacao);
        this.anoFabricacao = anoFabricacao;
    }

    public void setTipoPintura(final String tipoPintura) {
        StringValidador.exatamente1(tipoPintura);
        this.tipoPintura = tipoPintura;
    }

    public void setTipoVeiculo(final NFNotaInfoTipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void setEspecieVeiculo(final NFNotaInfoEspecieVeiculo especieVeiculo) {
        this.especieVeiculo = especieVeiculo;
    }

    public void setCondicaoChassi(final NFNotaInfoItemProdutoVeiculoCondicaoChassi condicaoChassi) {
        this.condicaoChassi = condicaoChassi;
    }

    public void setCondicao(final NFNotaInfoItemProdutoVeiculoCondicao condicao) {
        this.condicao = condicao;
    }

    public void setCodigoMarcaModelo(final String codigoMarcaModelo) {
        StringValidador.exatamente6N(codigoMarcaModelo);
        this.codigoMarcaModelo = codigoMarcaModelo;
    }

    public void setCodigoCorDENATRAN(final NFNotaInfoVeiculoCor corDENATRAN) {
        this.corDENATRAN = corDENATRAN;
    }

    public void setLotacao(final int lotacao) {
        IntegerValidador.tamanho3(lotacao);
        this.lotacao = lotacao;
    }

    public void setRestricao(final NFNotaInfoItemProdutoVeiculoRestricao restricao) {
        this.restricao = restricao;
    }
}