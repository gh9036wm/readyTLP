import React, { Component } from 'react';

export default class  AddProfile extends Component{
    constructor(props){
        super(props)
        this.state = {
            name: '',
            bio : '',
            hobby:''
        }
        this.handleName = this.handleName.bind(this)
        this.handleBio = this.handleBio.bind(this)
        this.handleHobby=this.handleHobby.bind(this)
        this.handleClick=this.handleClick.bind(this)
    }
// Function area begin
   handleName(e){
       this.setState(
           {
               name:e.target.value
           }
        )
   }

   handleBio(e){
    this.setState(
        {
            bio:e.target.value
        }
     )
}
handleHobby(e){
    this.setState(
        {
            hobby:e.target.value
        }
     )
}
handleClick(e){
    let newProfile = {
        name : this.state.name,
        bio : this.state.bio,
        hobbies: [this.state.hobby]
    }
    this.props.addUser(newProfile)
}

//Function area end

    render () {
        return(
            <div>
            <p>Add New Profile</p>
            <span>value input: {this.state.name} </span> {/** Just demonstrate the state changes*/}
            <input onChange = {this.handleName}   value = {this.state.name}/>
            <input onChange = {this.handleBio}   value = {this.state.bio}/>
            <input onChange = {this.handleHobby}   value = {this.state.hobby}/>
            <button onClick= {this.handleClick}>Add Profile</button>
            </div>
        )
    }
}

/**
 * 
 <p>Add New Profile</p>
            <button onClick= {this.props.addUser}>Add Profile</button>
 */