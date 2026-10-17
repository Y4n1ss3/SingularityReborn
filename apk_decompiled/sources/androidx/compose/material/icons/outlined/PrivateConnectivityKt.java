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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrivateConnectivityKt {
    private static ImageVector _privateConnectivity;

    public static final ImageVector getPrivateConnectivity(Icons.Outlined outlined) {
        ImageVector imageVector = _privateConnectivity;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PrivateConnectivity", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 7.0f);
        b.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(-5.0f, -2.24f, -5.0f, -5.0f);
        b.reflectiveCurveTo(9.24f, 7.0f, 12.0f, 7.0f);
        b.close();
        b.moveTo(5.07f, 13.0f);
        b.curveToRelative(0.49f, 3.39f, 3.4f, 6.0f, 6.93f, 6.0f);
        b.curveToRelative(3.53f, 0.0f, 6.44f, -2.61f, 6.93f, -6.0f);
        b.lineTo(22.0f, 13.0f);
        b.verticalLineToRelative(-2.0f);
        b.lineToRelative(-3.07f, 0.0f);
        b.curveToRelative(-0.49f, -3.39f, -3.4f, -6.0f, -6.93f, -6.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-3.53f, 0.0f, -6.44f, 2.61f, -6.93f, 6.0f);
        b.curveToRelative(0.0f, 0.0f, -3.07f, 0.0f, -3.07f, 0.0f);
        kf0.t(b, 2.0f, 5.07f, 13.0f);
        b.moveTo(14.0f, 10.5f);
        b.verticalLineTo(9.61f);
        b.curveToRelative(0.0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f);
        b.curveTo(11.08f, 7.32f, 10.0f, 8.29f, 10.0f, 9.5f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-3.0f);
        b.curveTo(15.0f, 10.95f, 14.55f, 10.5f, 14.0f, 10.5f);
        b.close();
        b.moveTo(12.0f, 13.75f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        b.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        b.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        b.curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12.0f, 13.75f);
        r6.B(b, 13.0f, 10.5f, -2.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 10.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _privateConnectivity = build;
        build.getClass();
        return build;
    }
}
