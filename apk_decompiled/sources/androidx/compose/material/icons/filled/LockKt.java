package androidx.compose.material.icons.filled;

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
public final class LockKt {
    private static ImageVector _lock;

    public static final ImageVector getLock(Icons.Filled filled) {
        ImageVector imageVector = _lock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Lock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(18.0f, 8.0f, -1.0f, 17.0f, 6.0f);
        p.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        p.reflectiveCurveTo(7.0f, 3.24f, 7.0f, 6.0f);
        p.verticalLineToRelative(2.0f);
        p.lineTo(6.0f, 8.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p.verticalLineToRelative(10.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(12.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        p.lineTo(20.0f, 10.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        p.close();
        p.moveTo(12.0f, 17.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        p.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        p.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        p.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        k4.r(p, 15.1f, 8.0f, 8.9f, 8.0f);
        p.lineTo(8.9f, 6.0f);
        p.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        p.curveToRelative(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(p, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _lock = build;
        build.getClass();
        return build;
    }
}
