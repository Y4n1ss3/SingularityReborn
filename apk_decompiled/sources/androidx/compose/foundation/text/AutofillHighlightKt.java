package androidx.compose.foundation.text;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import defpackage.e1;
import defpackage.er;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutofillHighlightKt {
    private static final ProvidableCompositionLocal<Brush> LocalAutofillHighlightBrush = CompositionLocalKt.compositionLocalOf$default(null, new e1(7), 1, null);
    private static final ProvidableCompositionLocal<Color> LocalAutofillHighlightColor = CompositionLocalKt.compositionLocalOf$default(null, new iy() { // from class: androidx.compose.foundation.text.AutofillHighlightKt$LocalAutofillHighlightColor$1
        @Override // defpackage.iy
        public /* bridge */ /* synthetic */ Object invoke() {
            return Color.m4751boximpl(m1062invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m1062invoke0d7_KjU() {
            return AutofillHighlight_androidKt.autofillHighlightColor();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Brush LocalAutofillHighlightBrush$lambda$0() {
        return new SolidColor(AutofillHighlight_androidKt.autofillHighlightColor(), null);
    }

    public static final ProvidableCompositionLocal<Brush> getLocalAutofillHighlightBrush() {
        return LocalAutofillHighlightBrush;
    }

    public static final ProvidableCompositionLocal<Color> getLocalAutofillHighlightColor() {
        return LocalAutofillHighlightColor;
    }

    /* renamed from: resolveAutofillHighlight-WkMS-hQ, reason: not valid java name */
    public static final Brush m1061resolveAutofillHighlightWkMShQ(Brush brush, long j, long j2) {
        return !Color.m4762equalsimpl0(j, j2) ? new SolidColor(j, null) : brush;
    }

    @er
    public static /* synthetic */ void getLocalAutofillHighlightColor$annotations() {
    }
}
