package com.example.aoc.infrastructure.decembre2021.jour4;


import com.example.aoc.domain.entities.decembre2021.jour4.Bingo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BingoPersistanceAdapterTest {

	@Autowired
	private BingoPersistanceAdapter bingoPersistanceAdapter;

	@Test
	void recupererBingo_devrait_recupere_bingo() throws IOException {
		// When
		Bingo bingo = bingoPersistanceAdapter.recupererBingo();

		// Then
		assertThat(bingo.getValeurs().size()).isEqualTo(100);
	}
}