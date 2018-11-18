import {VIEW_SUBCATEGORIA_LIST} from "../actions/actionTypes";

export default function subcategoria(state = {}, action) {
    switch (action.type) {
        case VIEW_SUBCATEGORIA_LIST:
            return Object.assign({}, state, {
                actionType: action.type,
                subcategoriaList: action.subcategoriaList,
            });

        default:
            return state;
    }
}