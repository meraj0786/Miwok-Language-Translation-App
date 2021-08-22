package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;
    /**
     * Miwok audio for the word
     */
    private int mAudioResourceId;

    /**
     * image resource id
     */
    private int imageResourceId = NO_IMAGE_VALUE;

    private static final int NO_IMAGE_VALUE = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int mimageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        imageResourceId = mimageResourceId;
        mAudioResourceId = audioResourceId;
    }


    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    /**
     * Get the image resource id of the word.
     */
    public int getImageResourceId() { return imageResourceId; }

    public int getmAudioResourceId(){ return mAudioResourceId; }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_VALUE;
    }

}