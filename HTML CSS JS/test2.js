function addBook() {
    const title = prompt("Enter the Book title:");
    const author = prompt("Enter the book author:");
    const description = prompt("Enter short description about the book:");

    if (titel && author && description) {
        const booklist = document.getElementById("book-list");

        const bookCard = document.createElement("div");
        bookCard.classList.add("book-card");

        bookCard.innerHTML = `
        <h2>${title}</h2>
        <p><strong>Author:</strong> ${author}</p>
        <p><strong>Description:</strong> ${description}</p>
      `;
  

        booklist.appendChild(bookCard);
    }
    else {
        alert("Please fill in all fields.")
    }
}

document.getElementById("add-book-btn").addEventListener("click", addBook);