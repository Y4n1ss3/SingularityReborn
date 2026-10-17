package androidx.compose.material.icons.automirrored.twotone;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsRunKt {
    private static ImageVector _directionsRun;

    public static final ImageVector getDirectionsRun(Icons.AutoMirrored.TwoTone twoTone) {
        ImageVector imageVector = _directionsRun;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.TwoTone.DirectionsRun", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.49f, 3.48f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        k4.x(b, 10.89f, 14.98f, 2.1f, 2.0f);
        kf0.z(b, 6.0f, 2.0f, -7.5f);
        b.lineToRelative(-2.1f, -2.0f);
        b.lineToRelative(0.6f, -3.0f);
        b.curveToRelative(1.3f, 1.5f, 3.3f, 2.5f, 5.5f, 2.5f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(-1.9f, 0.0f, -3.5f, -1.0f, -4.3f, -2.4f);
        b.lineToRelative(-1.0f, -1.6f);
        b.curveToRelative(-0.4f, -0.6f, -1.0f, -1.0f, -1.7f, -1.0f);
        b.curveToRelative(-0.3f, 0.0f, -0.5f, 0.1f, -0.8f, 0.1f);
        r6.A(b, -5.2f, 2.2f, 4.7f, 2.0f);
        b.verticalLineToRelative(-3.4f);
        b.lineToRelative(1.8f, -0.7f);
        b.lineToRelative(-1.6f, 8.1f);
        b.lineToRelative(-4.9f, -1.0f);
        b.lineToRelative(-0.4f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 7.0f, 1.4f, 1.0f, -4.4f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsRun = build;
        build.getClass();
        return build;
    }
}
