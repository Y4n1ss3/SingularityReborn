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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsApplicationsKt {
    private static ImageVector _settingsApplications;

    public static final ImageVector getSettingsApplications(Icons.Rounded rounded) {
        ImageVector imageVector = _settingsApplications;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SettingsApplications", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 12.0f, -2.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f);
        d.close();
        d.moveTo(15.75f, 12.0f);
        d.curveToRelative(0.0f, 0.22f, -0.03f, 0.42f, -0.06f, 0.63f);
        d.lineToRelative(0.84f, 0.73f);
        d.curveToRelative(0.18f, 0.16f, 0.22f, 0.42f, 0.1f, 0.63f);
        d.lineToRelative(-0.59f, 1.02f);
        d.curveToRelative(-0.12f, 0.21f, -0.37f, 0.3f, -0.59f, 0.22f);
        d.lineToRelative(-1.06f, -0.36f);
        d.curveToRelative(-0.32f, 0.27f, -0.68f, 0.48f, -1.08f, 0.63f);
        d.lineToRelative(-0.22f, 1.09f);
        d.curveToRelative(-0.05f, 0.23f, -0.25f, 0.4f, -0.49f, 0.4f);
        d.horizontalLineToRelative(-1.18f);
        d.curveToRelative(-0.24f, 0.0f, -0.44f, -0.17f, -0.49f, -0.4f);
        d.lineToRelative(-0.22f, -1.09f);
        d.curveToRelative(-0.4f, -0.15f, -0.76f, -0.36f, -1.08f, -0.63f);
        d.lineToRelative(-1.06f, 0.36f);
        d.curveToRelative(-0.23f, 0.08f, -0.47f, -0.02f, -0.59f, -0.22f);
        d.lineToRelative(-0.59f, -1.02f);
        d.curveToRelative(-0.12f, -0.21f, -0.08f, -0.47f, 0.1f, -0.63f);
        d.lineToRelative(0.84f, -0.73f);
        d.curveTo(8.28f, 12.42f, 8.25f, 12.22f, 8.25f, 12.0f);
        d.reflectiveCurveToRelative(0.03f, -0.42f, 0.06f, -0.63f);
        d.lineToRelative(-0.84f, -0.73f);
        d.curveToRelative(-0.18f, -0.16f, -0.22f, -0.42f, -0.1f, -0.63f);
        d.lineToRelative(0.59f, -1.02f);
        d.curveToRelative(0.12f, -0.21f, 0.37f, -0.3f, 0.59f, -0.22f);
        d.lineToRelative(1.06f, 0.36f);
        d.curveToRelative(0.32f, -0.27f, 0.68f, -0.48f, 1.08f, -0.63f);
        d.lineToRelative(0.22f, -1.09f);
        d.curveTo(10.97f, 7.17f, 11.17f, 7.0f, 11.41f, 7.0f);
        d.horizontalLineToRelative(1.18f);
        d.curveToRelative(0.24f, 0.0f, 0.44f, 0.17f, 0.49f, 0.4f);
        d.lineToRelative(0.22f, 1.09f);
        d.curveToRelative(0.4f, 0.15f, 0.76f, 0.36f, 1.08f, 0.63f);
        d.lineToRelative(1.06f, -0.36f);
        d.curveToRelative(0.23f, -0.08f, 0.47f, 0.02f, 0.59f, 0.22f);
        d.lineToRelative(0.59f, 1.02f);
        d.curveToRelative(0.12f, 0.21f, 0.08f, 0.47f, -0.1f, 0.63f);
        d.lineToRelative(-0.84f, 0.73f);
        d.curveTo(15.72f, 11.58f, 15.75f, 11.78f, 15.75f, 12.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsApplications = build;
        build.getClass();
        return build;
    }
}
