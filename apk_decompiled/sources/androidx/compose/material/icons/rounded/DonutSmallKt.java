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
import defpackage.af0;
import defpackage.bv;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DonutSmallKt {
    private static ImageVector _donutSmall;

    public static final ImageVector getDonutSmall(Icons.Rounded rounded) {
        ImageVector imageVector = _donutSmall;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DonutSmall", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(11.0f, 3.18f, 17.64f);
        h.curveToRelative(0.0f, 0.64f, -0.59f, 1.12f, -1.21f, 0.98f);
        h.curveTo(5.32f, 20.8f, 2.0f, 16.79f, 2.0f, 12.0f);
        h.reflectiveCurveToRelative(3.32f, -8.8f, 7.79f, -9.8f);
        h.curveToRelative(0.62f, -0.14f, 1.21f, 0.34f, 1.21f, 0.98f);
        bv.v(h, 13.03f, 3.18f, 6.81f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.horizontalLineToRelative(6.79f);
        h.curveToRelative(0.64f, 0.0f, 1.12f, -0.59f, 0.98f, -1.22f);
        h.curveToRelative(-0.85f, -3.76f, -3.8f, -6.72f, -7.55f, -7.57f);
        h.curveToRelative(-0.63f, -0.14f, -1.22f, 0.34f, -1.22f, 0.98f);
        bv.v(h, 13.03f, 14.01f, 6.81f);
        h.curveToRelative(0.0f, 0.64f, 0.59f, 1.12f, 1.22f, 0.98f);
        h.curveToRelative(3.76f, -0.85f, 6.71f, -3.82f, 7.56f, -7.58f);
        h.curveToRelative(0.14f, -0.62f, -0.35f, -1.22f, -0.98f, -1.22f);
        h.horizontalLineToRelative(-6.79f);
        h.curveToRelative(-0.56f, 0.01f, -1.01f, 0.46f, -1.01f, 1.01f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutSmall = build;
        build.getClass();
        return build;
    }
}
