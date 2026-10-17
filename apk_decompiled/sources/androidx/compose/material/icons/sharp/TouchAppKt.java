package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TouchAppKt {
    private static ImageVector _touchApp;

    public static final ImageVector getTouchApp(Icons.Sharp sharp) {
        ImageVector imageVector = _touchApp;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TouchApp", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(8.25f, 9.24f, 5.5f);
        d.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        d.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        d.verticalLineToRelative(3.74f);
        d.curveToRelative(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f);
        d.curveToRelative(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
        d.reflectiveCurveToRelative(-4.5f, 2.01f, -4.5f, 4.5f);
        d.curveTo(6.25f, 7.06f, 7.04f, 8.43f, 8.25f, 9.24f);
        r6.B(d, 13.33f, 11.5f, -1.08f, -6.0f);
        d.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        d.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        d.verticalLineToRelative(10.74f);
        d.lineToRelative(-4.04f, -0.85f);
        d.lineTo(4.0f, 16.62f);
        d.lineTo(9.38f, 22.0f);
        d.horizontalLineToRelative(8.67f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, 1.07f, -7.62f, 13.33f, 11.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _touchApp = build;
        build.getClass();
        return build;
    }
}
