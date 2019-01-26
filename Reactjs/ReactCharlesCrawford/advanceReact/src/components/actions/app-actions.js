import constants from '../constants/app-constants'
import dispatcher from '../dispatcher/dispatcher'

export let incrementActions = {
    incrementCount: ()=>{
        console.log("James Tran from IncrementCount in action")
        dispatcher.dispatch({
            actionType: constants.INCREMENT
        })
    }
}