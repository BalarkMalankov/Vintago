import {VIEW_ORDEN_LIST, SAVE_ORDEN} from "../actions/actionTypes";


export default function orden(state = {}, action) {
    switch (action.type) {
        case VIEW_ORDEN_LIST:
            return Object.assign({}, state, {
                actionType: action.type,
                ordenList: action.ordenList,
            });

        case SAVE_ORDEN:
            return Object.assign({}, state, {
                actionType: action.type,
                result: action.result,
            });


        default:
            return state;
    }
}