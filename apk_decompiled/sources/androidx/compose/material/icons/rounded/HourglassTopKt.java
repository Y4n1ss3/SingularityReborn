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
import defpackage.af0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HourglassTopKt {
    private static ImageVector _hourglassTop;

    public static final ImageVector getHourglassTop(Icons.Rounded rounded) {
        ImageVector imageVector = _hourglassTop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HourglassTop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.0f, 2.0f);
        b.curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f);
        b.lineToRelative(0.01f, 3.18f);
        b.curveToRelative(0.0f, 0.53f, 0.21f, 1.03f, 0.58f, 1.41f);
        b.lineTo(10.0f, 12.0f);
        b.lineToRelative(-3.41f, 3.43f);
        b.curveToRelative(-0.37f, 0.37f, -0.58f, 0.88f, -0.58f, 1.41f);
        b.lineTo(6.0f, 20.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(8.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-3.16f);
        b.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.58f, -1.41f);
        b.lineTo(14.0f, 12.0f);
        b.lineToRelative(3.41f, -3.4f);
        b.curveTo(17.79f, 8.22f, 18.0f, 7.71f, 18.0f, 7.18f);
        b.verticalLineTo(4.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.x(b, 8.0f, 16.0f, 16.91f, 19.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineTo(9.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-2.09f);
        b.curveToRelative(0.0f, -0.27f, 0.11f, -0.52f, 0.29f, -0.71f);
        b.lineTo(12.0f, 12.5f);
        b.lineToRelative(3.71f, 3.71f);
        b.curveTo(15.89f, 16.39f, 16.0f, 16.65f, 16.0f, 16.91f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hourglassTop = build;
        build.getClass();
        return build;
    }
}
