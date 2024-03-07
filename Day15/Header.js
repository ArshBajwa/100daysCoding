import React from 'react'
import Link from 'next/link'

const Header = (props) => {
  return (
    <div className='h-16 px-5 text-white bg-red-500 flex'>
        <h2>Logo</h2>
        <div className='flex gap-8 '>
        <Link href='/About'>About</Link>
      <Link href='/Product'>Product</Link>
      <Link href='/Courses'>Courses</Link>

        </div>
      
    </div>
  )
}

export default Header
