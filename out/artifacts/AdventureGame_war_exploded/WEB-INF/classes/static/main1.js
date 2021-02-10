(function () {
    "use strict";

    function activateCarousel() {
        console.log($(".carousel-images").eq(0).parent())
        $(".carousel-images").eq(0).parent().addClass("active")
    }

    activateCarousel();



})();