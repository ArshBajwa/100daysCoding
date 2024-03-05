"use client"
import React, { useState } from 'react'

const page = () => {
   const [marks,setMarks] = useState(80)
     //80 marks ki value hai
   //setMarks is a fucntion and value update ke liye use krte
   //aise change ni hoti value
  // let marks=80;
  // const changeMarks=()=>{
  //   console.log(marks);
  //   marks=20 
  //   console.log(marks);
  // }
  return (
    <>
    <h1 className='font-bold text-xl text-red-600'>hello ji hello my total marks were {marks} </h1>
   <button onClick={()=>{
       setMarks(33)
   }} className='bg-gray-400 px-5 py-23 rounded mt-5 text-white font-bold'>Update</button>
    </>
  )
}


export default page
