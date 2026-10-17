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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanToolKt {
    private static ImageVector _panTool;

    public static final ImageVector getPanTool(Icons.Rounded rounded) {
        ImageVector imageVector = _panTool;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PanTool", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.5f, 4.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        b.verticalLineToRelative(5.0f);
        b.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        b.verticalLineToRelative(-8.0f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveTo(16.0f, 1.67f, 16.0f, 2.5f);
        b.verticalLineToRelative(8.0f);
        b.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        b.verticalLineToRelative(-9.0f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveTo(12.0f, 0.67f, 12.0f, 1.5f);
        b.verticalLineToRelative(8.99f);
        b.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        b.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        b.verticalLineTo(4.5f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveTo(8.0f, 3.67f, 8.0f, 4.5f);
        b.verticalLineToRelative(11.41f);
        b.lineToRelative(-4.12f, -2.35f);
        b.curveToRelative(-0.58f, -0.33f, -1.3f, -0.24f, -1.78f, 0.22f);
        b.curveToRelative(-0.6f, 0.58f, -0.62f, 1.54f, -0.03f, 2.13f);
        b.lineToRelative(6.78f, 6.89f);
        b.curveToRelative(0.75f, 0.77f, 1.77f, 1.2f, 2.85f, 1.2f);
        b.horizontalLineTo(19.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.verticalLineTo(5.5f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panTool = build;
        build.getClass();
        return build;
    }
}
