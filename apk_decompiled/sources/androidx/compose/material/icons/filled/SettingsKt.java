package androidx.compose.material.icons.filled;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsKt {
    private static ImageVector _settings;

    public static final ImageVector getSettings(Icons.Filled filled) {
        ImageVector imageVector = _settings;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Settings", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.14f, 12.94f);
        b.curveToRelative(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        b.curveToRelative(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        b.lineToRelative(2.03f, -1.58f);
        b.curveToRelative(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        b.lineToRelative(-1.92f, -3.32f);
        b.curveToRelative(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        b.lineToRelative(-2.39f, 0.96f);
        b.curveToRelative(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        b.lineTo(14.4f, 2.81f);
        b.curveToRelative(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        b.horizontalLineToRelative(-3.84f);
        b.curveToRelative(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
        b.lineTo(9.25f, 5.35f);
        b.curveTo(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        b.lineTo(5.24f, 5.33f);
        b.curveToRelative(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
        b.lineTo(2.74f, 8.87f);
        b.curveTo(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        b.lineToRelative(2.03f, 1.58f);
        b.curveTo(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        b.reflectiveCurveToRelative(0.02f, 0.64f, 0.07f, 0.94f);
        b.lineToRelative(-2.03f, 1.58f);
        b.curveToRelative(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        b.lineToRelative(1.92f, 3.32f);
        b.curveToRelative(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        b.lineToRelative(2.39f, -0.96f);
        b.curveToRelative(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        b.lineToRelative(0.36f, 2.54f);
        b.curveToRelative(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        b.horizontalLineToRelative(3.84f);
        b.curveToRelative(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
        b.lineToRelative(0.36f, -2.54f);
        b.curveToRelative(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        b.lineToRelative(2.39f, 0.96f);
        b.curveToRelative(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
        b.lineToRelative(1.92f, -3.32f);
        b.curveToRelative(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        uo.l(b, 19.14f, 12.94f, 12.0f, 15.6f);
        b.curveToRelative(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
        b.reflectiveCurveToRelative(1.62f, -3.6f, 3.6f, -3.6f);
        b.reflectiveCurveToRelative(3.6f, 1.62f, 3.6f, 3.6f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 13.98f, 15.6f, 12.0f, 15.6f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settings = build;
        build.getClass();
        return build;
    }
}
