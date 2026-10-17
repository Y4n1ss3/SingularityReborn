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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElectricMeterKt {
    private static ImageVector _electricMeter;

    public static final ImageVector getElectricMeter(Icons.Rounded rounded) {
        ImageVector imageVector = _electricMeter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ElectricMeter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.73f, 2.0f);
        b.curveTo(7.05f, 2.14f, 3.15f, 6.03f, 3.0f, 10.71f);
        b.curveToRelative(-0.13f, 4.04f, 2.42f, 7.5f, 6.0f, 8.77f);
        b.verticalLineTo(21.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.06f);
        b.curveToRelative(0.33f, 0.04f, 0.66f, 0.06f, 1.0f, 0.06f);
        b.reflectiveCurveToRelative(0.67f, -0.02f, 1.0f, -0.06f);
        b.verticalLineTo(21.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.53f);
        b.curveToRelative(3.49f, -1.24f, 6.0f, -4.57f, 6.0f, -8.47f);
        b.curveTo(21.0f, 5.95f, 16.82f, 1.85f, 11.73f, 2.0f);
        k4.r(b, 13.54f, 14.71f, 12.0f, 16.25f);
        b.curveToRelative(-0.41f, 0.41f, -1.09f, 0.41f, -1.5f, 0.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.41f, -0.41f, -0.41f, -1.09f, 0.0f, -1.5f);
        b.lineToRelative(0.5f, -0.5f);
        b.lineToRelative(-0.54f, -0.54f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(12.0f, 10.75f);
        b.curveToRelative(0.41f, -0.41f, 1.09f, -0.41f, 1.5f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.41f, 0.41f, 0.41f, 1.09f, 0.0f, 1.5f);
        b.lineToRelative(-0.5f, 0.5f);
        b.lineToRelative(0.54f, 0.54f);
        b.curveTo(13.93f, 13.68f, 13.93f, 14.32f, 13.54f, 14.71f);
        r6.g(b, 15.0f, 9.0f, 9.0f);
        b.curveTo(8.45f, 9.0f, 8.0f, 8.55f, 8.0f, 8.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(0.0f);
        b.curveTo(16.0f, 8.55f, 15.55f, 9.0f, 15.0f, 9.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricMeter = build;
        build.getClass();
        return build;
    }
}
