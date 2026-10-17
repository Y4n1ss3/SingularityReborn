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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CloudOffKt {
    private static ImageVector _cloudOff;

    public static final ImageVector getCloudOff(Icons.Rounded rounded) {
        ImageVector imageVector = _cloudOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CloudOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(24.0f, 15.0f);
        b.curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        b.curveTo(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(-1.33f, 0.0f, -2.57f, 0.36f, -3.65f, 0.97f);
        b.lineToRelative(1.49f, 1.49f);
        b.curveTo(10.51f, 6.17f, 11.23f, 6.0f, 12.0f, 6.0f);
        b.curveToRelative(3.04f, 0.0f, 5.5f, 2.46f, 5.5f, 5.5f);
        b.verticalLineToRelative(0.5f);
        b.horizontalLineTo(19.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        b.curveToRelative(0.0f, 0.99f, -0.48f, 1.85f, -1.21f, 2.4f);
        b.lineToRelative(1.41f, 1.41f);
        b.curveToRelative(1.09f, -0.92f, 1.8f, -2.27f, 1.8f, -3.81f);
        b.close();
        b.moveTo(3.71f, 4.56f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(2.06f, 2.06f);
        b.horizontalLineToRelative(-0.42f);
        b.curveToRelative(-3.28f, 0.35f, -5.76f, 3.34f, -5.29f, 6.79f);
        b.curveTo(0.46f, 17.84f, 3.19f, 20.0f, 6.22f, 20.0f);
        b.horizontalLineToRelative(11.51f);
        b.lineToRelative(1.29f, 1.29f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(5.12f, 4.56f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.close();
        b.moveTo(6.0f, 18.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b.reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(b, 1.73f, 8.0f, 8.0f, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudOff = build;
        build.getClass();
        return build;
    }
}
