package com.mercadolibre.dojos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the dojo.
 */
public class DojoTest {

	@Before
	public void setup() {

	}

	@Test
	public void test_case_00() {

		Presenter presenter = new TableroPresenter();
		Tablero tablero = new Tablero(presenter);

		String render = tablero.render();

		assert render.equals("soy un tablero vacio");
	}

	@Test
	public void given_an_empty_board_player_O_marks_upperleft_corner_and_gets_a_message_saying_the_game_status() {

		Presenter presenter = new TableroPresenter();
		Tablero tablero = new Tablero(presenter);
		Jugada jugada = new Jugada("upperLeft", "O");
		Juego juego = new Juego(tablero);

		String status = juego.play(jugada);

		assert status.equals("upperLeft - O");
	}




	//given_an_empty_board_player_O_marks_upperleft_corner_and_gets_a_message_saying_the_game_status
	//given_a_board_maker_with_O_in_upperleft_corner_player_X_marks_the_uppermiddle_and_gets_a_message_saying_the_game_status
	//given_a_board_maker_with_O_in_upperleft_corner_player_X_tries_to_mark_upperleft_and_gets_a_message_saying_the_game_status
	//given_a_board_with_two_fields_in_a_row_maked_by_player_O_when_O_marks_the_remaining_field_wins_the_game
	//given_a_board_with_two_fields_in_a_column_maked_by_player_O_when_O_marks_the_remaining_field_wins_the_game
	//given_a_board_with_two_fields_in_a_diagonal_maked_by_player_O_when_O_marks_the_remaining_field_wins_the_game
	//given_a_complete_board_without_rows_columns_or_diagonals_completed_by_a_player_returns_a_draw
	//extra: que nos corte el juego si no se puede ganar de ninguna manera, antes de llegar al final
	//Si un jugador marca el tablero, e inmediatamente trata de marcarlo sin que el otro jugador haya hecho una marca, entonces deberiam recibir un mensaje de que espere su turno.

}
