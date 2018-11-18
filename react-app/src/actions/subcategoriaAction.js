import {VIEW_SUBCATEGORIA_LIST} from './actionTypes';

export function fetchSubcategoriaList() {
    return function (dispatch, getState) {

        fetch("http://localhost:9090/api/subCategoria")
            .then(response => response.json())
            .then(jsonData => {
                dispatch(setSubCategoriaList(jsonData))
            })
    };
}

function setSubCategoriaList(subcategoriaList) {
    return {
        type: VIEW_SUBCATEGORIA_LIST,
        subcategoriaList
    }
}