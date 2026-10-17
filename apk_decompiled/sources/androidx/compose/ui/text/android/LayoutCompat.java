package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LayoutCompat {
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_LEFT = 3;
    public static final int ALIGN_NORMAL = 0;
    public static final int ALIGN_OPPOSITE = 1;
    public static final int ALIGN_RIGHT = 4;
    public static final int BREAK_STRATEGY_BALANCED = 2;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
    public static final int BREAK_STRATEGY_SIMPLE = 0;
    public static final int DEFAULT_ALIGNMENT = 0;
    public static final int DEFAULT_BREAK_STRATEGY = 0;
    public static final boolean DEFAULT_FALLBACK_LINE_SPACING = true;
    public static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    public static final boolean DEFAULT_INCLUDE_PADDING = false;
    public static final int DEFAULT_JUSTIFICATION_MODE = 0;
    public static final float DEFAULT_LINESPACING_EXTRA = 0.0f;
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;
    public static final int DEFAULT_LINE_BREAK_STYLE = 0;
    public static final int DEFAULT_LINE_BREAK_WORD_STYLE = 0;
    public static final int DEFAULT_MAX_LINES = Integer.MAX_VALUE;
    public static final int DEFAULT_TEXT_DIRECTION = 2;
    public static final int HYPHENATION_FREQUENCY_FULL = 2;
    public static final int HYPHENATION_FREQUENCY_FULL_FAST = 4;
    public static final int HYPHENATION_FREQUENCY_NONE = 0;
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
    public static final int HYPHENATION_FREQUENCY_NORMAL_FAST = 3;
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    public static final int JUSTIFICATION_MODE_NONE = 0;
    public static final int LINE_BREAK_STYLE_LOOSE = 1;
    public static final int LINE_BREAK_STYLE_NONE = 0;
    public static final int LINE_BREAK_STYLE_NORMAL = 2;
    public static final int LINE_BREAK_STYLE_STRICT = 3;
    public static final int LINE_BREAK_WORD_STYLE_NONE = 0;
    public static final int LINE_BREAK_WORD_STYLE_PHRASE = 1;
    public static final int TEXT_DIRECTION_ANY_RTL_LTR = 4;
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 2;
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 3;
    public static final int TEXT_DIRECTION_LOCALE = 5;
    public static final int TEXT_DIRECTION_LTR = 0;
    public static final int TEXT_DIRECTION_RTL = 1;
    public static final int TEXT_GRANULARITY_CHARACTER = 0;
    public static final int TEXT_GRANULARITY_WORD = 1;
    public static final LayoutCompat INSTANCE = new LayoutCompat();
    private static final Layout.Alignment DEFAULT_LAYOUT_ALIGNMENT = Layout.Alignment.ALIGN_NORMAL;
    private static final TextDirectionHeuristic DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    public static final int $stable = 8;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BreakStrategy {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface HyphenationFrequency {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface JustificationMode {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LineBreakStyle {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LineBreakWordStyle {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextDirection {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextGranularity {
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface TextLayoutAlignment {
    }

    private LayoutCompat() {
    }

    public final Layout.Alignment getDEFAULT_LAYOUT_ALIGNMENT$ui_text() {
        return DEFAULT_LAYOUT_ALIGNMENT;
    }

    public final TextDirectionHeuristic getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text() {
        return DEFAULT_TEXT_DIRECTION_HEURISTIC;
    }
}
