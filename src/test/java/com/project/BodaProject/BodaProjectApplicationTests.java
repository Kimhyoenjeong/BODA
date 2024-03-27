package com.project.BodaProject;

import com.project.BodaProject.api.ExhibitionDtoApi;
import com.project.BodaProject.repository.ExhibitionAllRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class BodaProjectApplicationTests {
	@Autowired
	private ExhibitionDtoApi exhibitionApi;
	@Autowired
	private ExhibitionAllRepository exhibitionAllRepository;

	@Test
	void dataAppendAll() throws IOException {
		exhibitionApi.ExhibitionApi();
	}

	@Test
	void dataAppendToday() throws IOException {
		exhibitionApi.ExhibitionApiToday();
	}
}
