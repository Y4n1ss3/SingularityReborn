package androidx.compose.ui.text;

import defpackage.dq;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidTextStyle_androidKt {
    public static final boolean DefaultIncludeFontPadding = false;

    public static final PlatformTextStyle createPlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final PlatformParagraphStyle lerp(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        return platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding() ? platformParagraphStyle : new PlatformParagraphStyle(((EmojiSupportMatch) SpanStyleKt.lerpDiscrete(EmojiSupportMatch.m6907boximpl(platformParagraphStyle.m6988getEmojiSupportMatch_3YsG6Y()), EmojiSupportMatch.m6907boximpl(platformParagraphStyle2.m6988getEmojiSupportMatch_3YsG6Y()), f)).m6913unboximpl(), ((Boolean) SpanStyleKt.lerpDiscrete(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f)).booleanValue(), (dq) null);
    }

    public static final PlatformSpanStyle lerp(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        return platformSpanStyle;
    }
}
