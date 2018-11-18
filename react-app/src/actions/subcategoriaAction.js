import {VIEW_SUBCATEGORIA_LIST, SAVE_SUBCATEGORIA} from './actionTypes';

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

export function fetchSubcategoriaSave(subcategoria) {
    return function (dispatch, getState) {
        fetch('http://localhost:9090/api/subCategoria', {
            method: 'post',
            headers: {
                'Accept': 'application/json, text/plain, */*',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(subcategoria)
        })
            .then(async response => {
                return Object.assign({}, await response.json());
            })
            .then(jsonData => {
                dispatch(setSubcategoriaSave(jsonData))
            })
    };
}

export function setSubcategoriaSave(result) {
    return {
        type: SAVE_SUBCATEGORIA,
        result
    }
}