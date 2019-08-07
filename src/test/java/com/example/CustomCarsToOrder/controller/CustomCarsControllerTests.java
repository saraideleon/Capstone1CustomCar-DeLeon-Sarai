//package com.example.CustomCarsToOrder.controller;
//
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.springframework.test.web.servlet.MockMvc;
//
//@RunWith(MockitoJUnitRunner.class)
//public class CustomCarsControllerTests {
//    private MockMvc mockMvc;
//
//    @Mock
//    CustomCarsServiceImplementation mockCustomCarsServiceImpl;
//
//    @InjectMocks
//    CustomCarsController customCarsController;
//
//    Supplier supplierA;
//    Supplier supplierB;
//    Supplier supplierC;
//    Supplier supplierD;
//    Supplier supplierE;
//
//    Tires tires1;
//    Tires tires2;
//    Tires tires3;
//
//    Brakes brakes1;
//    Brakes brakes2;
//    Brakes brakes3;
//
//    Rims rims1;
//    Rims rims2;
//    Rims rims3;
//
//
//
//    @RunWith(MockitoJUnitRunner.class)
//    public class BookStoreServiceImplementationTests {
//
//        @Mock
//        @Autowired
//        BookRepository bookRepoMock;
//
//        @InjectMocks
//        BookStoreServiceImplementation bookStoreService;
//
//        Book book1;
//        Book book2;
//        Book book3;
//
//
//        Author author1;
//        Author author2;
//
//        List<Book> bookList;
//
//        @Before
//        public void setup(){
//
//            author1 = new Author();
//            author1.setFirstName("Stephen");
//            author1.setLastName("King");
//
//            author2 = new Author();
//            author2.setFirstName("JK");
//            author2.setLastName("Rowling");
//
//            book1 = new Book();
//            book1.setTitle("The Gunslinger");
//            book1.setPublishYear("1982");
//            book1.setAuthor(author1);
//
//            book2 = new Book();
//            book2.setTitle("The Stand");
//            book2.setPublishYear("1978");
//            book2.setAuthor(author1);
//
//
//            book3 = new Book();
//            book3.setTitle("Harry Potter and the Philosopher's Stone");
//            book3.setPublishYear("1997");
//            book3.setAuthor(author2);
//
//            bookList = Arrays.asList(book1, book2, book3);
//        }
//
//
//        @Test
//        public void shouldGetAllBooks(){
//            List<Book> expectedList = Arrays.asList(book1, book2, book3);
//            when(bookRepoMock.findAll()).thenReturn(bookList);
//            assertEquals(expectedList, bookStoreService.getAllBooks());
//        }
//
//        @Test
//        public void shouldGetBooksByTitle(){
//            List<Book> expectedList = Arrays.asList(book3);
//            List<Book> bookList= Arrays.asList(book3);
//            when(bookRepoMock.findByTitle(book3.getTitle())).thenReturn(bookList);
//            assertEquals(expectedList, bookStoreService.getBooksByTitle(book3.getTitle()));
//        }
//
//        @Test
//        public void shouldGetBooksByAuthorLastName(){
//            List<Book> expectedList = Arrays.asList(book1, book2);
//            List<Book> bookList= Arrays.asList(book1, book2);
//            when(bookRepoMock.findByAuthorLastName(book1.getAuthor().getLastName())).thenReturn(bookList);
//            assertEquals(expectedList, bookStoreService.getBooksByAuthorLastName(book1.getAuthor().getLastName()));
//        }
//
//
//
//        @Test
//        public void shouldGetBooksByAuthorFullName(){
//
//        }
//
//
//        @Test
//        public void shouldGetBooksByAuthorLastNameAndYearRangeInclusively(){
//
//        }
//
//        @Test
//        public void shouldGetBooksByAuthorLastNameAndYearRangeExcludingBooksOutsideRange(){
//
//        }
//
//    }
//
//
//
//}
