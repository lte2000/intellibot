/* Jumptap's products may be patented under one or more of the patents listed at www.jumptap.com/intellectual-property */
package com.millennialmedia.intellibot.psi;

import junit.framework.TestCase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static com.millennialmedia.intellibot.psi.RobotLexer.*;

/**
 * @author mrubino
 */
public class RobotLexerTest extends TestCase {

    public void testParse() {
        String data = getData("C:\\Users\\mrubino\\hack\\intellibot\\test_resource\\test_feature.robot");

        RobotLexer lexer = new RobotLexer(new RobotKeywordProvider());
        lexer.start(data);
        assertState(lexer, IN_SETTINGS_HEADER, "*** Settings ***", RobotTokenTypes.HEADING);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "# fun things going on here", RobotTokenTypes.COMMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_ARG_SETTING, "Documentation", RobotTokenTypes.SETTING);
        lexer.advance();
        assertState(lexer, IN_ARG_SETTING, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "Test the account dashboard", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "Resource", RobotTokenTypes.IMPORT);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "kyle/web/db_advertiser_actions.txt", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "Resource", RobotTokenTypes.IMPORT);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "kyle/web/db_campaign_actions.txt", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "Resource", RobotTokenTypes.IMPORT);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "kyle/web/db_staff_actions.txt", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "Resource", RobotTokenTypes.IMPORT);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "kyle/web/ui_login_page.txt", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "Resource", RobotTokenTypes.IMPORT);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "kyle/web/ui_manage_accounts_page.txt", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "Resource", RobotTokenTypes.IMPORT);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "kyle_db_cleanup/kyle_cleanup.txt", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "Library", RobotTokenTypes.IMPORT);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "Selenium2Library  timeout=${ENV['selenium']['timeout']}  implicit_wait=${ENV['selenium']['implicit_wait']}", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "Library", RobotTokenTypes.IMPORT);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "db.orm.Orm", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "Library", RobotTokenTypes.IMPORT);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "OperatingSystem", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "Library", RobotTokenTypes.IMPORT);
        lexer.advance();
        assertState(lexer, IN_IMPORT, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "Collections", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_ARG_SETTING, "Force Tags", RobotTokenTypes.SETTING);
        lexer.advance();
        assertState(lexer, IN_ARG_SETTING, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "Kyle  Advertiser  Dashboard  Component", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_SETTINGS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_CASES_HEADER, "*** Test Cases ***", RobotTokenTypes.HEADING);
        lexer.advance();
        assertState(lexer, IN_TEST_CASES_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_CASES_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "Scenario: An admin can see the conversion trend", RobotTokenTypes.TC_KW_NAME);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_ARG_TEST_DEF, "[Tags]", RobotTokenTypes.BRACKET_SETTING);
        lexer.advance();
        assertState(lexer, IN_ARG_TEST_DEF, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "Was Flickering", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, "[Setup]", RobotTokenTypes.BRACKET_SETTING);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "Prepare advertiser \"Robot_Company\"", RobotTokenTypes.KEYWORD);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "    ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, "Given", RobotTokenTypes.GHERKIN);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, " ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "Advertiser has performance data", RobotTokenTypes.KEYWORD);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "    ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, "And", RobotTokenTypes.GHERKIN);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, " ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "I have an Account Manager  MANAGER", RobotTokenTypes.KEYWORD);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "    ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, "When", RobotTokenTypes.GHERKIN);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, " ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "I login to Tapmatch as Staff  ${ACCOUNT_MANAGER.user.name}  ${ACCOUNT_MANAGER.user.password}", RobotTokenTypes.KEYWORD);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "    ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, "Then", RobotTokenTypes.GHERKIN);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, " ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "The 7-day average should be  $0.09", RobotTokenTypes.KEYWORD);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, "[Teardown]", RobotTokenTypes.BRACKET_SETTING);
        lexer.advance();
        assertState(lexer, IN_KEYWORD, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "Run Keywords  Close All Browsers  Clean Database", RobotTokenTypes.KEYWORD);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_KEYWORDS_HEADER, "*** Keywords ***", RobotTokenTypes.HEADING);
        lexer.advance();
        assertState(lexer, IN_KEYWORDS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_KEYWORDS_HEADER, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "Clean Database", RobotTokenTypes.TC_KW_NAME);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_ARG_TEST_DEF, "[Documentation]", RobotTokenTypes.BRACKET_SETTING);
        lexer.advance();
        assertState(lexer, IN_ARG_TEST_DEF, "  ", RobotTokenTypes.WHITESPACE);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "Cleans the database", RobotTokenTypes.ARGUMENT);
        lexer.advance();
        assertState(lexer, IN_TEST_DEF, "\n", RobotTokenTypes.WHITESPACE);
        lexer.advance();
//        assertState(lexer, IN_TEST_DEF, "Clean Kyle", RobotTokenTypes.KEYWORD);
//        lexer.advance();
//        assertState(lexer, IN_TEST_DEF, "Clean  Ike", RobotTokenTypes.KEYWORD);
//        lexer.advance();
    }

    private static void assertState(RobotLexer lexer, int state, String data, RobotElementType token) {
        assertEquals("Data", data, lexer.getBufferSequence().subSequence(lexer.getTokenStart(), lexer.getTokenEnd()));
        assertEquals("State", state, lexer.getState());
        assertEquals("Token", token, lexer.getTokenType());
    }

    private String getData(String file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            String ls = System.getProperty("line.separator");

            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString().replace("\r", "");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
