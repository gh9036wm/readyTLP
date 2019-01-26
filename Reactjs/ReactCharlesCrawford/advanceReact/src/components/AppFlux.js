import React, { Component } from "react";
//import constants from './constants/app-constants'
//import dispatcher from './dispatcher/dispatcher'
import {incrementActions} from './actions/app-actions'
import {TodoStore} from './stores/countStore'

class AppFlux extends Component {
    constructor(props){
        super(props)
        this.state = {
            count : TodoStore.get_Count()
        }
        this.increment = this.increment.bind(this)
        this._onChange = this._onChange.bind(this)
    }
    componentDidMount(){
     TodoStore.addChangeListener(this._onChange)

    }
   componentWillUnmount(){
     TodoStore.removeChangeListener(this._onChange)
   }
   _onChange(){
     this.setState({
       count: TodoStore.get_Count()
     })
   }
 
    increment(){
       incrementActions.incrementCount()
    }
  render() {
    return (
      <div>
        <p>Hello Flux</p>
        <p>Count: {this.state.count} </p>
        <button onClick = {this.increment}> Increase Count </button>
      </div>
    );
  }
}
export default AppFlux;
