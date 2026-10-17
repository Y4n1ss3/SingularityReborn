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
public final class SettingsInputAntennaKt {
    private static ImageVector _settingsInputAntenna;

    public static final ImageVector getSettingsInputAntenna(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsInputAntenna;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsInputAntenna", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 5.0f);
        b.curveToRelative(-3.48f, 0.0f, -6.37f, 2.54f, -6.91f, 5.87f);
        b.curveToRelative(-0.1f, 0.59f, 0.39f, 1.13f, 1.0f, 1.13f);
        b.curveToRelative(0.49f, 0.0f, 0.9f, -0.36f, 0.98f, -0.85f);
        b.curveTo(7.48f, 8.79f, 9.53f, 7.0f, 12.0f, 7.0f);
        b.reflectiveCurveToRelative(4.52f, 1.79f, 4.93f, 4.15f);
        b.curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f);
        b.curveToRelative(0.61f, 0.0f, 1.09f, -0.54f, 0.99f, -1.13f);
        b.curveTo(18.37f, 7.54f, 15.48f, 5.0f, 12.0f, 5.0f);
        b.close();
        b.moveTo(13.0f, 14.29f);
        b.curveToRelative(1.07f, -0.48f, 1.76f, -1.66f, 1.41f, -2.99f);
        b.curveToRelative(-0.22f, -0.81f, -0.87f, -1.47f, -1.68f, -1.7f);
        b.curveTo(11.04f, 9.12f, 9.5f, 10.38f, 9.5f, 12.0f);
        b.curveToRelative(0.0f, 1.02f, 0.62f, 1.9f, 1.5f, 2.29f);
        b.verticalLineToRelative(3.3f);
        b.lineToRelative(-2.71f, 2.7f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(2.3f, -2.3f);
        b.lineToRelative(2.3f, 2.3f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        uf.o(b, 13.0f, 17.59f, 14.29f);
        b.moveTo(12.0f, 1.0f);
        b.curveTo(6.3f, 1.0f, 1.61f, 5.34f, 1.05f, 10.9f);
        b.curveTo(1.0f, 11.49f, 1.46f, 12.0f, 2.05f, 12.0f);
        b.curveToRelative(0.51f, 0.0f, 0.94f, -0.38f, 0.99f, -0.88f);
        b.curveTo(3.48f, 6.56f, 7.33f, 3.0f, 12.0f, 3.0f);
        b.reflectiveCurveToRelative(8.52f, 3.56f, 8.96f, 8.12f);
        b.curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f);
        b.curveToRelative(0.59f, 0.0f, 1.06f, -0.51f, 1.0f, -1.1f);
        b.curveTo(22.39f, 5.34f, 17.7f, 1.0f, 12.0f, 1.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsInputAntenna = build;
        build.getClass();
        return build;
    }
}
