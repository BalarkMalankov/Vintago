import {VIEW_PRODUCTO_LIST, SAVE_PRODUCTO} from "../actions/actionTypes";

export default function producto(state = {}, action) {
    switch (action.type) {
        case VIEW_PRODUCTO_LIST:
            return Object.assign({}, state, {
                actionType: action.type,
                productoList: action.productoList,
            });

        case SAVE_PRODUCTO:
            return Object.assign({}, state, {
                actionType: action.type,
                result: action.result,
            });


        default:
            return state;
    }
}