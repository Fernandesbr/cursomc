package com.fernandes.cursomc.domain.enums;

import com.sun.source.util.TreePathScanner;

import net.bytebuddy.asm.Advice.This;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa física"), PESSOAJURIDICA(2, "Pessoa Jurídica");

	private int cod;
	private String descricao;

	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;

	}

	public int getCod() {
		return cod;

	}

	public String getDescricao() {
		return descricao;

	}

	public static TipoCliente toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id Inválido: " + cod);
	}
}
