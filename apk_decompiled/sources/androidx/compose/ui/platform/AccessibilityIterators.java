package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.dq;
import defpackage.q10;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AccessibilityIterators {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;
        private final int[] segment = new int[2];
        protected String text;

        public final int[] getRange(int i, int i2) {
            if (i < 0 || i2 < 0 || i == i2) {
                return null;
            }
            int[] iArr = this.segment;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }

        public final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            q10.H("text");
            throw null;
        }

        public void initialize(String str) {
            setText(str);
        }

        public final void setText(String str) {
            this.text = str;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface TextSegmentIterator {
        int[] following(int i);

        int[] preceding(int i);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        private static CharacterTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int length = getText().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    q10.H("impl");
                    throw null;
                }
                boolean isBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.impl;
                if (isBoundary) {
                    if (breakIterator2 == null) {
                        q10.H("impl");
                        throw null;
                    }
                    int following = breakIterator2.following(i);
                    if (following == -1) {
                        return null;
                    }
                    return getRange(i, following);
                }
                if (breakIterator2 == null) {
                    q10.H("impl");
                    throw null;
                }
                i = breakIterator2.following(i);
            } while (i != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator != null) {
                breakIterator.setText(str);
            } else {
                q10.H("impl");
                throw null;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            do {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    q10.H("impl");
                    throw null;
                }
                boolean isBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.impl;
                if (isBoundary) {
                    if (breakIterator2 == null) {
                        q10.H("impl");
                        throw null;
                    }
                    int preceding = breakIterator2.preceding(i);
                    if (preceding == -1) {
                        return null;
                    }
                    return getRange(preceding, i);
                }
                if (breakIterator2 == null) {
                    q10.H("impl");
                    throw null;
                }
                i = breakIterator2.preceding(i);
            } while (i != -1);
            return null;
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            public final CharacterTextSegmentIterator getInstance(Locale locale) {
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.instance;
                characterTextSegmentIterator.getClass();
                return characterTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, dq dqVar) {
            this(locale);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        private static LineTextSegmentIterator lineInstance;
        private TextLayoutResult layoutResult;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        public /* synthetic */ LineTextSegmentIterator(dq dqVar) {
            this();
        }

        private final int getLineEdgeIndex(int i, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                q10.H("layoutResult");
                throw null;
            }
            int lineStart = textLayoutResult.getLineStart(i);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                q10.H("layoutResult");
                throw null;
            }
            ResolvedTextDirection paragraphDirection = textLayoutResult2.getParagraphDirection(lineStart);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (resolvedTextDirection != paragraphDirection) {
                if (textLayoutResult3 != null) {
                    return textLayoutResult3.getLineStart(i);
                }
                q10.H("layoutResult");
                throw null;
            }
            if (textLayoutResult3 != null) {
                return TextLayoutResult.getLineEnd$default(textLayoutResult3, i, false, 2, null) - 1;
            }
            q10.H("layoutResult");
            throw null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int i2;
            if (getText().length() <= 0 || i >= getText().length()) {
                return null;
            }
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (i < 0) {
                if (textLayoutResult == null) {
                    q10.H("layoutResult");
                    throw null;
                }
                i2 = textLayoutResult.getLineForOffset(0);
            } else {
                if (textLayoutResult == null) {
                    q10.H("layoutResult");
                    throw null;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i);
                i2 = getLineEdgeIndex(lineForOffset, DirectionStart) == i ? lineForOffset : lineForOffset + 1;
            }
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                q10.H("layoutResult");
                throw null;
            }
            if (i2 >= textLayoutResult2.getLineCount()) {
                return null;
            }
            return getRange(getLineEdgeIndex(i2, DirectionStart), getLineEdgeIndex(i2, DirectionEnd) + 1);
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult) {
            setText(str);
            this.layoutResult = textLayoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int i2;
            if (getText().length() <= 0 || i <= 0) {
                return null;
            }
            int length = getText().length();
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (i > length) {
                if (textLayoutResult == null) {
                    q10.H("layoutResult");
                    throw null;
                }
                i2 = textLayoutResult.getLineForOffset(getText().length());
            } else {
                if (textLayoutResult == null) {
                    q10.H("layoutResult");
                    throw null;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i);
                i2 = getLineEdgeIndex(lineForOffset, DirectionEnd) + 1 == i ? lineForOffset : lineForOffset - 1;
            }
            if (i2 < 0) {
                return null;
            }
            return getRange(getLineEdgeIndex(i2, DirectionStart), getLineEdgeIndex(i2, DirectionEnd) + 1);
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.lineInstance;
                lineTextSegmentIterator.getClass();
                return lineTextSegmentIterator;
            }

            private Companion() {
            }
        }

        private LineTextSegmentIterator() {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        private static PageTextSegmentIterator pageInstance;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;
        private Rect tempRect;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }

        private final int getLineEdgeIndex(int i, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            if (textLayoutResult == null) {
                q10.H("layoutResult");
                throw null;
            }
            int lineStart = textLayoutResult.getLineStart(i);
            TextLayoutResult textLayoutResult2 = this.layoutResult;
            if (textLayoutResult2 == null) {
                q10.H("layoutResult");
                throw null;
            }
            ResolvedTextDirection paragraphDirection = textLayoutResult2.getParagraphDirection(lineStart);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (resolvedTextDirection != paragraphDirection) {
                if (textLayoutResult3 != null) {
                    return textLayoutResult3.getLineStart(i);
                }
                q10.H("layoutResult");
                throw null;
            }
            if (textLayoutResult3 != null) {
                return TextLayoutResult.getLineEnd$default(textLayoutResult3, i, false, 2, null) - 1;
            }
            q10.H("layoutResult");
            throw null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            int lineCount;
            if (getText().length() <= 0 || i >= getText().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    q10.H("node");
                    throw null;
                }
                androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int round = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                if (i <= 0) {
                    i = 0;
                }
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    q10.H("layoutResult");
                    throw null;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    q10.H("layoutResult");
                    throw null;
                }
                float lineTop = textLayoutResult2.getLineTop(lineForOffset) + round;
                TextLayoutResult textLayoutResult3 = this.layoutResult;
                if (textLayoutResult3 == null) {
                    q10.H("layoutResult");
                    throw null;
                }
                if (textLayoutResult3 == null) {
                    q10.H("layoutResult");
                    throw null;
                }
                float lineTop2 = textLayoutResult3.getLineTop(textLayoutResult3.getLineCount() - 1);
                TextLayoutResult textLayoutResult4 = this.layoutResult;
                if (lineTop < lineTop2) {
                    if (textLayoutResult4 == null) {
                        q10.H("layoutResult");
                        throw null;
                    }
                    lineCount = textLayoutResult4.getLineForVerticalPosition(lineTop);
                } else {
                    if (textLayoutResult4 == null) {
                        q10.H("layoutResult");
                        throw null;
                    }
                    lineCount = textLayoutResult4.getLineCount();
                }
                return getRange(i, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult, SemanticsNode semanticsNode) {
            setText(str);
            this.layoutResult = textLayoutResult;
            this.node = semanticsNode;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int i2;
            if (getText().length() <= 0 || i <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.node;
                if (semanticsNode == null) {
                    q10.H("node");
                    throw null;
                }
                androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                int round = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                int length = getText().length();
                if (length <= i) {
                    i = length;
                }
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (textLayoutResult == null) {
                    q10.H("layoutResult");
                    throw null;
                }
                int lineForOffset = textLayoutResult.getLineForOffset(i);
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    q10.H("layoutResult");
                    throw null;
                }
                float lineTop = textLayoutResult2.getLineTop(lineForOffset) - round;
                if (lineTop > 0.0f) {
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    if (textLayoutResult3 == null) {
                        q10.H("layoutResult");
                        throw null;
                    }
                    i2 = textLayoutResult3.getLineForVerticalPosition(lineTop);
                } else {
                    i2 = 0;
                }
                if (i == getText().length() && i2 < lineForOffset) {
                    i2++;
                }
                return getRange(getLineEdgeIndex(i2, DirectionStart), i);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.pageInstance;
                pageTextSegmentIterator.getClass();
                return pageTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ PageTextSegmentIterator(dq dqVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        private static ParagraphTextSegmentIterator instance;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ ParagraphTextSegmentIterator(dq dqVar) {
            this();
        }

        private final boolean isEndBoundary(int i) {
            if (i <= 0 || getText().charAt(i - 1) == '\n') {
                return false;
            }
            return i == getText().length() || getText().charAt(i) == '\n';
        }

        private final boolean isStartBoundary(int i) {
            if (getText().charAt(i) != '\n') {
                return i == 0 || getText().charAt(i - 1) == '\n';
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int[] following(int i) {
            int length = getText().length();
            if (length <= 0 || i >= length) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            while (i < length && getText().charAt(i) == '\n' && !isStartBoundary(i)) {
                i++;
            }
            int i2 = i + 1;
            while (i2 < length && !isEndBoundary(i2)) {
                i2++;
            }
            return getRange(i, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            while (i > 0 && getText().charAt(i - 1) == '\n' && !isEndBoundary(i)) {
                i--;
            }
            int i2 = i - 1;
            while (i2 > 0 && !isStartBoundary(i2)) {
                i2--;
            }
            return getRange(i2, i);
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.instance;
                paragraphTextSegmentIterator.getClass();
                return paragraphTextSegmentIterator;
            }

            private Companion() {
            }
        }

        private ParagraphTextSegmentIterator() {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        private static WordTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        private final boolean isEndBoundary(int i) {
            if (i <= 0 || !isLetterOrDigit(i - 1)) {
                return false;
            }
            return i == getText().length() || !isLetterOrDigit(i);
        }

        private final boolean isLetterOrDigit(int i) {
            if (i < 0 || i >= getText().length()) {
                return false;
            }
            return Character.isLetterOrDigit(getText().codePointAt(i));
        }

        private final boolean isStartBoundary(int i) {
            if (isLetterOrDigit(i)) {
                return i == 0 || !isLetterOrDigit(i - 1);
            }
            return false;
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i) {
            if (getText().length() <= 0 || i >= getText().length()) {
                return null;
            }
            if (i < 0) {
                i = 0;
            }
            while (!isLetterOrDigit(i) && !isStartBoundary(i)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    q10.H("impl");
                    throw null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                q10.H("impl");
                throw null;
            }
            int following = breakIterator2.following(i);
            if (following == -1 || !isEndBoundary(following)) {
                return null;
            }
            return getRange(i, following);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator != null) {
                breakIterator.setText(str);
            } else {
                q10.H("impl");
                throw null;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i) {
            int length = getText().length();
            if (length <= 0 || i <= 0) {
                return null;
            }
            if (i > length) {
                i = length;
            }
            while (i > 0 && !isLetterOrDigit(i - 1) && !isEndBoundary(i)) {
                BreakIterator breakIterator = this.impl;
                if (breakIterator == null) {
                    q10.H("impl");
                    throw null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.impl;
            if (breakIterator2 == null) {
                q10.H("impl");
                throw null;
            }
            int preceding = breakIterator2.preceding(i);
            if (preceding == -1 || !isStartBoundary(preceding)) {
                return null;
            }
            return getRange(preceding, i);
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            public final WordTextSegmentIterator getInstance(Locale locale) {
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.instance;
                wordTextSegmentIterator.getClass();
                return wordTextSegmentIterator;
            }

            private Companion() {
            }
        }

        public /* synthetic */ WordTextSegmentIterator(Locale locale, dq dqVar) {
            this(locale);
        }
    }
}
