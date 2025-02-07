package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hospede extends Pessoa{

private String pais;
private String email;
private Documento documento;
private String nomeDoPai;
private String nomeDaMae;
private LocalDate dataNascimento;
private CartaoDeCredito cartaoDoHospede;

    public Hospede(String nome, String endereco, String cidade, String estado, String telefone, int senha,
                   String pais, String email, String documento, TipoDocumento tipo, String nomeDaMae
            , String nomeDoPai, LocalDate dataNascimento,
                   long numeroDoCartao, int cvv, LocalDate dataDeValidadeDoCartao) {
        super(nome, endereco, cidade, estado, telefone, senha);
        setPais(pais);
        setEmail(email);
        setDocumento(new Documento(documento, tipo));
        setNomeDoPai(nomeDoPai);
        setNomeDaMae(nomeDaMae);
        setDataNascimento(dataNascimento);
        setCartaoDoHospede(new CartaoDeCredito(numeroDoCartao, cvv, dataDeValidadeDoCartao));
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public CartaoDeCredito getCartaoDoHospede() {
        return cartaoDoHospede;
    }

    public void setCartaoDoHospede(CartaoDeCredito cartaoDoHospede) {
        this.cartaoDoHospede = cartaoDoHospede;
    }
}
