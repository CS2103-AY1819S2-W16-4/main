package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_NAME_REVERSE = new Prefix("/n");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_PHONE_REVERSE = new Prefix("/p");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_EMAIL_REVERSE = new Prefix("/e");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_ADDRESS_REVERSE = new Prefix("/a");

    public static final Prefix PREFIX_SKILL = new Prefix("skill/");
    public static final Prefix PREFIX_SKILL_REVERSE = new Prefix("/skill");
    public static final Prefix PREFIX_POS = new Prefix("position/");
    public static final Prefix PREFIX_POS_REVERSE = new Prefix("/position");
    public static final Prefix PREFIX_GPA = new Prefix("g/");
    public static final Prefix PREFIX_GPA_REVERSE = new Prefix("/g");
    public static final Prefix PREFIX_EDUCATION = new Prefix("d/");
    public static final Prefix PREFIX_EDUCATION_REVERSE = new Prefix("/d");

    /* Sort-Word definitions*/
    public static final SortWord SORTWORD_SKILLS = new SortWord("skills");
    public static final SortWord SORTWORD_REVERSE_SKILLS = new SortWord("reverse skills");
    public static final SortWord SORTWORD_NAME = new SortWord("name");
    public static final SortWord SORTWORD_REVERSE_NAME = new SortWord("reverse name");
    public static final SortWord SORTWORD_SURNAME = new SortWord("surname");
    public static final SortWord SORTWORD_REVERSE_SURNAME = new SortWord("reverse surname");
    public static final SortWord SORTWORD_GPA = new SortWord("gpa");
    public static final SortWord SORTWORD_REVERSE_GPA = new SortWord("reverse gpa");
    public static final SortWord SORTWORD_EDUCATION = new SortWord("education");
    public static final SortWord SORTWORD_REVERSE_EDUCATION = new SortWord("reverse education");
}
