import {VIEW_CATEGORIA_LIST} from "../actions/actionTypes";

export default function categoria(state = {}, action) {
    switch (action.type) {
        case VIEW_CATEGORIA_LIST:
            return Object.assign({}, state, {
                actionType: action.type,
                categoriaList: action.categoriaList,
            });

        default:
            return state;
    }
}