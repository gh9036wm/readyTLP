import {combineReducers} from 'redux'
import CountReducer from './reducerCount'// import all from reducerCount and store in variable CountReducer
import UserList from './reducerUser'
import activeUser from './reducerActiveUser'
const allReducers = combineReducers({
    count: CountReducer,
    users: UserList,
    activeUser: activeUser
})
export default allReducers