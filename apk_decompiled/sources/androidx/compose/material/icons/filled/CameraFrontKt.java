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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CameraFrontKt {
    private static ImageVector _cameraFront;

    public static final ImageVector getCameraFront(Icons.Filled filled) {
        ImageVector imageVector = _cameraFront;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CameraFront", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(10.0f, 20.0f, 5.0f, 20.0f, 2.0f);
        bv.p(s, 5.0f, 2.0f, 3.0f, -3.0f);
        uf.v(s, -3.0f, -3.0f, 2.0f);
        bv.y(s, 14.0f, 20.0f, 2.0f, 5.0f);
        kf0.C(s, -2.0f, -5.0f, 12.0f, 8.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        s.reflectiveCurveToRelative(-1.99f, 0.9f, -1.99f, 2.0f);
        s.reflectiveCurveTo(10.9f, 8.0f, 12.0f, 8.0f);
        k4.r(s, 17.0f, 0.0f, 7.0f, 0.0f);
        s.curveTo(5.9f, 0.0f, 5.0f, 0.9f, 5.0f, 2.0f);
        s.verticalLineToRelative(14.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(10.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.lineTo(19.0f, 2.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r6.B(s, 7.0f, 2.0f, 10.0f, 10.5f);
        s.curveToRelative(0.0f, -1.67f, -3.33f, -2.5f, -5.0f, -2.5f);
        s.reflectiveCurveToRelative(-5.0f, 0.83f, -5.0f, 2.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(s, 7.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cameraFront = build;
        build.getClass();
        return build;
    }
}
