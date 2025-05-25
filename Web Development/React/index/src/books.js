const Books = ({ books }) => {

  const filteredBooks = books.filter(book => book.marks > 70);

  return (
    <>

     <h2>All Students</h2>

     <ul>
      {books.map((books) =>
      <li key={books.id}>
       <p> {books.name}</p>
       <p>{books.marks}</p>
      </li>
      )}

     </ul>

      <h1>Students with Marks Greater Than 70</h1>

      <ul>
        {filteredBooks.map((book) => (
          <li key={book.id}>
            <p>Name: {book.name}</p>
            <p>Marks: {book.marks}</p>
          </li>
        ))}
      </ul>
    </>
  );
};

export default Books;
