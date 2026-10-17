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
public final class FormatUnderlinedKt {
    private static ImageVector _formatUnderlined;

    public static final ImageVector getFormatUnderlined(Icons.Rounded rounded) {
        ImageVector imageVector = _formatUnderlined;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FormatUnderlined", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.79f, 16.95f);
        b.curveToRelative(3.03f, -0.39f, 5.21f, -3.11f, 5.21f, -6.16f);
        b.verticalLineTo(4.25f);
        b.curveTo(18.0f, 3.56f, 17.44f, 3.0f, 16.75f, 3.0f);
        b.reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f);
        b.verticalLineToRelative(6.65f);
        b.curveToRelative(0.0f, 1.67f, -1.13f, 3.19f, -2.77f, 3.52f);
        b.curveToRelative(-2.25f, 0.47f, -4.23f, -1.25f, -4.23f, -3.42f);
        b.verticalLineTo(4.25f);
        b.curveTo(8.5f, 3.56f, 7.94f, 3.0f, 7.25f, 3.0f);
        b.reflectiveCurveTo(6.0f, 3.56f, 6.0f, 4.25f);
        b.verticalLineTo(11.0f);
        b.curveToRelative(0.0f, 3.57f, 3.13f, 6.42f, 6.79f, 5.95f);
        b.close();
        b.moveTo(5.0f, 20.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatUnderlined = build;
        build.getClass();
        return build;
    }
}
