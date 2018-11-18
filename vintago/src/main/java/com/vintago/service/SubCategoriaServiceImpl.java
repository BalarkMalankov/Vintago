package com.vintago.service;

import com.vintago.entity.Categoria;
import com.vintago.entity.SubCategoria;
import com.vintago.repository.CategoriaRepository;
import com.vintago.repository.SubCategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class SubCategoriaServiceImpl implements ISubCategoriaService {

    @Autowired
    SubCategoriaRepository repository;

    @Autowired
    CategoriaRepository categoriaRepository;

    /**
     *
     * @param nombreCategoria parametro de tipo String
     * @return retorna una lista de SubCategoria relacionada al parametro nombreCategoria
     */

    @Override
    public List<SubCategoria> findByNombresubcategoria(String nombreCategoria) {
        return repository.findByNombresubcategoria(nombreCategoria);
    }

    /**
     *
     * @return devuelve un iterable que usaremos en un foreach para mostrar las subcategoria
     */

    @Override
    public Iterable<SubCategoria> findAll() {
        return repository.findAll();
    }
    /**
     *
     * @param id parametro
     * @return devolvera un Optional que contendra el id de la subcategoria elegida
     */
    @Override
    public Optional<SubCategoria> findById(int id) {
        return repository.findById(id);
    }

    /**
     *
     * @param adminn un objeto de l clase SubCategoria que sera eliminado
     */

    @Override
    public void delete(SubCategoria adminn) {
        repository.delete(adminn);
    }

    /**
     *
     * @param id id de la SubCategoria a ser eliminada
     */
    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    /**
     *
     * @param id id de la SubCategoria elegida para comprobar la existencia
     * @return  retorna un boolean true(existe) or false(no existe)
     */
    @Override
    public boolean existsById(int id) {
        return repository.existsById(id);
    }

    /**
     *
     *
     * @param subCategoria objeto de la clase SubCategoria elegida a ser guardada
     * @return retorna el objeto de la clase SubCategoria
     */
    @Override
    public SubCategoria save(SubCategoria subCategoria) {

        Optional<Categoria> categoria = categoriaRepository.findById(subCategoria.getCategoria().getIdcategoria());

        if(categoria.isPresent()){
            subCategoria.setCategoria(categoria.get());
            return repository.save(subCategoria);
        }

        return null;

    }

    /**
     *
     *
     * @param admn objeto de la clase SubCategoria a ser guardad
     * @return retorna un iterable de SubCategoria. sera usada en un foreach para
     * poder guardar todos los datos de la Sub
     */
    @Override
    public Iterable<SubCategoria> saveAll(Iterable<SubCategoria> admn) {
        return repository.saveAll(admn);
    }
}
