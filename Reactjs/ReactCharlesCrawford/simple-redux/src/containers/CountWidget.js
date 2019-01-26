import React, { Component } from 'react';
import {bindActionCreators} from 'redux'
import {connect} from 'react-redux'
import {incrementCount} from '../actions/index'
class CountWidget extends Component{
    render(){
        return(
            <div>
            <p> Count: {this.props.count}  </p>
            <button onClick = {this.props.incrementCount}>Increase Count</button>
            </div>
        )
    }
}
function mapStateToProps(state){
    return {
           count: state.count
    }
}
function mapDispatchToProps(dispatch){
    return bindActionCreators(
        {incrementCount: incrementCount}, dispatch
    )
}
export default connect (mapStateToProps,mapDispatchToProps) (CountWidget)