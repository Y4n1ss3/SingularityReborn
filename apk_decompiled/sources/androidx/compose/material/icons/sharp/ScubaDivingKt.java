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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScubaDivingKt {
    private static ImageVector _scubaDiving;

    public static final ImageVector getScubaDiving(Icons.Sharp sharp) {
        ImageVector imageVector = _scubaDiving;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ScubaDiving", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(1.0f, 13.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveTo(1.0f, 14.1f, 1.0f, 13.0f);
        k4.x(b, 8.89f, 10.11f, 4.53f, -1.21f);
        b.lineTo(12.64f, 6.0f);
        b.lineTo(8.11f, 7.21f);
        b.curveToRelative(-0.8f, 0.21f, -1.28f, 1.04f, -1.06f, 1.84f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveTo(7.27f, 9.85f, 8.09f, 10.33f, 8.89f, 10.11f);
        k4.r(b, 20.5f, 5.9f, 23.0f, 3.0f);
        b.lineToRelative(-1.0f, -1.0f);
        b.lineToRelative(-3.0f, 3.0f);
        b.lineToRelative(-2.0f, 4.0f);
        b.lineToRelative(-9.48f, 2.87f);
        b.curveToRelative(-0.82f, 0.2f, -1.39f, 0.89f, -1.5f, 1.68f);
        b.lineTo(5.24f, 18.0f);
        b.lineTo(2.4f, 21.8f);
        b.lineTo(4.0f, 23.0f);
        b.lineToRelative(3.0f, -4.0f);
        b.lineToRelative(1.14f, -3.14f);
        b.lineTo(14.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 5.0f, -3.5f, 20.5f, 5.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scubaDiving = build;
        build.getClass();
        return build;
    }
}
