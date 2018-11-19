import React from 'react';
import {Table} from 'react-bootstrap';
import PropTypes from "prop-types";

class ProductoList extends React.Component {

    static propTypes = {
        subcategorias: PropTypes.array.isRequired
    };

    constructor(props) {
        super(props);
        this.state = {
            productos: []
        };
    }

    componentWillReceiveProps(nextProps) {
        if (nextProps.productos) {
            this.setState({productos: nextProps.productos})
        }
    }

    render() {
        return (
            <div>
                <h4>Listado de Productos: </h4>
                <Table responsive hover>
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Sub-Categoria</th>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Link de la imagen</th>
                        <th>Acción</th>
                    </tr>
                    </thead>
                    <tbody>
                    {this.state.productos.map((producto, index) => (
                        <tr key={index}>
                            <td>{producto.idsubcategoria}</td>
                            <td>{producto.subCategoria.nombresubcategoria}</td>
                            <td>{producto.nombreproducto}</td>
                            <td>{producto.descripcionproducto}</td>
                            <td>{producto.linkimagenproducto}</td>
                            <td></td>
                        </tr>
                    ))}
                    </tbody>
                </Table>
            </div>
        )
    }

}

export default ProductoList;