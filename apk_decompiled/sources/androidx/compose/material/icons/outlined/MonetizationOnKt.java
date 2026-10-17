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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MonetizationOnKt {
    private static ImageVector _monetizationOn;

    public static final ImageVector getMonetizationOn(Icons.Outlined outlined) {
        ImageVector imageVector = _monetizationOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MonetizationOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        b.close();
        b.moveTo(12.31f, 11.14f);
        b.curveToRelative(-1.77f, -0.45f, -2.34f, -0.94f, -2.34f, -1.67f);
        b.curveToRelative(0.0f, -0.84f, 0.79f, -1.43f, 2.1f, -1.43f);
        b.curveToRelative(1.38f, 0.0f, 1.9f, 0.66f, 1.94f, 1.64f);
        b.horizontalLineToRelative(1.71f);
        b.curveToRelative(-0.05f, -1.34f, -0.87f, -2.57f, -2.49f, -2.97f);
        b.lineTo(13.23f, 5.0f);
        b.lineTo(10.9f, 5.0f);
        b.verticalLineToRelative(1.69f);
        b.curveToRelative(-1.51f, 0.32f, -2.72f, 1.3f, -2.72f, 2.81f);
        b.curveToRelative(0.0f, 1.79f, 1.49f, 2.69f, 3.66f, 3.21f);
        b.curveToRelative(1.95f, 0.46f, 2.34f, 1.15f, 2.34f, 1.87f);
        b.curveToRelative(0.0f, 0.53f, -0.39f, 1.39f, -2.1f, 1.39f);
        b.curveToRelative(-1.6f, 0.0f, -2.23f, -0.72f, -2.32f, -1.64f);
        b.lineTo(8.04f, 14.33f);
        b.curveToRelative(0.1f, 1.7f, 1.36f, 2.66f, 2.86f, 2.97f);
        fc.w(b, 10.9f, 19.0f, 2.34f, -1.67f);
        b.curveToRelative(1.52f, -0.29f, 2.72f, -1.16f, 2.73f, -2.77f);
        b.curveToRelative(-0.01f, -2.2f, -1.9f, -2.96f, -3.66f, -3.42f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _monetizationOn = build;
        build.getClass();
        return build;
    }
}
