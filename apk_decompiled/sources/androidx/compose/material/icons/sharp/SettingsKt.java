package androidx.compose.material.icons.sharp;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsKt {
    private static ImageVector _settings;

    public static final ImageVector getSettings(Icons.Sharp sharp) {
        ImageVector imageVector = _settings;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Settings", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.44f, 12.99f, -0.01f, 0.02f);
        e.curveToRelative(0.04f, -0.33f, 0.08f, -0.67f, 0.08f, -1.01f);
        e.curveToRelative(0.0f, -0.34f, -0.03f, -0.66f, -0.07f, -0.99f);
        e.lineToRelative(0.01f, 0.02f);
        e.lineToRelative(2.44f, -1.92f);
        e.lineToRelative(-2.43f, -4.22f);
        e.lineToRelative(-2.87f, 1.16f);
        e.lineToRelative(0.01f, 0.01f);
        e.curveToRelative(-0.52f, -0.4f, -1.09f, -0.74f, -1.71f, -1.0f);
        kf0.A(e, 0.01f, 14.44f, 2.0f, 9.57f);
        e.lineToRelative(-0.44f, 3.07f);
        e.horizontalLineToRelative(0.01f);
        e.curveToRelative(-0.62f, 0.26f, -1.19f, 0.6f, -1.71f, 1.0f);
        e.lineToRelative(0.01f, -0.01f);
        e.lineToRelative(-2.88f, -1.17f);
        e.lineToRelative(-2.44f, 4.22f);
        e.lineToRelative(2.44f, 1.92f);
        e.lineToRelative(0.01f, -0.02f);
        e.curveToRelative(-0.04f, 0.33f, -0.07f, 0.65f, -0.07f, 0.99f);
        e.curveToRelative(0.0f, 0.34f, 0.03f, 0.68f, 0.08f, 1.01f);
        e.lineToRelative(-0.01f, -0.02f);
        e.lineToRelative(-2.1f, 1.65f);
        e.lineToRelative(-0.33f, 0.26f);
        e.lineToRelative(2.43f, 4.2f);
        e.lineToRelative(2.88f, -1.15f);
        e.lineToRelative(-0.02f, -0.04f);
        e.curveToRelative(0.53f, 0.41f, 1.1f, 0.75f, 1.73f, 1.01f);
        uo.n(e, -0.03f, 9.58f, 22.0f, 4.85f);
        e.reflectiveCurveToRelative(0.03f, -0.18f, 0.06f, -0.42f);
        e.lineToRelative(0.38f, -2.65f);
        e.horizontalLineToRelative(-0.01f);
        e.curveToRelative(0.62f, -0.26f, 1.2f, -0.6f, 1.73f, -1.01f);
        e.lineToRelative(-0.02f, 0.04f);
        e.lineToRelative(2.88f, 1.15f);
        e.lineToRelative(2.43f, -4.2f);
        e.reflectiveCurveToRelative(-0.14f, -0.12f, -0.33f, -0.26f);
        fc.B(e, -2.11f, -1.66f, 12.0f, 15.5f);
        e.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        e.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        e.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(e, -1.57f, 3.5f, -3.5f, 3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settings = build;
        build.getClass();
        return build;
    }
}
