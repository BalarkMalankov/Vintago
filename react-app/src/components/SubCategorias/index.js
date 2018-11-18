import React from 'react';
import SubcategoriaForm from "./SubcategoriaForm";
import SubcategoriaList from "./SubcategoriaList";
import {connect} from "react-redux";
import {fetchSubcategoriaList} from "../../actions/subcategoriaAction";
import {VIEW_SUBCATEGORIA_LIST} from "../../actions/actionTypes";

class SubCategorias extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            subcategorias: []
        }
    }

    componentDidMount() {
        this.props.fetchSubcategoriaList();
    }

    componentWillReceiveProps(nextProps) {
        if (nextProps.actionType === VIEW_SUBCATEGORIA_LIST) {
            this.setState({"subcategorias" : nextProps.subcategoriaList});
        }
    }

    render() {
        return (
            <div>
                <SubcategoriaForm />
                <SubcategoriaList subcategorias={this.state.subcategorias} />
            </div>
        );
    }

}


const mapState = state => {
    return {
        subcategoriaList: state.subcategoria.subcategoriaList,
        actionType: state.subcategoria.actionType
    }
};

const mapDispatch = {
    fetchSubcategoriaList
};

export default connect(mapState, mapDispatch)(SubCategorias);