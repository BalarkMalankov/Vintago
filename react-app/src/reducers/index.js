import {combineReducers} from 'redux';
import task from './task';
import account from './account';
import categoria from './categoria'
import subcategoria from './subcategoria'
import producto from './producto'


export default combineReducers({
    account, task, categoria, subcategoria,producto
});
