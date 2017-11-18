package com.example.android.miwok;

/**
 * Created by HP DV6 on 18/11/2017.
 */

/**
 * {@link} Represents a vocabulary word a user wants to learn. It contains a mewok and english translation for that word.
 */
public class Word
{
    private String mDefaultTranslation;
    private String mMewokTranslation;

    public Word(String defaultTranslation, String mewokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMewokTranslation = mewokTranslation;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMewokTranslation() {
        return mMewokTranslation;
    }
}
