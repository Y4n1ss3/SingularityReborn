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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsKt {
    private static ImageVector _settings;

    public static final ImageVector getSettings(Icons.Rounded rounded) {
        ImageVector imageVector = _settings;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Settings", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.5f, 12.0f);
        b.curveToRelative(0.0f, -0.23f, -0.01f, -0.45f, -0.03f, -0.68f);
        b.lineToRelative(1.86f, -1.41f);
        b.curveToRelative(0.4f, -0.3f, 0.51f, -0.86f, 0.26f, -1.3f);
        b.lineToRelative(-1.87f, -3.23f);
        b.curveToRelative(-0.25f, -0.44f, -0.79f, -0.62f, -1.25f, -0.42f);
        b.lineToRelative(-2.15f, 0.91f);
        b.curveToRelative(-0.37f, -0.26f, -0.76f, -0.49f, -1.17f, -0.68f);
        b.lineToRelative(-0.29f, -2.31f);
        b.curveTo(14.8f, 2.38f, 14.37f, 2.0f, 13.87f, 2.0f);
        b.horizontalLineToRelative(-3.73f);
        b.curveTo(9.63f, 2.0f, 9.2f, 2.38f, 9.14f, 2.88f);
        b.lineTo(8.85f, 5.19f);
        b.curveToRelative(-0.41f, 0.19f, -0.8f, 0.42f, -1.17f, 0.68f);
        b.lineTo(5.53f, 4.96f);
        b.curveToRelative(-0.46f, -0.2f, -1.0f, -0.02f, -1.25f, 0.42f);
        b.lineTo(2.41f, 8.62f);
        b.curveToRelative(-0.25f, 0.44f, -0.14f, 0.99f, 0.26f, 1.3f);
        b.lineToRelative(1.86f, 1.41f);
        b.curveTo(4.51f, 11.55f, 4.5f, 11.77f, 4.5f, 12.0f);
        b.reflectiveCurveToRelative(0.01f, 0.45f, 0.03f, 0.68f);
        b.lineToRelative(-1.86f, 1.41f);
        b.curveToRelative(-0.4f, 0.3f, -0.51f, 0.86f, -0.26f, 1.3f);
        b.lineToRelative(1.87f, 3.23f);
        b.curveToRelative(0.25f, 0.44f, 0.79f, 0.62f, 1.25f, 0.42f);
        b.lineToRelative(2.15f, -0.91f);
        b.curveToRelative(0.37f, 0.26f, 0.76f, 0.49f, 1.17f, 0.68f);
        b.lineToRelative(0.29f, 2.31f);
        b.curveTo(9.2f, 21.62f, 9.63f, 22.0f, 10.13f, 22.0f);
        b.horizontalLineToRelative(3.73f);
        b.curveToRelative(0.5f, 0.0f, 0.93f, -0.38f, 0.99f, -0.88f);
        b.lineToRelative(0.29f, -2.31f);
        b.curveToRelative(0.41f, -0.19f, 0.8f, -0.42f, 1.17f, -0.68f);
        b.lineToRelative(2.15f, 0.91f);
        b.curveToRelative(0.46f, 0.2f, 1.0f, 0.02f, 1.25f, -0.42f);
        b.lineToRelative(1.87f, -3.23f);
        b.curveToRelative(0.25f, -0.44f, 0.14f, -0.99f, -0.26f, -1.3f);
        b.lineToRelative(-1.86f, -1.41f);
        b.curveTo(19.49f, 12.45f, 19.5f, 12.23f, 19.5f, 12.0f);
        b.close();
        b.moveTo(12.04f, 15.5f);
        b.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        b.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        b.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 13.97f, 15.5f, 12.04f, 15.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settings = build;
        build.getClass();
        return build;
    }
}
