package androidx.compose.material3;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContentColorKt {
    private static final ProvidableCompositionLocal<Color> LocalContentColor = CompositionLocalKt.compositionLocalOf$default(null, new iy() { // from class: androidx.compose.material3.ContentColorKt$LocalContentColor$1
        @Override // defpackage.iy
        public /* bridge */ /* synthetic */ Object invoke() {
            return Color.m4751boximpl(m1848invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m1848invoke0d7_KjU() {
            return Color.Companion.m4787getBlack0d7_KjU();
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<Color> getLocalContentColor() {
        return LocalContentColor;
    }
}
