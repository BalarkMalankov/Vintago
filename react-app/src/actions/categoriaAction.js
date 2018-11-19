import {SAVE_CATEGORIA, VIEW_CATEGORIA_LIST} from './actionTypes';


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
    };
}
    export function fetchCategoriaSave(categoria) {
        return function (dispatch, getState) {
            fetch('http://localhost:9090/api/categoria', {
                method: 'post',
                headers: {
                    'Accept': 'application/json, text/plain, */*',
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(categoria)
            })
                .then(async response => {
                    return Object.assign({}, await response.json());
                })
                .then(jsonData => {
                    dispatch(setCategoriaSave(jsonData))
                })
        };
    }

    export function setCategoriaSave(result) {
        return {
            type: SAVE_CATEGORIA,
            result
        }
}