import React from 'react';
import {Table} from 'react-bootstrap';
import PropTypes from "prop-types";

class SubcategoriaList extends React.Component {

    // Le decimos al componente que va a necesitar un parametro/atributo llamado categorias que es obligatorio
    static propTypes = {
        subcategorias: PropTypes.array.isRequired
    };

    constructor(props) {
        super(props);
        this.state = {
            subcategorias: []
        };
    }

    componentWillReceiveProps(nextProps) {
        if (nextProps.subcategorias) {
            this.setState({subcategorias: nextProps.subcategorias})
        }
    }

    render() {
        return (
            <div>
                <h4>Listado de categorias: </h4>
                <Table responsive hover>
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Categoria</th>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Acción</th>
                    </tr>
                    </thead>
                    <tbody>
                    {this.state.subcategorias.map((subcategoria, index) => (
                        <tr key={index}>
                            <td>{subcategoria.idsubcategoria}</td>
                            <td>{subcategoria.categoria.nombrecategoria}</td>
                            <td>{subcategoria.nombresubcategoria}</td>
                            <td>{subcategoria.descripcionsubcategoria}</td>
                            <td></td>
                        </tr>
                    ))}
                    </tbody>
                </Table>
            </div>
        )
    }
}

export default SubcategoriaList;