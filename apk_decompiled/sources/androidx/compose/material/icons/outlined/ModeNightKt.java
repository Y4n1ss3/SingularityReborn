package androidx.compose.material.icons.outlined;

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
public final class ModeNightKt {
    private static ImageVector _modeNight;

    public static final ImageVector getModeNight(Icons.Outlined outlined) {
        ImageVector imageVector = _modeNight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ModeNight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.5f, 4.0f);
        b.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        b.curveToRelative(-0.34f, 0.0f, -0.68f, -0.02f, -1.01f, -0.07f);
        b.curveToRelative(1.91f, -2.16f, 3.01f, -4.98f, 3.01f, -7.93f);
        b.reflectiveCurveToRelative(-1.1f, -5.77f, -3.01f, -7.93f);
        b.curveTo(8.82f, 4.02f, 9.16f, 4.0f, 9.5f, 4.0f);
        b.moveTo(9.5f, 2.0f);
        b.curveToRelative(-1.82f, 0.0f, -3.53f, 0.5f, -5.0f, 1.35f);
        b.curveToRelative(2.99f, 1.73f, 5.0f, 4.95f, 5.0f, 8.65f);
        b.reflectiveCurveToRelative(-2.01f, 6.92f, -5.0f, 8.65f);
        b.curveTo(5.97f, 21.5f, 7.68f, 22.0f, 9.5f, 22.0f);
        b.curveToRelative(5.52f, 0.0f, 10.0f, -4.48f, 10.0f, -10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 15.02f, 2.0f, 9.5f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _modeNight = build;
        build.getClass();
        return build;
    }
}
