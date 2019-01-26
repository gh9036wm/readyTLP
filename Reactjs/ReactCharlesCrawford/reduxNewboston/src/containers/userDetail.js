import React, { Component } from 'react';
import {connect} from 'react-redux'
//import {selectUser} from '../actions/actionUserDetail'
//import { bindActionCreators } from 'redux';


class UserDetail extends Component{
    render(){
        if(!this.props.user){
            return(
                <div>
                    <h3>Select a user.....</h3>
                </div>
            )
        }
        return(
            <div>
                <h4>Name: {this.props.user.first} {this.props.user.last}</h4>
                <h4>Age: {this.props.user.age}</h4>

            </div>
        )
    }
}

function mapStateToProps(state){
    return {
           user: state.activeUser
    }
}
export default connect(mapStateToProps)(UserDetail)