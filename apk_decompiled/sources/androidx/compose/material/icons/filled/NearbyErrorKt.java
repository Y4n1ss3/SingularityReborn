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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NearbyErrorKt {
    private static ImageVector _nearbyError;

    public static final ImageVector getNearbyError(Icons.Filled filled) {
        ImageVector imageVector = _nearbyError;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NearbyError", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 7.57f, 4.42f, 4.42f);
        e.lineTo(12.0f, 16.41f);
        gy.B(e, -4.42f, -4.42f, 12.0f, 7.57f);
        e.moveTo(12.0f, 19.19f);
        e.lineToRelative(-7.2f, -7.2f);
        e.lineToRelative(7.2f, -7.2f);
        e.lineToRelative(6.0f, 6.0f);
        e.verticalLineTo(7.16f);
        e.lineToRelative(-4.58f, -4.58f);
        e.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        e.lineToRelative(-8.01f, 8.0f);
        e.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        e.lineToRelative(8.01f, 8.0f);
        e.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        e.lineTo(18.0f, 16.82f);
        kf0.t(e, -3.63f, 12.0f, 19.19f);
        k4.C(e, 20.0f, 20.0f, 2.0f, 2.0f);
        uo.r(e, -2.0f, 20.0f, 22.0f, 10.0f);
        e.horizontalLineToRelative(-2.0f);
        e.verticalLineToRelative(8.0f);
        e.horizontalLineToRelative(2.0f);
        e.verticalLineTo(10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearbyError = build;
        build.getClass();
        return build;
    }
}
