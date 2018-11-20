import React from 'react';
import OrdenForm from "./OrdenForm";
import OrdenList from "./OrdenList";
import {connect} from "react-redux";
import {fetchOrdenList} from "../../actions/ordenAction";
import {fetchDetalleOrdenList} from "../../actions/detallesOrdenesAction";
import {VIEW_ORDEN_LIST} from "../../actions/actionTypes";




class Ordenes extends React.Component{

    constructor(props) {
        super(props);
        this.state = {
            ordenes: [],
            detalleordenes: []
        }
    }

    componentDidMount() {
        this.props.fetchOrdenList();
        this.props.fetchDetalleOrdenList();
    }


    componentWillReceiveProps(nextProps) {

        if (nextProps.actionType === VIEW_ORDEN_LIST) {
            this.setState({"ordenes" : nextProps.ordenList, "detalleordenes" : nextProps.detalleOrdenList});
        }
    }

    render() {
        return (
            <div>
                <OrdenForm afterSubmit={this.props.fetchOrdenList} detalleordenes={this.state.detalleordenes} />
                {/*                <OrdenList productos={this.state.ordenes} />*/}
            </div>
        );
    }

};

const mapState = state => {
    return {
        ordenList: state.orden.ordenList,
        ordenDetalleList: state.detalleOrden.ordenDetalleList,
        actionType: state.orden.actionType
    }
};

const mapDispatch = {
    fetchOrdenList, fetchDetalleOrdenList
};

export default connect(mapState, mapDispatch)(Ordenes);
