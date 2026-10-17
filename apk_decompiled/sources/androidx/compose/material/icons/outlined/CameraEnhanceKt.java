package androidx.compose.material.icons.outlined;

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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CameraEnhanceKt {
    private static ImageVector _cameraEnhance;

    public static final ImageVector getCameraEnhance(Icons.Outlined outlined) {
        ImageVector imageVector = _cameraEnhance;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CameraEnhance", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 10.0f, -0.94f, 2.06f);
        e.lineTo(9.0f, 13.0f);
        e.lineToRelative(2.06f, 0.94f);
        e.lineTo(12.0f, 16.0f);
        e.lineToRelative(0.94f, -2.06f);
        bv.o(e, 15.0f, 13.0f, -2.06f, -0.94f);
        e.moveTo(20.0f, 5.0f);
        e.horizontalLineToRelative(-3.17f);
        e.lineTo(15.0f, 3.0f);
        e.lineTo(9.0f, 3.0f);
        e.lineTo(7.17f, 5.0f);
        e.lineTo(4.0f, 5.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(12.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(16.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.lineTo(22.0f, 7.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(e, 20.0f, 19.0f, 4.0f, 19.0f);
        e.lineTo(4.0f, 7.0f);
        e.horizontalLineToRelative(4.05f);
        e.lineToRelative(0.59f, -0.65f);
        e.lineTo(9.88f, 5.0f);
        e.horizontalLineToRelative(4.24f);
        e.lineToRelative(1.24f, 1.35f);
        e.lineToRelative(0.59f, 0.65f);
        bv.r(e, 20.0f, 7.0f, 12.0f);
        e.moveTo(12.0f, 8.0f);
        e.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        e.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        e.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        e.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        e.close();
        e.moveTo(12.0f, 16.0f);
        e.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        e.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        e.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -1.35f, 3.0f, -3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cameraEnhance = build;
        build.getClass();
        return build;
    }
}
