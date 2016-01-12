package com.example.labm4.securityunifor.Activity;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.labm4.securityunifor.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_search_board)
public class SearchBoardActivity extends AppCompatActivity {

    @ViewById
    Toolbar toolbar;

    @ViewById
    EditText board;

    @AfterViews
    public void begin() {
        setSupportActionBar(toolbar);

        board.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String board = s.toString();

                if(board.length() > 7)
                    board = board.substring(0, 7);
                if(board.length() == 2)
                    board = board + "-";

            }
        });
        //Botãoa
        //str.replaceAll("-", "");
    }

    private class MaskBoard implements TextWatcher {

        private EditText board;

        public MaskBoard(EditText board) {
            this.board = board;
        }

        public EditText getBoard() {
            return board;
        }

        public void setBoard(EditText board) {
            this.board = board;
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

}
