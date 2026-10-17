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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyOffKt {
    private static ImageVector _keyOff;

    public static final ImageVector getKeyOff(Icons.Outlined outlined) {
        ImageVector imageVector = _keyOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.KeyOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.7f, 13.53f, -1.71f, -1.71f);
        e.curveTo(9.0f, 11.88f, 9.0f, 11.94f, 9.0f, 12.0f);
        e.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        e.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        e.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        e.curveToRelative(0.06f, 0.0f, 0.12f, 0.0f, 0.18f, 0.01f);
        e.lineTo(5.47f, 8.3f);
        e.curveTo(4.02f, 8.9f, 3.0f, 10.33f, 3.0f, 12.0f);
        e.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        e.curveTo(8.67f, 16.0f, 10.1f, 14.98f, 10.7f, 13.53f);
        e.close();
        e.moveTo(12.19f, 15.02f);
        e.curveTo(11.15f, 16.8f, 9.21f, 18.0f, 7.0f, 18.0f);
        e.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        e.curveToRelative(0.0f, -2.21f, 1.2f, -4.15f, 2.98f, -5.19f);
        e.lineTo(1.39f, 4.22f);
        e.lineToRelative(1.41f, -1.41f);
        e.lineToRelative(18.38f, 18.38f);
        gy.B(e, -1.41f, 1.41f, 12.19f, 15.02f);
        e.moveTo(16.26f, 13.43f);
        e.lineToRelative(1.24f, -0.93f);
        e.lineToRelative(1.81f, 1.36f);
        e.lineTo(21.17f, 12.0f);
        e.lineToRelative(-1.0f, -1.0f);
        e.lineToRelative(-6.34f, 0.0f);
        e.lineToRelative(-2.0f, -2.0f);
        e.lineTo(21.0f, 9.0f);
        e.lineToRelative(0.0f, 0.0f);
        e.lineToRelative(3.0f, 3.0f);
        e.lineToRelative(-4.5f, 4.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, -0.69f, -0.51f, 16.26f, 13.43f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyOff = build;
        build.getClass();
        return build;
    }
}
