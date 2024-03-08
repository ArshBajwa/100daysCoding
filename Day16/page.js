"use client"
import axios from 'axios'
import React, { useState } from 'react';
const page = () => {
  const [images,setImages]=useState([]);
  const getImages= async()=>{
      try {
        const response=await axios.get("https://picsum.photos/v2/list?page=2&limit=10");
        const data=response.data;
        setImages(data);
        console.log(images);

      } catch (error) {
        console.error("Error Fetching Images");
      }
  };

  return (
    <div>
       <button onClick={getImages}className='px-5 py-3 bg-slate-500 text-white font-bold'>Get Images</button>
       <div className='p-10'>
        
       {images.map((elem,i)=>{
        return <img key={i}
        src={elem.download_url}
        width={300}
        height={300}
        className='m-10 rounded inline-block'
        />
       })}
       </div>
    </div>
  );
};

export default page


