import {combineReducers} from 'redux';
import task from './task';
import account from './account';
import categoria from './categoria'

export default combineReducers({
    account, task, categoria
});
