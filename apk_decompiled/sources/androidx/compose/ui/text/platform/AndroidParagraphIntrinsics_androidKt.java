package androidx.compose.ui.text.platform;

import android.text.TextUtils;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import defpackage.o;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidParagraphIntrinsics_androidKt {
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        return !(((platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) ? null : EmojiSupportMatch.m6907boximpl(paragraphStyle.m6988getEmojiSupportMatch_3YsG6Y())) == null ? false : EmojiSupportMatch.m6910equalsimpl0(r1.m6913unboximpl(), EmojiSupportMatch.Companion.m6916getNone_3YsG6Y()));
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA, reason: not valid java name */
    public static final int m7318resolveTextDirectionHeuristicsHklW4sA(int i, LocaleList localeList) {
        Locale locale;
        TextDirection.Companion companion = TextDirection.Companion;
        if (TextDirection.m7502equalsimpl0(i, companion.m7507getContentOrLtrs_7Xco())) {
            return 2;
        }
        if (TextDirection.m7502equalsimpl0(i, companion.m7508getContentOrRtls_7Xco())) {
            return 3;
        }
        if (TextDirection.m7502equalsimpl0(i, companion.m7509getLtrs_7Xco())) {
            return 0;
        }
        if (TextDirection.m7502equalsimpl0(i, companion.m7510getRtls_7Xco())) {
            return 1;
        }
        if (!TextDirection.m7502equalsimpl0(i, companion.m7506getContents_7Xco()) && !TextDirection.m7502equalsimpl0(i, companion.m7511getUnspecifieds_7Xco())) {
            o.f("Invalid TextDirection.");
            return 0;
        }
        if (localeList == null || (locale = localeList.get(0).getPlatformLocale()) == null) {
            locale = Locale.getDefault();
        }
        int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(locale);
        return (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
    }

    /* renamed from: resolveTextDirectionHeuristics-HklW4sA$default, reason: not valid java name */
    public static /* synthetic */ int m7319resolveTextDirectionHeuristicsHklW4sA$default(int i, LocaleList localeList, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            localeList = null;
        }
        return m7318resolveTextDirectionHeuristicsHklW4sA(i, localeList);
    }
}
