 
 const activeUser = (state= null, action) => {
    switch(action.type){
        case "USER_SELECTED":
        return action.payload
    }
    return state
}
export default activeUser