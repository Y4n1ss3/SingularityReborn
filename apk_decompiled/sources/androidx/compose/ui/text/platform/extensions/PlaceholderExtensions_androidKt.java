package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import defpackage.o;
import defpackage.s01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class PlaceholderExtensions_androidKt {
    /* renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m7331getSpanUnitR2X_6o(long j) {
        long m7804getTypeUIouoOA = TextUnit.m7804getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        if (TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7838getSpUIouoOA())) {
            return 0;
        }
        return TextUnitType.m7833equalsimpl0(m7804getTypeUIouoOA, companion.m7837getEmUIouoOA()) ? 1 : 2;
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m7333getSpanVerticalAligndo9XGg(int i) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.Companion;
        if (PlaceholderVerticalAlign.m6977equalsimpl0(i, companion.m6981getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m6977equalsimpl0(i, companion.m6987getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m6977equalsimpl0(i, companion.m6982getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m6977equalsimpl0(i, companion.m6983getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m6977equalsimpl0(i, companion.m6986getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m6977equalsimpl0(i, companion.m6984getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m6977equalsimpl0(i, companion.m6985getTextCenterJ6kI3mc())) {
            return 6;
        }
        o.f("Invalid PlaceholderVerticalAlign");
        return 0;
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i, int i2, Density density) {
        for (Object obj : spannable.getSpans(i, i2, s01.class)) {
            spannable.removeSpan((s01) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m7805getValueimpl(placeholder.m6973getWidthXSAIIZE()), m7331getSpanUnitR2X_6o(placeholder.m6973getWidthXSAIIZE()), TextUnit.m7805getValueimpl(placeholder.m6971getHeightXSAIIZE()), m7331getSpanUnitR2X_6o(placeholder.m6971getHeightXSAIIZE()), density, m7333getSpanVerticalAligndo9XGg(placeholder.m6972getPlaceholderVerticalAlignJ6kI3mc())), i, i2);
    }

    public static final void setPlaceholders(Spannable spannable, List<AnnotatedString.Range<Placeholder>> list, Density density) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<Placeholder> range = list.get(i);
            setPlaceholder(spannable, range.component1(), range.component2(), range.component3(), density);
        }
    }

    /* renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m7332getSpanUnitR2X_6o$annotations(long j) {
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m7334getSpanVerticalAligndo9XGg$annotations(int i) {
    }
}
