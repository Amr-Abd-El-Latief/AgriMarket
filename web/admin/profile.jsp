<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Site made with Mobirise Website Builder v2.9, https://mobirise.com -->
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="generator" content="Mobirise v2.9, mobirise.com">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" href="../AgriMarket/assets/images/untitled-382x276-65.png" type="image/x-icon">
        <meta name="description" content="">
        <title>Profile</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:700,400&amp;subset=cyrillic,latin,greek,vietnamese">
        <link rel="stylesheet" href="../AgriMarket/assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="../AgriMarket/assets/mobirise/css/style.css">
        <link rel="stylesheet" href="../AgriMarket/assets/mobirise/css/mbr-additional.css" type="text/css">
        <style>
            .div-table{
                display:table;         
                width:auto;         
                background-color:#eee;         
                border:1px solid  #666666;         
                border-spacing:5px;/*cellspacing:poor IE support for  this*/
            }
            .div-table-row{
                display:table-row;
                width:50px;
                clear:both;
            }
            .div-table-col{
                float:left;/*fix for  buggy browsers*/
                display:table-column;         
                width:80px;         
                background-color:#ccc;  
            }
            .mbr-section__container--middle {
    padding-bottom: 15px;
}
        </style>


    </head>
    <body>
        <section class="engine"><a rel="external" href="https://mobirise.com">Mobirise mac website builder
            </a></section>
        <section class="mbr-navbar mbr-navbar--freeze mbr-navbar--absolute mbr-navbar--transparent mbr-navbar--sticky mbr-navbar--auto-collapse" id="menu-22">
            <div class="mbr-navbar__section mbr-section">
                <div class="mbr-section__container container">
                    <div class="mbr-navbar__container">
                        <div class="mbr-navbar__column mbr-navbar__column--s mbr-navbar__brand">
                            <span class="mbr-navbar__brand-link mbr-brand mbr-brand--inline">
                                <span class="mbr-brand__logo"><a href="index.jsp"><img class="mbr-navbar__brand-img mbr-brand__img" src="../AgriMarket/assets/images/untitled-382x276-11.png" alt="AgriMarket" title="Flower Shop"></a></span>
                                <span class="mbr-brand__name"><a class="mbr-brand__name text-white" href="index.jsp">AGRIMARKET</a></span>
                            </span>
                        </div>
                        <div class="mbr-navbar__hamburger mbr-hamburger text-white"><span class="mbr-hamburger__line"></span></div>
                        <div class="mbr-navbar__column mbr-navbar__menu">
                            <nav class="mbr-navbar__menu-box mbr-navbar__menu-box--inline-right">
                                <div class="mbr-navbar__column"><ul class="mbr-navbar__items mbr-navbar__items--right mbr-buttons mbr-buttons--freeze mbr-buttons--right btn-decorator mbr-buttons--active"><li class="mbr-navbar__item"><a class="mbr-buttons__link btn text-white" href="index.jsp">HOME</a></li> <li class="mbr-navbar__item"><a class="mbr-buttons__link btn text-white" href="about.jsp">ABOUT</a></li> <li class="mbr-navbar__item"><a class="mbr-buttons__link btn text-white" href="contact_us.jsp">CONTACT</a></li></ul></div>
                                <div class="mbr-navbar__column"><ul class="mbr-navbar__items mbr-navbar__items--right mbr-buttons mbr-buttons--freeze mbr-buttons--right btn-inverse mbr-buttons--active"><li class="mbr-navbar__item"><a class="mbr-buttons__btn btn btn-default" href="profile.jsp">${requestScope.user.userName}</a></li></ul></div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="mbr-section mbr-section--relative mbr-after-navbar" id="msg-box4-32" style="background-color: rgb(26, 188, 156);">

            <div class="mbr-section__container mbr-section__container--isolated container">
                <div class="row">
                    <div class="mbr-box__magnet mbr-box__magnet--top-left mbr-section__left col-sm-6">

                        <figure class="mbr-figure mbr-figure--adapted mbr-figure--caption-inside-bottom ">
                            <img class="mbr-figure__img"  src="${pageContext.servletContext.contextPath }/LoadImageServlet?param1=${requestScope.user.email}" style="width: 59%;">
                            <h3 class="mbr-figure__caption" style="width: 59%;">${requestScope.user.userName}</h3>
                        </figure>

                    </div>
                    <div class="mbr-box__magnet mbr-class-mbr-box__magnet--center-left col-sm-6 mbr-section__right">
                        <div class="mbr-section__container mbr-section__container--middle">
                            <div class="mbr-article mbr-article--auto-align mbr-article--wysiwyg">
                                <h2><strong>${requestScope.user.job}</strong></h2>    
                            </div>
                        </div>
                        <div class="mbr-section__container mbr-section__container--middle">
                            <div class="mbr-article mbr-article--auto-align mbr-article--wysiwyg">
                                <h2><strong>40 years old</strong></h2>    
                            </div>
                        </div>
                        <div class="mbr-section__container mbr-section__container--middle">
                            <div class="mbr-article mbr-article--auto-align mbr-article--wysiwyg">
                                <h2><strong>${requestScope.user.email}</strong></h2>    
                            </div>
                        </div>
                        <div class="mbr-section__container mbr-section__container--middle">
                            <div class="mbr-article mbr-article--auto-align mbr-article--wysiwyg">
                                <h2><strong>01297397483653</strong></h2>    
                            </div>
                        </div>
                        <div class="mbr-section__container mbr-section__container--middle">
                            <div class="mbr-article mbr-article--auto-align mbr-article--wysiwyg">
                                <h2><strong>${requestScope.user.address}</strong></h2>    
                            </div>
                        </div>
                        <div class="mbr-section__container mbr-section__container--middle">
                            <div class="mbr-article mbr-article--auto-align mbr-article--wysiwyg">
                                <h2><strong>Interested in:</strong></h2>
                               <c:forEach items="${requestScope.user.interests}" var="interest">
                                   ${interest}
                                </c:forEach>
                            </div>
                        </div>


                        <!--  <div class="mbr-section__container mbr-section__container--middle">
                                 <div class="mbr-article mbr-article--auto-align mbr-article--wysiwyg">
                                     <h2><strong>Interested in:</strong></h2> <div class="mbr-plan__details">
                                         <ul>
                        <c:forEach items="${requestScope.user.interests}" var="interest">
                            <li><strong>${interest}</strong></li>
                        </c:forEach>
            </ul></div>
    </div>
