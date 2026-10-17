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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NordicWalkingKt {
    private static ImageVector _nordicWalking;

    public static final ImageVector getNordicWalking(Icons.Filled filled) {
        ImageVector imageVector = _nordicWalking;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NordicWalking", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(19.0f, 23.0f, -1.5f, -9.0f, 19.0f);
        k4.B(d, 23.0f, 7.53f, 14.0f, 6.0f);
        d.lineToRelative(-2.0f, 9.0f);
        gy.n(d, 1.53f, 7.53f, 14.0f);
        d.moveTo(13.5f, 5.5f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        d.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        d.reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f);
        k4.r(d, 9.8f, 8.9f, 7.0f, 23.0f);
        d.horizontalLineToRelative(2.1f);
        d.lineToRelative(1.8f, -8.0f);
        r6.A(d, 2.1f, 2.0f, 6.0f, 2.0f);
        d.verticalLineToRelative(-7.5f);
        d.lineToRelative(-2.1f, -2.0f);
        d.lineToRelative(0.6f, -3.0f);
        d.curveTo(14.8f, 12.0f, 16.8f, 13.0f, 19.0f, 13.0f);
        d.verticalLineToRelative(-2.0f);
        d.curveToRelative(-1.9f, 0.0f, -3.5f, -1.0f, -4.3f, -2.4f);
        d.lineToRelative(-1.0f, -1.6f);
        d.curveToRelative(-0.56f, -0.89f, -1.68f, -1.25f, -2.65f, -0.84f);
        fc.t(d, 6.0f, 8.3f, 13.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.k(d, 9.6f, 9.8f, 8.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nordicWalking = build;
        build.getClass();
        return build;
    }
}
