"use client"
import React,{useState} from 'react'
import Header from "@/Components/Header"
const page = () => {
  const [user,setUser] = useState("sartak")
  const [edit,setEditor] = useState("editor ji hi")
  return (
    <>
    <Header user={user} edi={edit}/>
      {user}

      </>
    
  )
}

export default page

