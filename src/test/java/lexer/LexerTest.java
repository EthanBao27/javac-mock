package lexer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testCode.TestCode;

import java.util.List;

class LexerTest {

	@Test
	public void test() {
		/*
			public class HelloWorld {
				public static void main(String[] args) {
					System.out.println("Hello World!");
				}
			}
			""";
		 */
		var expectedTokens = List.of(
				new Token(TokenKind.PUBLIC, "public"),
				new Token(TokenKind.CLASS, "class"),
				new Token(TokenKind.IDENTIFIER, "HelloWorld"),
				new Token(TokenKind.LBRACE, "{"),
				new Token(TokenKind.PUBLIC, "public"),
				new Token(TokenKind.STATIC, "static"),
				new Token(TokenKind.VOID, "void"),
				new Token(TokenKind.IDENTIFIER, "main"),
				new Token(TokenKind.LPAREN, "("),
				new Token(TokenKind.IDENTIFIER, "String"),
				new Token(TokenKind.LBRACKET, "["),
				new Token(TokenKind.RBRACKET, "]"),
				new Token(TokenKind.IDENTIFIER, "args"),
				new Token(TokenKind.RPAREN, ")"),
				new Token(TokenKind.LBRACE, "{"),
				new Token(TokenKind.IDENTIFIER, "System"),
				new Token(TokenKind.DOT, "."),
				new Token(TokenKind.IDENTIFIER, "out"),
				new Token(TokenKind.DOT, "."),
				new Token(TokenKind.IDENTIFIER, "println"),
				new Token(TokenKind.LPAREN, "("),
				new Token(TokenKind.STRING_LITERAL, "Hello World!"),
				new Token(TokenKind.RPAREN, ")"),
				new Token(TokenKind.SEMI_COLON, ";"),
				new Token(TokenKind.RBRACE, "}"),
				new Token(TokenKind.RBRACE, "}"),
				new Token(TokenKind.EOF, "")
		);
		var lexer = new Lexer(TestCode.HELLO_WORLD.toCharArray());
		for (Token expectedToken : expectedTokens) {
			Assertions.assertEquals(expectedToken, lexer.nextToken());
		}
	}

}

