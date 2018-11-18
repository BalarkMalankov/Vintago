import {combineReducers} from 'redux';
import task from './task';
import account from './account';
import categoria from './categoria'
import subcategoria from './subcategoria'

export default combineReducers({
    account, task, categoria, subcategoria
});
