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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CropRotateKt {
    private static ImageVector _cropRotate;

    public static final ImageVector getCropRotate(Icons.Rounded rounded) {
        ImageVector imageVector = _cropRotate;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CropRotate", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(16.0f, 9.0f, 5.0f, 2.0f);
        m.lineTo(18.0f, 8.0f);
        m.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        kf0.x(m, -6.0f, 2.0f, 5.0f);
        m.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        k4.r(m, 19.0f, 16.0f, 9.0f, 16.0f);
        m.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        m.lineTo(8.0f, 5.0f);
        m.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        m.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        m.verticalLineToRelative(1.0f);
        m.lineTo(5.0f, 6.0f);
        m.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        m.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        m.horizontalLineToRelative(1.0f);
        m.verticalLineToRelative(8.0f);
        m.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        m.horizontalLineToRelative(8.0f);
        m.verticalLineToRelative(1.0f);
        m.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        m.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        m.verticalLineToRelative(-1.0f);
        m.horizontalLineToRelative(1.0f);
        m.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        m.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        m.close();
        m.moveTo(17.66f, 1.4f);
        m.curveTo(15.99f, 0.51f, 13.83f, -0.11f, 11.39f, 0.04f);
        m.lineToRelative(3.81f, 3.81f);
        m.lineToRelative(1.33f, -1.33f);
        m.curveToRelative(3.09f, 1.46f, 5.34f, 4.37f, 5.89f, 7.86f);
        m.curveToRelative(0.06f, 0.41f, 0.44f, 0.69f, 0.86f, 0.62f);
        m.curveToRelative(0.41f, -0.06f, 0.69f, -0.45f, 0.62f, -0.86f);
        m.curveToRelative(-0.6f, -3.8f, -2.96f, -7.0f, -6.24f, -8.74f);
        m.close();
        m.moveTo(7.47f, 21.49f);
        m.curveToRelative(-3.09f, -1.46f, -5.34f, -4.37f, -5.89f, -7.86f);
        m.curveToRelative(-0.06f, -0.41f, -0.44f, -0.69f, -0.86f, -0.62f);
        m.curveToRelative(-0.41f, 0.06f, -0.69f, 0.45f, -0.62f, 0.86f);
        m.curveToRelative(0.6f, 3.81f, 2.96f, 7.01f, 6.24f, 8.75f);
        m.curveToRelative(1.67f, 0.89f, 3.83f, 1.51f, 6.27f, 1.36f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(m, 8.8f, 20.16f, -1.33f, 1.33f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cropRotate = build;
        build.getClass();
        return build;
    }
}
