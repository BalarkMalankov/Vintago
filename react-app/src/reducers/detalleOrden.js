import {VIEW_DETALLEORDEN_LIST, SAVE_DETALLEORDEN} from "../actions/actionTypes";


export default function detalleOrden(state = {}, action) {
    switch (action.type) {
        case VIEW_DETALLEORDEN_LIST:
            return Object.assign({}, state, {
                actionType: action.type,
                detalleOrdenList: action.detalleOrdenList,
            });

        case SAVE_DETALLEORDEN:
            return Object.assign({}, state, {
                actionType: action.type,
                result: action.result,
            });


        default:
            return state;
    }
}