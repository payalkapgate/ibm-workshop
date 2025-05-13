import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

interface GreetingProp{
  name: string;
  city: string;
}
function Greeting({name, city}:GreetingProp) {
  return (
    <>
      <div>
        <h1>Hello {name} from {city}</h1>
      </div>
       
    </>
  )
}
function App(){
  return(
    <>
      <Greeting name="IBMer" city="Banagalore"/>
    </>
  )
  
}

export default App
