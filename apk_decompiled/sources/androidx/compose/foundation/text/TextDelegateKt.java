package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextDelegateKt {
    public static final int ceilToIntPx(float f) {
        return Math.round((float) Math.ceil(f));
    }

    /* renamed from: updateTextDelegate-rm0N8CA, reason: not valid java name */
    public static final TextDelegate m1168updateTextDelegaterm0N8CA(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list) {
        FontFamily.Resolver resolver2;
        boolean z2;
        int i4;
        int i5;
        int i6;
        List<AnnotatedString.Range<Placeholder>> list2;
        if (q10.b(textDelegate.getText(), annotatedString) && q10.b(textDelegate.getStyle(), textStyle)) {
            z2 = z;
            if (textDelegate.getSoftWrap() == z2) {
                i4 = i;
                if (!TextOverflow.m7537equalsimpl0(textDelegate.m1166getOverflowgIe3tQ8(), i4)) {
                    resolver2 = resolver;
                    i5 = i2;
                    i6 = i3;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i5, i6, z2, i4, density, resolver2, list2, null);
                }
                i5 = i2;
                if (textDelegate.getMaxLines() != i5) {
                    resolver2 = resolver;
                    i6 = i3;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i5, i6, z2, i4, density, resolver2, list2, null);
                }
                i6 = i3;
                if (textDelegate.getMinLines() != i6 || !q10.b(textDelegate.getDensity(), density)) {
                    resolver2 = resolver;
                    list2 = list;
                    return new TextDelegate(annotatedString, textStyle, i5, i6, z2, i4, density, resolver2, list2, null);
                }
                list2 = list;
                if (q10.b(textDelegate.getPlaceholders(), list2)) {
                    resolver2 = resolver;
                    if (textDelegate.getFontFamilyResolver() == resolver2) {
                        return textDelegate;
                    }
                } else {
                    resolver2 = resolver;
                }
                return new TextDelegate(annotatedString, textStyle, i5, i6, z2, i4, density, resolver2, list2, null);
            }
            resolver2 = resolver;
        } else {
            resolver2 = resolver;
            z2 = z;
        }
        i4 = i;
        i5 = i2;
        i6 = i3;
        list2 = list;
        return new TextDelegate(annotatedString, textStyle, i5, i6, z2, i4, density, resolver2, list2, null);
    }

    /* renamed from: updateTextDelegate-rm0N8CA$default, reason: not valid java name */
    public static /* synthetic */ TextDelegate m1169updateTextDelegaterm0N8CA$default(TextDelegate textDelegate, AnnotatedString annotatedString, TextStyle textStyle, Density density, FontFamily.Resolver resolver, boolean z, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 32) != 0) {
            z = true;
        }
        if ((i4 & 64) != 0) {
            i = TextOverflow.Companion.m7546getClipgIe3tQ8();
        }
        if ((i4 & Fields.SpotShadowColor) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i4 & Fields.RotationX) != 0) {
            i3 = 1;
        }
        return m1168updateTextDelegaterm0N8CA(textDelegate, annotatedString, textStyle, density, resolver, z, i, i2, i3, list);
    }
}
