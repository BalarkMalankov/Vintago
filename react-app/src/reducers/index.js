import {combineReducers} from 'redux';
import task from './task';
import account from './account';
import categoria from './categoria';
import subcategoria from './subcategoria';
import producto from './producto';
import orden from './orden';
import detalleOrden from './detalleOrden';

export default combineReducers({
    account, task, categoria, subcategoria,producto,orden,detalleOrden
});
