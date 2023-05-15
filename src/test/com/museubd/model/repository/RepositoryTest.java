package com.museubd.model.repository;

import com.museubd.model.bean.Outros;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.criteria.CriteriaQuery;

import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

public class RepositoryTest {

    private Repository repository;

    @Before
    public void initialize() {
        repository = new Repository();
    }

    @Test
    public void testSave() {
        Outros outros = new Outros();
        outros.setNum_obj3(1);
        outros.setTipo("EmpireAnts");
        repository.save(outros);

        Outros resultado = (Outros) repository.find(Outros.class, 1);
        repository.delete(outros);

        assertEquals(outros.getNum_obj3(), resultado.getNum_obj3());
    }

    @Test
    public void testDeletion() {
        Outros outros = new Outros();
        outros.setNum_obj3(1);
        outros.setTipo("EmpireAnts");
        repository.save(outros);

        repository.delete(outros);
        Outros resultado = (Outros) repository.find(Outros.class, 1);
        assertTrue(Objects.isNull(resultado));
    }

    @Test
    public void testFindAll() {
        Outros outros1 = new Outros();
        outros1.setNum_obj3(1);
        outros1.setTipo("EmpireAnts");
        Outros outros2 = new Outros();
        outros2.setNum_obj3(2);
        outros2.setTipo("Busted And Blue");

        repository.save(outros1);
        repository.save(outros2);

        List<Outros> outros = repository.findAll(Outros.class);

        repository.delete(outros1);
        repository.delete(outros2);

        assertEquals(List.of(outros1, outros2), outros);
    }

}