
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import in.stack.repository.SampleRepository;
import in.stack.service.SampleService;

@ExtendWith(MockitoExtension.class)
public class RepositoryTest {
    @Mock
	SampleRepository repo;
    
    @InjectMocks
    SampleService service;
    
    
    @Test
    public void testGetFruits() {
    	
    	Mockito.when(repo.getFruits()).thenReturn(Arrays.asList("fruit1","fruits2","fruits3","fruits4"));
    	
    	List <String> fruits=service.getFruits();
    	
    	assertNotNull(fruits);
    	assertEquals(3,fruits.size());
    }
	
}
