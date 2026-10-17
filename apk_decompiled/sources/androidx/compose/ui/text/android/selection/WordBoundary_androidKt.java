package androidx.compose.ui.text.android.selection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class WordBoundary_androidKt {
    public static final int getWordEnd(WordIterator wordIterator, int i) {
        int punctuationEnd = wordIterator.isAfterPunctuation(wordIterator.nextBoundary(i)) ? wordIterator.getPunctuationEnd(i) : wordIterator.getNextWordEndOnTwoWordBoundary(i);
        return punctuationEnd == -1 ? i : punctuationEnd;
    }

    public static final int getWordStart(WordIterator wordIterator, int i) {
        int punctuationBeginning = wordIterator.isOnPunctuation(wordIterator.prevBoundary(i)) ? wordIterator.getPunctuationBeginning(i) : wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i);
        return punctuationBeginning == -1 ? i : punctuationBeginning;
    }
}
