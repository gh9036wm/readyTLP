import React, { Component } from "react";
import UserList from '../containers/userList'
import UserDetail from '../containers/userDetail'
class UserWidget extends Component {
    render() {
      return (
        <div>
          <h3>User List</h3>
          <UserList/>
          <hr/>
          <h3>User Detail</h3>
            <UserDetail/>
        </div>
      );
    }
  }
  
  export default UserWidget;
  