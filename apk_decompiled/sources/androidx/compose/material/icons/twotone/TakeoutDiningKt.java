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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TakeoutDiningKt {
    private static ImageVector _takeoutDining;

    public static final ImageVector getTakeoutDining(Icons.TwoTone twoTone) {
        ImageVector imageVector = _takeoutDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.TakeoutDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.83f, 5.0f, -2.8f, 2.73f);
        e.lineToRelative(0.09f, 1.27f);
        e.lineToRelative(9.75f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 0.09f, -1.27f, -2.8f, -2.73f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(7.79f, 18.0f, 8.44f, 0.0f), 0.51f, -7.0f, -9.46f, 0.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 0.3f, null, 0.3f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.59f, 6.05f, 19.0f, 7.63f);
        i.lineToRelative(0.03f, -0.56f);
        i.lineTo(14.98f, 3.0f);
        i.horizontalLineTo(9.02f);
        i.lineTo(4.97f, 7.07f);
        i.lineTo(5.0f, 7.57f);
        i.lineTo(3.41f, 6.01f);
        i.lineTo(2.0f, 7.44f);
        i.lineToRelative(3.23f, 3.11f);
        i.lineTo(5.93f, 20.0f);
        i.horizontalLineToRelative(12.14f);
        i.lineToRelative(0.7f, -9.44f);
        r6.C(i, 22.0f, 7.46f, 20.59f, 6.05f);
        i.moveTo(16.23f, 18.0f);
        uo.g(i, 7.79f, -0.51f, -7.0f, 9.46f);
        uo.l(i, 16.23f, 18.0f, 16.87f, 9.0f);
        i.horizontalLineTo(7.12f);
        i.lineTo(7.03f, 7.73f);
        i.lineTo(9.83f, 5.0f);
        i.horizontalLineToRelative(4.33f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 2.8f, 2.73f, 16.87f, 9.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _takeoutDining = build;
        build.getClass();
        return build;
    }
}
