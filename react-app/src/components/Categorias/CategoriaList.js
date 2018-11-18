import React from 'react';
import {Table} from 'react-bootstrap';
import PropTypes from "prop-types";

class CategoriaList extends React.Component {

    // Le decimos al componente que va a necesitar un parametro/atributo llamado categorias que es obligatorio
    static propTypes = {
        categorias: PropTypes.array.isRequired
    };

    constructor(props) {
        super(props);
        this.state = {
            categorias: []
        };
    }

    componentWillReceiveProps(nextProps) {
        if (nextProps.categorias) {
            this.setState({categorias: nextProps.categorias})
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
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Acción</th>
                    </tr>
                    </thead>
                    <tbody>
                    {this.state.categorias.map((categoria, index) => (
                        <tr key={index}>
                            <td>{categoria.idcategoria}</td>
                            <td>{categoria.nombrecategoria}</td>
                            <td>{categoria.descripcioncategoria}</td>
                            <td></td>
                        </tr>
                    ))}
                    </tbody>
                </Table>
            </div>
        )
    }
}

export default CategoriaList;