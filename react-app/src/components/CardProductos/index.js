import React from 'react';
import CardProductoList from "./CardProductoList";
import {connect} from "react-redux";
import {fetchProductoList} from "../../actions/productoActions";
import {fetchSubcategoriaList} from "../../actions/subcategoriaAction";
import {VIEW_PRODUCTO_LIST} from "../../actions/actionTypes";

class CardProductos extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            productos: [],
            subcategorias: []
        }
    }


    componentDidMount() {
        this.props.fetchProductoList();
        this.props.fetchSubcategoriaList();
    }

    componentWillReceiveProps(nextProps) {

        if (nextProps.actionType === VIEW_PRODUCTO_LIST) {
            this.setState({"productos" : nextProps.productoList, "subcategorias" : nextProps.subcategoriaList});
        }
    }

    render() {
        return (
            <div>
                <CardProductoList productos={this.state.productos} />
            </div>
        );
    }

};

const mapState = state => {
    return {
        productoList: state.producto.productoList,
        subcategoriaList: state.subcategoria.subcategoriaList,
        actionType: state.producto.actionType
    }
};

const mapDispatch = {
    fetchProductoList, fetchSubcategoriaList
};


export default connect(mapState, mapDispatch)(CardProductos);