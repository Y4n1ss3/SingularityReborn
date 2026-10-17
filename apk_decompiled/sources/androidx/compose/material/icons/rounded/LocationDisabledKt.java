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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocationDisabledKt {
    private static ImageVector _locationDisabled;

    public static final ImageVector getLocationDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _locationDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocationDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 13.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-1.06f);
        b.curveToRelative(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f);
        b.lineTo(13.0f, 2.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(1.06f);
        b.curveToRelative(-0.98f, 0.11f, -1.91f, 0.38f, -2.77f, 0.78f);
        b.lineToRelative(1.53f, 1.53f);
        b.curveTo(10.46f, 5.13f, 11.22f, 5.0f, 12.0f, 5.0f);
        b.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        b.curveToRelative(0.0f, 0.79f, -0.13f, 1.54f, -0.37f, 2.24f);
        b.lineToRelative(1.53f, 1.53f);
        b.curveToRelative(0.4f, -0.86f, 0.67f, -1.79f, 0.78f, -2.77f);
        uo.l(b, 22.0f, 13.0f, 20.44f, 18.88f);
        b.lineTo(5.12f, 3.56f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineTo(5.04f, 6.3f);
        b.curveTo(3.97f, 7.62f, 3.26f, 9.23f, 3.06f, 11.0f);
        b.lineTo(2.0f, 11.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(1.06f);
        b.curveToRelative(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f);
        b.lineTo(11.0f, 22.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.06f);
        b.curveToRelative(1.77f, -0.2f, 3.38f, -0.91f, 4.69f, -1.98f);
        b.lineToRelative(1.33f, 1.33f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f);
        b.close();
        b.moveTo(12.0f, 19.0f);
        b.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        b.curveToRelative(0.0f, -1.61f, 0.55f, -3.09f, 1.46f, -4.27f);
        b.lineToRelative(9.81f, 9.81f);
        b.curveTo(15.09f, 18.45f, 13.61f, 19.0f, 12.0f, 19.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationDisabled = build;
        build.getClass();
        return build;
    }
}
