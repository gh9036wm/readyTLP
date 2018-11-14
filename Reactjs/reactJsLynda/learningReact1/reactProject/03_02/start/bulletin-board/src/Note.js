import React, { Component } from 'react'
import {FaWrench} from 'react-icons/fa'
import {FaTrash} from 'react-icons/fa'
import {FaSave} from 'react-icons/fa'

class Note extends Component {
	constructor(props){
		super(props)
		//original state
		this.state ={
			editing: false
		}



		this.edit = this.edit.bind(this)
		this.remove=this.remove.bind(this)
		this.renderForm=this.renderForm.bind(this)
		this.renderDisplay=this.renderDisplay.bind(this)
		this.save = this.save.bind(this)
	}
	save(){
		alert(this.new_Text.value)
	}
	edit(){
		this.setState({editing: true})
	}
	remove(){
		alert("removed")
	}

	renderForm(){
		return (
			<div className="note">
				<form>
					<textarea ref={input => this.new_Text = input}/>
					<button onClick = {this.save}><FaSave/></button>
				</form>
			</div>
		)
	}
	
	renderDisplay() {
		return (
			<div className="note">
				<p>Learn React</p>
				<span>
					<button onClick={this.edit}  id="edit" ><FaWrench/></button>
					<button onClick={this.remove} id="remove"><FaTrash/></button>
				</span>
			</div>
		)
	}

	render(){
		return this.state.editing? this.renderForm() : this.renderDisplay()
		}
}

export default Note