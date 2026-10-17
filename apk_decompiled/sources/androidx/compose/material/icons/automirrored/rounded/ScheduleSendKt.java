package androidx.compose.material.icons.automirrored.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScheduleSendKt {
    private static ImageVector _scheduleSend;

    public static final ImageVector getScheduleSend(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _scheduleSend;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.ScheduleSend", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 10.0f);
        b.curveToRelative(0.1f, 0.0f, 0.19f, 0.01f, 0.28f, 0.01f);
        b.lineTo(4.39f, 4.58f);
        b.curveTo(3.73f, 4.31f, 3.0f, 4.79f, 3.0f, 5.51f);
        b.verticalLineToRelative(3.71f);
        b.curveToRelative(0.0f, 0.46f, 0.31f, 0.86f, 0.76f, 0.97f);
        b.lineTo(11.0f, 12.0f);
        b.lineToRelative(-7.24f, 1.81f);
        b.curveTo(3.31f, 13.92f, 3.0f, 14.32f, 3.0f, 14.78f);
        b.verticalLineToRelative(3.71f);
        b.curveToRelative(0.0f, 0.72f, 0.73f, 1.2f, 1.39f, 0.92f);
        b.lineTo(10.0f, 17.05f);
        b.curveToRelative(0.0f, -0.02f, 0.0f, -0.03f, 0.0f, -0.05f);
        b.curveTo(10.0f, 13.14f, 13.14f, 10.0f, 17.0f, 10.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(17.0f, 12.0f);
        b2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        b2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        b2.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        b2.reflectiveCurveTo(19.76f, 12.0f, 17.0f, 12.0f);
        k4.x(b2, 18.29f, 19.0f, -1.65f, -1.65f);
        b2.curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f);
        b2.verticalLineToRelative(-2.5f);
        b2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b2.horizontalLineToRelative(0.0f);
        b2.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        b2.verticalLineToRelative(2.29f);
        b2.lineToRelative(1.5f, 1.5f);
        b2.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        b2.lineToRelative(0.0f, 0.0f);
        b2.curveTo(18.8f, 19.2f, 18.49f, 19.2f, 18.29f, 19.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scheduleSend = build;
        build.getClass();
        return build;
    }
}
