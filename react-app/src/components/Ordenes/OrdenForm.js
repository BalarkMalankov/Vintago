import React from 'react';
import {FormGroup, ControlLabel, FormControl, Form, Button, Col} from 'react-bootstrap';
import {fetchOrdenSave} from "../../actions/ordenAction";
import connect from "react-redux/es/connect/connect";
import {SAVE_ORDEN} from "../../actions/actionTypes";
import PropTypes from "prop-types";


class OrdenForm extends React.Component{

    initialState={
        detalleOrdenes:[],
        orden:{
            numeroorden:"",
            fechaentrega:"",
            fecharecibida:"",
            detalleordenes:{
                id: {
                    productoIdproducto: 1,
                    ordenIdorden: 1
                }
            }
        }
    };

    static propTypes = {
        detalleOrdenes: PropTypes.array.isRequired,
        afterSubmit: PropTypes.func
    };


    constructor(props) {
        super(props);
        this.state = this.initialState;
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleTextChange(event) {
        let fieldName = event.target.name;
        let fieldValue = event.target.value;
        this.setState({orden: {...this.state.orden,[fieldName]: fieldValue}})
    }


    handleSelectChange(event) {
        let fieldValue = event.target.value;
        this.setState({orden:{...this.state.orden, detalleordenes: {id: fieldValue}}})
        //this.setState({orden:{...this.state.orden,detalleordenes:{id:{productoidproducto: 3}}}})
    }

    componentWillReceiveProps(nextProps) {
        if (nextProps.detalleOrdenes) {
            this.setState({detalleOrdenes: nextProps.detalleOrdenes})
        }

        if(nextProps.actionType===SAVE_ORDEN){
            this.setState(this.initialState);
            this.props.afterSubmit();
        }
    }

    handleSubmit(){
        this.props.fetchOrdenSave(this.state.orden);
    }


    render() {
        return (
            <div>
                <h4>Registrar Orden: </h4>
                <Form horizontal>
                    <FormGroup controlId="productoIdproducto">
                        <Col componentClass={ControlLabel} sm={2}>

                        </Col>
                        <Col sm={8}>
                            <FormControl onChange={this.handleSelectChange.bind(this)} componentClass="select" placeholder="select">
                                {this.state.detalleOrdenes.map((detalleOrdenes, index)=>(
                                    <option key={index} value={detalleOrdenes.id}>{detalleOrdenes.productoIdproducto}</option>
                                ))}


                            </FormControl>
                        </Col>
                    </FormGroup>
                    <FormGroup controlId="ordenIdorden">
                        <Col componentClass={ControlLabel} sm={2}>

                        </Col>
                        <Col sm={8}>
                            <FormControl onChange={this.handleSelectChange.bind(this)} componentClass="select" placeholder="select">
                                {this.state.detalleOrdenes.map((detalleordenes, index)=>(
                                    <option key={index} value={detalleordenes.id}>{detalleordenes.ordenIdorden}</option>
                                ))}

                            </FormControl>
                        </Col>
                    </FormGroup>
                    <FormGroup controlId="numeroorden">
                        <Col componentClass={ControlLabel} sm={2}>
                            Nombre
                        </Col>
                        <Col sm={8}>
                            <FormControl name="numeroorden"
                                         type="text" value={this.state.orden.numeroorden}
                                         onChange={this.handleTextChange.bind(this)}/>
                        </Col>
                    </FormGroup>

                    <FormGroup controlId="fechaentrega">
                        <Col componentClass={ControlLabel} sm={2}>
                            Codigo
                        </Col>
                        <Col sm={8}>
                            <FormControl name="fechaentrega"
                                         type="text" value={this.state.orden.fechaentrega}
                                         onChange={this.handleTextChange.bind(this)}/>
                        </Col>
                    </FormGroup>
                    <FormGroup controlId="fecharecibida">
                        <Col componentClass={ControlLabel} sm={2}>
                            Precio
                        </Col>
                        <Col sm={8}>
                            <FormControl name="fecharecibida"
                                         type="text" value={this.state.orden.fecharecibida}
                                         onChange={this.handleTextChange.bind(this)}/>
                        </Col>
                    </FormGroup>

                    <FormGroup>
                        <Col smOffset={2} sm={8}>
                            <Button onClick={this.handleSubmit}>Guardar</Button>
                        </Col>
                    </FormGroup>
                </Form>
            </div>
        );
    }

}



const mapState = state => {
    return {
        result: state.orden.result || {},
        actionType: state.orden.actionType
    }
};

const mapDispatch = {
    fetchOrdenSave
};

export default connect(mapState, mapDispatch)(OrdenForm);