import "./App.css";
import Heading from "./component/Heading";
import Community from "./component/community/Community";
import MainPage from "./component/MainPage";
import Login from "./component/user/Login";
import Signup from "./component/user/Signup";
import Footer from "./component/Footer"
import { Routes, Route } from "react-router-dom";
import ShopPage from "./component/ShopPage";
import GoodsDetailPage from "./component/GoodsDetailPage";
import CartPage from "./component/CartPage";

function App() {
  return (
    <>
      <Heading home="Home" />
      <Routes>
        <Route path="/" element={<MainPage />} />
        <Route path="/shop" element={<ShopPage />} />
        <Route path="/shop/detail/:id" element={<GoodsDetailPage />} />
        <Route path="/cart" element={<CartPage/>} />
        <Route path="/community" element={<Community />} />
        <Route path="/login" element={<Login />} />
        
      </Routes>
      <Footer />
    </>
  );
}

export default App;