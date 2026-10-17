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
public final class NordicWalkingKt {
    private static ImageVector _nordicWalking;

    public static final ImageVector getNordicWalking(Icons.Rounded rounded) {
        ImageVector imageVector = _nordicWalking;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NordicWalking", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.25f, 23.0f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        r6.v(b, 14.0f, 19.0f, 8.25f);
        b.curveTo(19.0f, 22.66f, 18.66f, 23.0f, 18.25f, 23.0f);
        b.close();
        b.moveTo(4.93f, 23.0f);
        b.curveToRelative(0.35f, 0.0f, 0.66f, -0.24f, 0.73f, -0.59f);
        b.lineTo(7.53f, 14.0f);
        b.horizontalLineTo(6.0f);
        b.lineToRelative(-1.8f, 8.09f);
        b.curveTo(4.1f, 22.56f, 4.45f, 23.0f, 4.93f, 23.0f);
        b.close();
        b.moveTo(13.5f, 5.5f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f);
        b.close();
        b.moveTo(14.0f, 23.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-5.64f);
        b.curveToRelative(0.0f, -0.55f, -0.22f, -1.07f, -0.62f, -1.45f);
        b.lineTo(12.9f, 13.5f);
        b.lineToRelative(0.6f, -3.0f);
        b.curveToRelative(1.07f, 1.24f, 2.62f, 2.13f, 4.36f, 2.41f);
        b.curveToRelative(0.6f, 0.1f, 1.14f, -0.38f, 1.14f, -0.99f);
        b.curveToRelative(0.0f, -0.49f, -0.35f, -0.91f, -0.83f, -0.98f);
        b.curveToRelative(-1.53f, -0.24f, -2.79f, -1.14f, -3.47f, -2.33f);
        b.lineToRelative(-1.0f, -1.6f);
        b.curveToRelative(-0.56f, -0.89f, -1.68f, -1.25f, -2.66f, -0.84f);
        b.lineTo(7.22f, 7.78f);
        b.curveTo(6.48f, 8.1f, 6.0f, 8.82f, 6.0f, 9.62f);
        b.verticalLineTo(12.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(9.6f);
        b.lineToRelative(1.8f, -0.7f);
        b.lineTo(7.25f, 21.76f);
        b.curveTo(7.12f, 22.4f, 7.61f, 23.0f, 8.27f, 23.0f);
        b.curveToRelative(0.49f, 0.0f, 0.91f, -0.34f, 1.02f, -0.81f);
        b.lineTo(10.9f, 15.0f);
        b.lineToRelative(2.1f, 2.0f);
        b.verticalLineToRelative(5.0f);
        b.curveTo(13.0f, 22.55f, 13.45f, 23.0f, 14.0f, 23.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nordicWalking = build;
        build.getClass();
        return build;
    }
}
