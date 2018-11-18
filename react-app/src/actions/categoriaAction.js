import {VIEW_CATEGORIA_LIST} from './actionTypes';

export function fetchCategoriaList() {
    return function (dispatch, getState) {

        fetch("http://localhost:9090/api/categoria")
            .then(response => response.json())
            .then(jsonData => {
                dispatch(setCategoriaList(jsonData))
            })
    };
}

function setCategoriaList(categoriaList) {
    return {
        type: VIEW_CATEGORIA_LIST,
        categoriaList
    }
}