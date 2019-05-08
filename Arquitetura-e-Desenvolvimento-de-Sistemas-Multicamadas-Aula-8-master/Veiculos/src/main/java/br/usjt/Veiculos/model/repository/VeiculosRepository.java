package br.usjt.Veiculos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.Veiculos.model.bean.Veiculos;

public interface VeiculosRepository extends JpaRepository<Veiculos, Long>{
}
