package androidx.compose.ui.text;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PlatformParagraphStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    public /* synthetic */ PlatformParagraphStyle(int i, boolean z, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? EmojiSupportMatch.Companion.m6915getDefault_3YsG6Y() : i, (i2 & 2) != 0 ? false : z, (dq) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && EmojiSupportMatch.m6910equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
    }

    /* renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name */
    public final int m6988getEmojiSupportMatch_3YsG6Y() {
        return this.emojiSupportMatch;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public int hashCode() {
        return EmojiSupportMatch.m6911hashCodeimpl(this.emojiSupportMatch) + (Boolean.hashCode(this.includeFontPadding) * 31);
    }

    public final PlatformParagraphStyle merge(PlatformParagraphStyle platformParagraphStyle) {
        return platformParagraphStyle == null ? this : platformParagraphStyle;
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.m6912toStringimpl(this.emojiSupportMatch)) + ')';
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlatformParagraphStyle(int i, boolean z, dq dqVar) {
        this(i, z);
    }

    public PlatformParagraphStyle(boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = EmojiSupportMatch.Companion.m6915getDefault_3YsG6Y();
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z, int i, dq dqVar) {
        this((i & 1) != 0 ? false : z);
    }

    public /* synthetic */ PlatformParagraphStyle(int i, dq dqVar) {
        this(i);
    }

    private PlatformParagraphStyle(int i, boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = i;
    }

    private PlatformParagraphStyle(int i) {
        this.includeFontPadding = false;
        this.emojiSupportMatch = i;
    }

    public /* synthetic */ PlatformParagraphStyle(int i, int i2, dq dqVar) {
        this((i2 & 1) != 0 ? EmojiSupportMatch.Companion.m6915getDefault_3YsG6Y() : i, (dq) null);
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.Companion.m6915getDefault_3YsG6Y(), false, (dq) null);
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }
}
