import React from 'react'

const Header = (props) => {
  return (
    <div className='h-16 px-5 bg-green-500 flex items-center justify-between'>
        <h2>{props.user}</h2>
        <div className='flex gap-8 '>
            <h4>About</h4>
            <h4>Career</h4>
            <h4>Blog</h4>
            <h4>{props.edi}</h4>

        </div>
      
    </div>
  )
}

export default Header
