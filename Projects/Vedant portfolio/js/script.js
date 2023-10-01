const hamburger = document.querySelector('.hamburger');
const mobileNav = document.querySelector('.mobile-nav');
const overlay = document.querySelector('.overlay');
const contactForm = document.querySelector('#contact-form');
const loader = document.querySelector('.lds-ripple');
const circles = document.querySelectorAll('.lds-ripple div');


hamburger.addEventListener('click', () => {
  mobileNav.classList.toggle('active');
  hamburger.classList.toggle('active');
  overlay.classList.toggle('active');
});

function closeMobileNav(){
  mobileNav.classList.remove('active');
  hamburger.classList.remove('active');
  overlay.classList.remove('active');
}

overlay.addEventListener("click", closeMobileNav);


// auto typing text
var typeData = new Typed(".role", {
    strings: [
      "Frontend Developer",
      "Backend Developer",
      "Problem Solver",
      "Java programmer",
      "Tech Enthusiast",
    ],
    loop: true,
    typeSpeed: 100,
    backSpeed: 80,
    backDelay: 1000,
  });

