import {INCREMENT_COUNT} from '../constants/actionTypes'
let initialState = 0
export default function reducerCount (state= initialState,action){
    switch(action.type){
        case INCREMENT_COUNT:
        return state +1
        default:
        return state
    }
}
