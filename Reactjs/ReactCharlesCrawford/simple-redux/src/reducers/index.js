import {combineReducers} from 'redux'
import CountReducer from './reducerCount'// import all from reducerCount and store in variable CountReducer

const allReducers = combineReducers({
    count: CountReducer
})
export default allReducers