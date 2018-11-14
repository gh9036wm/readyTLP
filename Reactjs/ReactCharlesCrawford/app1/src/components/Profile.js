import React, { Component } from 'react';

export default class Profile extends Component{
    render(){
      let hobbies = this.props.hobbies.map(hobby => {
        return <li>{hobby}</li>
      })
      return(
       <div >
       <h3>{this.props.name}</h3>
       <p>{this.props.name} is {this.props.age} years old and {this.props.bio}</p>
       <h3>Hobbies</h3>
       <ul>
         {hobbies}
       </ul>
       
     </div>
   )
    }
   
   }