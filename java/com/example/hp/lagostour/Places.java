package com.example.hp.lagostour;


/**
 * {@link Places} represents a vocabulary word that the user wants to learn.
 * It contains a default translation, a Miwok translation, and an image for that word.
 */
public class Places {

    /** Default translation for the word */
    private String mAddressOfPlace;

    /** Miwok translation for the word */
    private String mplacestobe;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Places object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Places(String defaultTranslation, String miwokTranslation) {
        mAddressOfPlace = defaultTranslation;
        mplacestobe = miwokTranslation;
    }

    /**
     * Create a new Places object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Places(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mAddressOfPlace = defaultTranslation;
        mplacestobe = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getAddressOfPlaces() {
        return mAddressOfPlace;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getNameOfPlaces() {
        return mplacestobe;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}