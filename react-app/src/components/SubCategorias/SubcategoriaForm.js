import React from 'react';
import {FormGroup, ControlLabel, FormControl, Form, Button, Col} from 'react-bootstrap';

class SubcategoriaForm extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            categorias: [],
            subcategoria: {
                nombresubcategoria: "",
                descripcionsubcategoria: "",
                categoria: {
                    idcategoria: 0
                }
            }

        };
    }

    handleTextChange(event) {
        let fieldName = event.target.name;
        let fieldValue = event.target.value;
        this.setState({subcategoria: {...this.state.subcategoria,[fieldName]: fieldValue}})
    }

    handleSelectChange(event) {
        let fieldName = event.target.name;
        let fieldValue = event.target.value;
        this.setState({subcategoria:{...this.state.subcategoria, categoria: {idcategoria: fieldValue}}})
    }

    componentWillReceiveProps(nextProps) {
        if (nextProps.categorias) {
            this.setState({categorias: nextProps.categorias})
        }
    }

    render() {
        return (
            <div>
                <h4>Registro de categorias: </h4>
                <Form horizontal>
                    <FormGroup controlId="nombresubcategoria">
                        <Col componentClass={ControlLabel} sm={2}>
                            Categoria
                        </Col>
                        <Col sm={8}>
                            <FormControl onChange={this.handleSelectChange.bind(this)} componentClass="select" placeholder="select">
                                {this.state.categorias.map((categoria, index)=>(
                                    <option value={categoria.idcategoria}>{categoria.nombrecategoria}</option>
                                ))}


                            </FormControl>
                        </Col>
                    </FormGroup>
                    <FormGroup controlId="nombresubcategoria">
                        <Col componentClass={ControlLabel} sm={2}>
                            Nombre
                        </Col>
                        <Col sm={8}>
                            <FormControl name="nombresubcategoria"
                                         type="text" value={this.state.subcategoria.nombresubcategoria}
                                         onChange={this.handleTextChange.bind(this)}/>
                        </Col>
                    </FormGroup>

                    <FormGroup controlId="descripcionsubcategoria">
                        <Col componentClass={ControlLabel} sm={2}>
                            Descripcion
                        </Col>
                        <Col sm={8}>
                            <FormControl name="descripcionsubcategoria"
                                         type="text"  value={this.state.subcategoria.descripcionsubcategoria}
                                         onChange={this.handleTextChange.bind(this)}/>
                        </Col>
                    </FormGroup>

                    <FormGroup>
                        <Col smOffset={2} sm={8}>
                            <Button type="submit">Guardar</Button>
                        </Col>
                    </FormGroup>
                </Form>
            </div>
        );
    }

}

export default SubcategoriaForm;