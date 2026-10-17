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
import defpackage.bv;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrivateConnectivityKt {
    private static ImageVector _privateConnectivity;

    public static final ImageVector getPrivateConnectivity(Icons.Rounded rounded) {
        ImageVector imageVector = _privateConnectivity;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PrivateConnectivity", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 12.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-2.07f);
        b.curveToRelative(-0.49f, -3.39f, -3.4f, -6.0f, -6.93f, -6.0f);
        b.reflectiveCurveToRelative(-6.44f, 2.61f, -6.93f, 6.0f);
        b.horizontalLineTo(3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(2.07f);
        b.curveToRelative(0.49f, 3.39f, 3.4f, 6.0f, 6.93f, 6.0f);
        b.reflectiveCurveToRelative(6.44f, -2.61f, 6.93f, -6.0f);
        b.horizontalLineTo(21.0f);
        b.curveTo(21.55f, 13.0f, 22.0f, 12.55f, 22.0f, 12.0f);
        b.close();
        b.moveTo(15.0f, 14.5f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-3.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.0f);
        b.curveToRelative(0.0f, -1.21f, 1.08f, -2.18f, 2.34f, -1.97f);
        b.curveTo(13.32f, 7.69f, 14.0f, 8.61f, 14.0f, 9.61f);
        b.verticalLineToRelative(0.89f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        bv.t(b, 14.5f, 12.75f, 13.0f);
        b.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        b.reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f);
        b.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        b.reflectiveCurveTo(12.75f, 12.59f, 12.75f, 13.0f);
        uo.C(b, 13.0f, 9.5f, 1.0f, -2.0f);
        b.verticalLineToRelative(-1.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 13.0f, 8.95f, 13.0f, 9.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _privateConnectivity = build;
        build.getClass();
        return build;
    }
}
