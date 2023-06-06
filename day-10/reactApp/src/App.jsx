import { useState, useEffect } from "react";
import axios from "axios";

function App() {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/product").then((res) => {
      setData(res.data);
      // console.log(data);
    });
  }, []);
  return (
    <>
      <div className="container">
        <h1>Product List</h1>
        <div className="row row-cols-4">
          {data.map((el) => (
            <div
              key={el.id}
              className="card col m-2 shadow-sm bg-light "
              style={{ maxWidth: "13rem" }}
            >
              <div className="card-body">
                <ul>
                  <li>{el.name}</li>
                  <li>{el.type}</li>
                  <li>{el.place}</li>
                  <li>{el.warranty}</li>
                </ul>
       
              </div>
            </div>
          ))}
        </div>
       
      </div>
    </>
  );
}

export default App;
