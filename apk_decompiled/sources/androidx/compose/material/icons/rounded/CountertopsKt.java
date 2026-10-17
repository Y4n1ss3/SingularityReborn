package androidx.compose.material.icons.rounded;

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
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CountertopsKt {
    private static ImageVector _countertops;

    public static final ImageVector getCountertops(Icons.Rounded rounded) {
        ImageVector imageVector = _countertops;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Countertops", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.0f, 10.0f, 0.0f, -2.83f);
        e.curveToRelative(0.0f, -1.62f, -1.22f, -3.08f, -2.84f, -3.17f);
        e.curveToRelative(-1.21f, -0.06f, -2.27f, 0.59f, -2.8f, 1.57f);
        e.curveTo(12.01f, 6.22f, 12.53f, 7.0f, 13.27f, 7.0f);
        e.horizontalLineToRelative(0.01f);
        e.curveToRelative(0.34f, 0.0f, 0.68f, -0.16f, 0.84f, -0.46f);
        e.curveTo(14.28f, 6.22f, 14.62f, 6.0f, 15.0f, 6.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.verticalLineToRelative(3.0f);
        e.horizontalLineTo(8.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(5.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineTo(5.0f);
        e.curveTo(4.45f, 4.0f, 4.0f, 4.45f, 4.0f, 5.0f);
        e.verticalLineToRelative(3.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineTo(3.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(1.0f);
        e.verticalLineToRelative(7.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(14.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(-7.0f);
        e.horizontalLineToRelative(1.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        kp0.r(e, 18.0f, 13.0f, 18.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(e, -6.0f, 2.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _countertops = build;
        build.getClass();
        return build;
    }
}
