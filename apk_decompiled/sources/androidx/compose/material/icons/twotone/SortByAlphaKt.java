package androidx.compose.material.icons.twotone;

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
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SortByAlphaKt {
    private static ImageVector _sortByAlpha;

    public static final ImageVector getSortByAlpha(Icons.TwoTone twoTone) {
        ImageVector imageVector = _sortByAlpha;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SortByAlpha", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.94f, 4.66f, 12.58f, 2.3f);
        fc.B(i, -2.36f, 2.36f, 10.39f, 17.73f);
        i.horizontalLineToRelative(1.84f);
        i.lineTo(7.74f, 6.27f);
        i.lineTo(6.1f, 6.27f);
        i.lineTo(1.6f, 17.73f);
        kf0.B(i, 1.84f, 0.92f, -2.45f, 5.11f);
        fc.B(i, 0.92f, 2.45f, 4.97f, 13.64f);
        i.lineToRelative(1.94f, -5.18f);
        gy.B(i, 1.94f, 5.18f, 4.97f, 13.64f);
        i.moveTo(12.58f, 21.7f);
        uf.r(i, 2.33f, -2.33f, -4.66f);
        i.moveTo(21.66f, 7.54f);
        fc.w(i, 21.66f, 6.28f, -8.3f, 1.6f);
        fc.D(i, 5.88f, -5.92f, 8.56f, 1.29f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.v(i, 8.53f, -1.59f, -6.12f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sortByAlpha = build;
        build.getClass();
        return build;
    }
}
