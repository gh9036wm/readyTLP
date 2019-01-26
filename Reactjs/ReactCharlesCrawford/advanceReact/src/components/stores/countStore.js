//import constants from '../constants/app-constants'
import dispatcher from "../dispatcher/dispatcher";
import {EventEmitter} from 'events';
//TODO backing variables

let _count = 0;
function getCount() {
  return _count;
}
function incrementCount() {
  _count = _count + 1;
}

//TODO define the atual store
export let TodoStore = Object.assign({},EventEmitter.prototype,{
  get_Count: getCount,
  emitChange: function() {
    this.emit('CHANGE_EVENT')
  },
  addChangeListener: function(callback) {
    this.on('CHANGE_EVENT',callback)
  },
  removeChangeListener: function(callback){
    this.removeListener('CHANGE_EVENT', callback)
  }

})

//TODO register with dispatcher
/**
 * in this step we register store with dispatcher and let dispatcher know which action it is interested by using
 * switch case
 */
dispatcher.register(action => {
  console.log(action);
  switch (action.actionType) {
    case "INCREMENT":
       incrementCount()
       TodoStore.emitChange()
    
    
      break;
  }
});
