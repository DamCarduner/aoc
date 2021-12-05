package com.example.aoc.infrastructure.decembre2021.jour5;


import com.example.aoc.domain.entities.decembre2021.jour4.Bingo;
import com.example.aoc.domain.entities.decembre2021.jour5.HydrothermalVenture;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HydrothermalVenturePersistanceAdapterTest {

	@Autowired
	private HydrothermalVenturePersistanceAdapter hydrothermalVenturePersistanceAdapter;

	@Test
	void recupererBingo_devrait_recupere_bingo() throws IOException {
		// When
		HydrothermalVenture hydrothermalVenture = hydrothermalVenturePersistanceAdapter.recupererHydrothermalVenture();

		// Then
		assertThat(hydrothermalVenture.getLines().size()).isEqualTo(500);
	}
}