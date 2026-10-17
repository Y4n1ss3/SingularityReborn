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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsOffKt {
    private static ImageVector _directionsOff;

    public static final ImageVector getDirectionsOff(Icons.Outlined outlined) {
        ImageVector imageVector = _directionsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DirectionsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.71f, 11.29f, -9.0f, -9.0f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.lineTo(8.21f, 5.38f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineTo(12.0f, 4.42f);
        e.lineTo(19.58f, 12.0f);
        e.lineToRelative(-2.38f, 2.38f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineToRelative(3.09f, -3.09f);
        e.curveTo(22.1f, 12.33f, 22.1f, 11.7f, 21.71f, 11.29f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(13.0f, 7.5f, 0.0f, 2.67f), 2.17f, 2.17f, 1.33f, -1.34f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(1.39f, 4.22f, 3.99f, 3.99f);
        e2.lineToRelative(-3.09f, 3.09f);
        e2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e2.lineToRelative(9.0f, 9.0f);
        e2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e2.lineToRelative(3.09f, -3.09f);
        e2.lineToRelative(3.99f, 3.99f);
        e2.lineToRelative(1.41f, -1.41f);
        r6.C(e2, 2.81f, 2.81f, 1.39f, 4.22f);
        e2.moveTo(8.03f, 10.85f);
        e2.curveTo(8.02f, 10.9f, 7.99f, 10.95f, 7.99f, 11.0f);
        kf0.z(e2, 4.0f, 2.0f, -2.18f);
        e2.lineToRelative(4.38f, 4.38f);
        e2.lineTo(12.0f, 19.58f);
        e2.lineTo(4.42f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e2, 2.38f, -2.38f, 8.03f, 10.85f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsOff = build;
        build.getClass();
        return build;
    }
}
