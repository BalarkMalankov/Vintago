import React from 'react';
import {BrowserRouter as Router, Route, Switch} from "react-router-dom";
import HomePage from './HomePage';
import LoginPage from './LoginPage';
import './main.css';
import TasksPage from "./TasksPage";
import TransferPage from "./TransferPage";
import CategoriasPage from "./CategoriasPage";
import SubCategoriasPage from "./SubCategoriasPage";
import ProductosPage from "./ProductosPage";
import CardProductosPage from "./CardProductosPage";


const Routes = () => (
    <Router>
        <Switch>
            <Route exact path="/" component={HomePage}/>
            <Route path="/categorias" component={CategoriasPage}/>
            <Route path="/subcategorias" component={SubCategoriasPage}/>
            <Route path="/productos" component={ProductosPage}/>
            <Route path="/productosCatalogo" component={CardProductosPage}/>
            <Route path="/login" component={LoginPage}/>
            <Route path="/tasks" component={TasksPage}/>
            <Route path="/transfer" component={TransferPage}/>
        </Switch>
    </Router>
);

export default Routes;
