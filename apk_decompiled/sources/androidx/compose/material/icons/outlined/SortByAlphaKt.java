package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SortByAlphaKt {
    private static ImageVector _sortByAlpha;

    public static final ImageVector getSortByAlpha(Icons.Outlined outlined) {
        ImageVector imageVector = _sortByAlpha;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SortByAlpha", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(14.94f, 4.66f, -4.72f, 2.36f, -2.36f);
        fc.B(i, 2.36f, 2.36f, 10.25f, 19.37f);
        i.horizontalLineToRelative(4.66f);
        fc.C(i, -2.33f, 2.33f, -2.33f, -2.33f);
        i.moveTo(6.1f, 6.27f);
        i.lineTo(1.6f, 17.73f);
        kf0.B(i, 1.84f, 0.92f, -2.45f, 5.11f);
        i.lineToRelative(0.92f, 2.45f);
        i.horizontalLineToRelative(1.84f);
        r6.C(i, 7.74f, 6.27f, 6.1f, 6.27f);
        i.moveTo(4.97f, 13.64f);
        i.lineToRelative(1.94f, -5.18f);
        gy.B(i, 1.94f, 5.18f, 4.97f, 13.64f);
        k4.C(i, 15.73f, 16.14f, 6.12f, 1.59f);
        bv.p(i, -8.53f, -1.29f, 5.92f, -8.56f);
        af0.v(i, -5.88f, -1.6f, 8.3f, 1.26f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(i, -5.93f, 8.6f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sortByAlpha = build;
        build.getClass();
        return build;
    }
}
