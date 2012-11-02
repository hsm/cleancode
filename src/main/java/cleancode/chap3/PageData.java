package cleancode.chap3;

/**
 */
public interface PageData {
    WikiPage getWikiPage();

    boolean hasAttribute(String attribute);

    String getContent();

    void setContent(String content);

    String getHtml();
}
