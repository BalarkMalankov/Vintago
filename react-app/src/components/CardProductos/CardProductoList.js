import React from 'react';
import {Table,Grid,Row,Col,Thumbnail,Button} from 'react-bootstrap';
import PropTypes from "prop-types";

class CardProductoList extends React.Component {

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
                {/*  <h4>Listado de Productos: </h4>
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
                </Table>*/}
                <Grid>
                    <Row>
                        {this.state.productos.map((producto, index) => (
                        <Col xs={6} md={4}>
                            <Thumbnail src={producto.linkimagenproducto} alt="242x200">
                                <h3>{producto.nombreproducto}</h3>
                                <p>{producto.descripcionproducto}</p>
                                <p>
                                    <Button bsStyle="primary">Comprar</Button>
                                    &nbsp;
                                    <Button bsStyle="default">Añadir a Carrito</Button>
                                </p>
                            </Thumbnail>
                        </Col>
                        ))}
                    </Row>
                </Grid>
            </div>
        )
    }

}

export default CardProductoList;