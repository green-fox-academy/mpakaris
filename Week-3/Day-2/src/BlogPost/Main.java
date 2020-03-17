package BlogPost;

public class Main {
    public static void main(String[] args) {

        // BlogPost: 1
        System.out.println();
        String name1 = "John Doe";
        String title1 = "Lorem Ipsum";
        String text1 = "Lorem ipsum dolor sit amet.";
        String publicationDate1 = "2000.05.04.";
        BlogPost blogPost1 = new BlogPost(name1, title1, text1, publicationDate1);
        System.out.println(title1 + " titled by " + name1 + " posted at " + publicationDate1);
        System.out.println(text1);
        // BlogPost: 2
        System.out.println();
        String name2 =  "Tim Urban";
        String title2 = "Wait but why";
        String text2 = "A popular long-form, stick-figure-illustrated blog about almost everything.";
        String publicationDate2 = "2010.10.10.";
        BlogPost blogPost2 = new BlogPost(name2, title2, text2, publicationDate2);
        System.out.println(title2 + " titled by " + name2 + " posted at " + publicationDate2);
        System.out.println(text2);
        // BlogPost: 3
        System.out.println();
        String name3 = "William Turton";
        String title3 = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        String text3 = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";
        String publicationDate3 = "2017.03.28.";
        BlogPost blogPost3 = new BlogPost(name3, title3, text3, publicationDate3);
        System.out.println(title3 + " titles by " + name3 + " at " + publicationDate3);
        System.out.println(text3);








    }
}
