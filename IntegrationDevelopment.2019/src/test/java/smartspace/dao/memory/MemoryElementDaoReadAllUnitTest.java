package smartspace.dao.memory;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import smartspace.data.ElementEntity;
import smartspace.data.Location;
import smartspace.data.util.EntityFactory;

public class MemoryElementDaoReadAllUnitTest {
	
	@Test
	public void testReadAllWithValidElement() throws Exception{
		// GIVEN a dao is available 
				MemoryElementDao dao = new MemoryElementDao();
				// AND  element entities are added to the dao
				ElementEntity element1 = new ElementEntity();
				ElementEntity element2 = new ElementEntity();
				ElementEntity element3 = new ElementEntity();
				ElementEntity e1 = dao.create(element1);
				ElementEntity e2 = dao.create(element2);

						
				// WHEN invoking readAll on the dao
				List<ElementEntity> result = dao.readAll();

				// THEN the returned list is the dao's element entities list
				assertThat(result).containsExactly(element1, element2);
				
				dao.deleteAll();	
				
	}
	
	
}
