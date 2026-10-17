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
import defpackage.fc;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TrafficKt {
    private static ImageVector _traffic;

    public static final ImageVector getTraffic(Icons.Sharp sharp) {
        ImageVector imageVector = _traffic;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Traffic", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(20.0f, 10.0f, -3.0f, 17.0f, 8.86f);
        p.curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f);
        p.horizontalLineToRelative(-3.0f);
        p.lineTo(17.0f, 3.0f);
        p.lineTo(7.0f, 3.0f);
        p.verticalLineToRelative(2.0f);
        p.lineTo(4.0f, 5.0f);
        p.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        p.lineTo(7.0f, 10.0f);
        p.lineTo(4.0f, 10.0f);
        p.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        p.lineTo(7.0f, 15.0f);
        p.lineTo(4.0f, 15.0f);
        p.curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f);
        fc.w(p, 7.0f, 21.0f, 10.0f, -2.14f);
        p.curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f);
        p.horizontalLineToRelative(-3.0f);
        p.verticalLineToRelative(-1.14f);
        p.curveToRelative(1.72f, -0.45f, 3.0f, -2.0f, 3.0f, -3.86f);
        p.close();
        p.moveTo(12.0f, 19.0f);
        p.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        p.reflectiveCurveToRelative(0.89f, -2.0f, 2.0f, -2.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        p.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        p.close();
        p.moveTo(12.0f, 14.0f);
        p.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        p.reflectiveCurveToRelative(0.89f, -2.0f, 2.0f, -2.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        p.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        p.close();
        p.moveTo(12.0f, 9.0f);
        p.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        p.curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        p.curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        p.curveToRelative(0.0f, 1.1f, -0.89f, 2.0f, -2.0f, 2.0f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _traffic = build;
        build.getClass();
        return build;
    }
}
