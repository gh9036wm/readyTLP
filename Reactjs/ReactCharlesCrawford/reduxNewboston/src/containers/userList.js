import React, { Component } from 'react';
import {connect} from 'react-redux'
import {selectUser} from '../actions/actionUserDetail'
import { bindActionCreators } from 'redux';
class UserList extends Component{
    createListItem(){
        return this.props.users.map((user)=>{
            return (
                <li key={user.id}
                 onClick={ ()=> this.props.selectUser(user)} // make sure is a function not props for on
                >{user.first} {user.last}</li>
            )
        })
    }
        
    render(){
        return(
            <div>
        
             <ul>
                {this.createListItem()}
             </ul>
           
            </div>
        )
    }
}
function mapStateToProps(state){
    return {
           users: state.users
    }
}

function mapDispatchToProps (dispatch){
     return bindActionCreators({
        selectUser: selectUser}, dispatch
     )
}
export default connect(mapStateToProps,mapDispatchToProps)(UserList)