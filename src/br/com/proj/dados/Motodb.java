package br.com.proj.dados;

import com.sun.media.sound.SoftSynthesizer;

import br.com.proj.entidade.Moto;

public class Motodb {

	public boolean insert (Moto moto) {
		
		System.out.println("id: "+ moto.getId());
		System.out.println("descri��o "+moto.getDescricao());
		System.out.println("ano "+moto.getAno());
		
		//IMPLEMENTA��O DO INSERT NA BASE DE DADOS
		
		return true;
	}
}
