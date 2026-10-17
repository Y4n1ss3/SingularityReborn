package androidx.compose.material.icons.twotone;

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
public final class PanToolKt {
    private static ImageVector _panTool;

    public static final ImageVector getPanTool(Icons.TwoTone twoTone) {
        ImageVector imageVector = _panTool;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PanTool", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.5f, 5.65f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        uf.z(b, 12.0f, -2.0f, 3.42f);
        b.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        uf.z(b, 12.0f, -2.0f, 2.51f);
        b.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f);
        uf.z(b, 12.0f, -2.0f, 4.79f);
        b.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(-0.5f, 0.23f, -0.5f, 0.5f);
        b.verticalLineToRelative(12.87f);
        b.lineToRelative(-5.35f, -2.83f);
        b.lineToRelative(-0.51f, 0.45f);
        b.lineToRelative(5.86f, 6.1f);
        b.curveToRelative(0.38f, 0.39f, 0.9f, 0.62f, 1.44f, 0.62f);
        b.horizontalLineTo(18.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineTo(6.15f);
        b.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(19.5f, 3.65f);
        b2.curveToRelative(-0.17f, 0.0f, -0.34f, 0.02f, -0.5f, 0.05f);
        b2.verticalLineToRelative(-0.28f);
        b2.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        b2.curveToRelative(-0.33f, 0.0f, -0.65f, 0.06f, -0.94f, 0.18f);
        b2.curveTo(15.11f, 0.44f, 14.35f, 0.01f, 13.5f, 0.01f);
        b2.curveToRelative(-1.32f, 0.0f, -2.41f, 1.03f, -2.49f, 2.33f);
        b2.curveToRelative(-0.16f, -0.03f, -0.33f, -0.05f, -0.51f, -0.05f);
        b2.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        b2.verticalLineToRelative(9.55f);
        b2.lineToRelative(-2.41f, -1.28f);
        b2.curveToRelative(-0.73f, -0.39f, -1.64f, -0.28f, -2.26f, 0.27f);
        b2.lineToRelative(-2.07f, 1.83f);
        b2.lineToRelative(7.3f, 7.61f);
        b2.curveToRelative(0.75f, 0.78f, 1.8f, 1.23f, 2.89f, 1.23f);
        b2.horizontalLineTo(18.0f);
        b2.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b2.verticalLineTo(6.15f);
        b2.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        b2.close();
        b2.moveTo(20.0f, 20.0f);
        b2.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b2.horizontalLineToRelative(-6.55f);
        b2.curveToRelative(-0.54f, 0.0f, -1.07f, -0.22f, -1.44f, -0.62f);
        b2.lineToRelative(-5.86f, -6.11f);
        b2.lineToRelative(0.51f, -0.45f);
        b2.lineTo(10.0f, 17.66f);
        b2.verticalLineTo(4.79f);
        b2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b2.reflectiveCurveToRelative(0.5f, 0.23f, 0.5f, 0.5f);
        uf.z(b2, 12.0f, 2.0f, 2.51f);
        b2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b2.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        uf.z(b2, 12.0f, 2.0f, 3.42f);
        b2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b2.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        uf.z(b2, 12.0f, 2.0f, 6.15f);
        b2.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        b2.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b2, 20.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panTool = build;
        build.getClass();
        return build;
    }
}
