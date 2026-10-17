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
public final class ScaleKt {
    private static ImageVector _scale;

    public static final ImageVector getScale(Icons.Rounded rounded) {
        ImageVector imageVector = _scale;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Scale", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 21.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.lineToRelative(3.43f, 0.0f);
        b.curveToRelative(0.87f, 0.0f, 1.58f, -0.75f, 1.5f, -1.62f);
        b.curveTo(21.34f, 14.18f, 17.4f, 11.68f, 14.0f, 11.0f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(3.31f, -0.42f, 6.03f, -1.86f, 7.27f, -3.73f);
        b.curveTo(21.92f, 3.3f, 21.15f, 2.0f, 19.98f, 2.0f);
        b.horizontalLineTo(4.02f);
        b.curveTo(2.85f, 2.0f, 2.08f, 3.3f, 2.73f, 4.27f);
        b.curveTo(3.97f, 6.14f, 6.69f, 7.58f, 10.0f, 8.0f);
        b.lineToRelative(0.0f, 3.0f);
        b.curveToRelative(-3.4f, 0.68f, -7.34f, 3.18f, -7.93f, 9.38f);
        b.curveTo(1.99f, 21.25f, 2.7f, 22.0f, 3.57f, 22.0f);
        b.lineTo(7.0f, 22.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(4.13f);
        b.curveToRelative(0.93f, -6.83f, 6.65f, -7.2f, 7.87f, -7.2f);
        b.reflectiveCurveToRelative(6.94f, 0.37f, 7.87f, 7.2f);
        b.horizontalLineTo(17.0f);
        b.curveTo(16.45f, 20.0f, 16.0f, 20.45f, 16.0f, 21.0f);
        b.close();
        b.moveTo(11.5f, 21.94f);
        b.curveToRelative(-0.7f, -0.17f, -1.27f, -0.74f, -1.44f, -1.44f);
        b.curveToRelative(-0.18f, -0.74f, 0.06f, -1.44f, 0.53f, -1.91f);
        b.curveToRelative(0.55f, -0.55f, 2.91f, -1.57f, 4.33f, -2.15f);
        b.curveToRelative(0.41f, -0.17f, 0.82f, 0.24f, 0.65f, 0.65f);
        b.curveToRelative(-0.58f, 1.42f, -1.6f, 3.78f, -2.15f, 4.33f);
        b.curveTo(12.95f, 21.88f, 12.25f, 22.12f, 11.5f, 21.94f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scale = build;
        build.getClass();
        return build;
    }
}
