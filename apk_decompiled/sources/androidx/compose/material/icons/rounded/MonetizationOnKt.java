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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MonetizationOnKt {
    private static ImageVector _monetizationOn;

    public static final ImageVector getMonetizationOn(Icons.Rounded rounded) {
        ImageVector imageVector = _monetizationOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MonetizationOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        bv.v(b, 13.41f, 18.09f, 0.58f);
        b.curveToRelative(0.0f, 0.73f, -0.6f, 1.33f, -1.33f, 1.33f);
        b.horizontalLineToRelative(-0.01f);
        b.curveToRelative(-0.73f, 0.0f, -1.33f, -0.6f, -1.33f, -1.33f);
        b.verticalLineToRelative(-0.6f);
        b.curveToRelative(-1.33f, -0.28f, -2.51f, -1.01f, -3.01f, -2.24f);
        b.curveToRelative(-0.23f, -0.55f, 0.2f, -1.16f, 0.8f, -1.16f);
        b.horizontalLineToRelative(0.24f);
        b.curveToRelative(0.37f, 0.0f, 0.67f, 0.25f, 0.81f, 0.6f);
        b.curveToRelative(0.29f, 0.75f, 1.05f, 1.27f, 2.51f, 1.27f);
        b.curveToRelative(1.96f, 0.0f, 2.4f, -0.98f, 2.4f, -1.59f);
        b.curveToRelative(0.0f, -0.83f, -0.44f, -1.61f, -2.67f, -2.14f);
        b.curveToRelative(-2.48f, -0.6f, -4.18f, -1.62f, -4.18f, -3.67f);
        b.curveToRelative(0.0f, -1.72f, 1.39f, -2.84f, 3.11f, -3.21f);
        b.verticalLineToRelative(-0.6f);
        b.curveToRelative(0.0f, -0.73f, 0.6f, -1.33f, 1.33f, -1.33f);
        b.horizontalLineToRelative(0.01f);
        b.curveToRelative(0.73f, 0.0f, 1.33f, 0.6f, 1.33f, 1.33f);
        b.verticalLineToRelative(0.62f);
        b.curveToRelative(1.38f, 0.34f, 2.25f, 1.2f, 2.63f, 2.26f);
        b.curveToRelative(0.2f, 0.55f, -0.22f, 1.13f, -0.81f, 1.13f);
        b.horizontalLineToRelative(-0.26f);
        b.curveToRelative(-0.37f, 0.0f, -0.67f, -0.26f, -0.77f, -0.62f);
        b.curveToRelative(-0.23f, -0.76f, -0.86f, -1.25f, -2.12f, -1.25f);
        b.curveToRelative(-1.5f, 0.0f, -2.4f, 0.68f, -2.4f, 1.64f);
        b.curveToRelative(0.0f, 0.84f, 0.65f, 1.39f, 2.67f, 1.91f);
        b.reflectiveCurveToRelative(4.18f, 1.39f, 4.18f, 3.91f);
        b.curveToRelative(-0.02f, 1.83f, -1.39f, 2.83f, -3.13f, 3.16f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monetizationOn = build;
        build.getClass();
        return build;
    }
}