</div>-->

                    </div>

                    <div class="mbr-arrow mbr-arrow--floating text-center">
                        <div class="mbr-section__container container">
                            <a class="mbr-arrow__link" href="#pricing-table1-2"><i class="glyphicon glyphicon-menu-down"></i></a>
                        </div>
                    </div> 

                </div>
            </div>
        </div>
    </section>
    <!--- class="mbr-section mbr-section--relative mbr-section--fixed-size mbr-parallax-background" -->

    <section  class="mbr-section mbr-section--relative mbr-after-navbar"  id="pricing-table1-1" style="background-color: rgb(26, 188, 156);"  >
        <!---   <div class="mbr-overlay" style="opacity: 0.5;"></div>-->
        <div class="mbr-section__container mbr-section__container--std-top-padding container" id="pricing-table1-2">
            <div class="row">
                <c:forEach items="${requestScope.user.orders}" var="order">

                    <c:if test="${order.status.equals('delivery')}">
                        <div class="mbr-plan col-xs-12 mbr-plan--success col-md-3 col-sm-6">
                            <div class="mbr-plan__box">
                                <div class="mbr-plan__header">
                                    <div class="mbr-header mbr-header--reduce mbr-header--center mbr-header--wysiwyg">
                                        <h3 class="mbr-header__text">ORDER ${order.date}</h3>
                                    </div>
                                </div>
                                <div class="mbr-plan__number">
                                    <div class="mbr-number mbr-number--price">
                                        <div class="mbr-number__num">
                                            <div class="mbr-number__group">
                                                <sup class="mbr-number__left">$</sup><span class="mbr-number__value">${order.total}</span>
                                            </div>
                                        </div>
                                        <div class="mbr-number__caption">received</div>
                                    </div>
                                </div>
                                <!--- class="mbr-plan__details" <ul><li><strong>Unlimited</strong> Storage</li><li><strong>Unlimited</strong> Users</li><li><strong>1 TB</strong> Bandwidth</li></ul>--->
                                <center>
                                    <div class="mbr-plan__details" >

                                        <div class="div-table">
                                            <div class="div-table-row">
                                                <div class="div-table-col" align="center">Product</div>
                                                <div  class="div-table-col">Price</div>
                                                <div  class="div-table-col">Quantity</div>
                                            </div>
                                            <c:forEach items="${order.products}" var="product">     
                                                <div class="div-table-row">
                                                    <div class="div-table-col">${product.name}</div>
                                                    <div class="div-table-col">${product.price}</div>
                                                    <div class="div-table-col">${product.quantity}</div>
                                                </div>
                                            </c:forEach> 
                                        </div>
                                    </div>
                                </center>
                            </div>
                        </div>
                    </c:if>

                    <c:if test="${order.status.equals('incart')}">
                        <div class="mbr-plan col-xs-12 mbr-plan--danger mbr-plan--favorite col-md-3 col-sm-6">
                            <div class="mbr-plan__box">
                                <div class="mbr-plan__header">
                                    <div class="mbr-header mbr-header--reduce mbr-header--center mbr-header--wysiwyg">
                                        <h3 class="mbr-header__text">ORDER ${order.date}</h3>
                                    </div>
                                </div>
                                <div class="mbr-plan__number">
                                    <div class="mbr-number mbr-number--price">
                                        <div class="mbr-number__num">
                                            <div class="mbr-number__group">
                                                <sup class="mbr-number__left">$</sup><span class="mbr-number__value">${order.total}</span>
                                            </div>
                                        </div>
                                        <div class="mbr-number__caption">not received yet</div>
                                    </div>
                                </div>
                                <!--- class="mbr-plan__details" <ul><li><strong>Unlimited</strong> Storage</li><li><strong>Unlimited</strong> Users</li><li><strong>1 TB</strong> Bandwidth</li></ul>--->
                                <center>
                                    <div class="mbr-plan__details" >

                                        <div class="div-table">
                                            <div class="div-table-row">
                                                <div class="div-table-col" align="center">Product</div>
                                                <div  class="div-table-col">Price</div>
                                                <div  class="div-table-col">Quantity</div>
                                            </div>
                                            <c:forEach items="${order.products}" var="product">     
                                                <div class="div-table-row">
                                                    <div class="div-table-col">${product.name}</div>
                                                    <div class="div-table-col">${product.price}</div>
                                                    <div class="div-table-col">${product.quantity}</div>
                                                </div>
                                            </c:forEach> 
                                        </div>
                                    </div>
                                </center>
                            </div>
                        </div>
                    </c:if>

                </c:forEach>
            </div>
        </div>
    </section>




    <script src="../AgriMarket/assets/web/assets/jquery/jquery.min.js"></script>
    <script src="../AgriMarket/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="../AgriMarket/assets/smooth-scroll/SmoothScroll.js"></script>
    <script src="../AgriMarket/assets/mobirise/js/script.js"></script>
    <script src="../AgriMarket/assets/jarallax/jarallax.js"></script>

</body>
</html>