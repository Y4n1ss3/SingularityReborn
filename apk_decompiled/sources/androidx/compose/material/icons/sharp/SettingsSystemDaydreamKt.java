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
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsSystemDaydreamKt {
    private static ImageVector _settingsSystemDaydream;

    public static final ImageVector getSettingsSystemDaydream(Icons.Sharp sharp) {
        ImageVector imageVector = _settingsSystemDaydream;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SettingsSystemDaydream", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(9.0f, 16.0f, 6.5f);
        a.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        a.reflectiveCurveTo(16.88f, 11.0f, 15.5f, 11.0f);
        a.horizontalLineToRelative(-0.05f);
        a.curveToRelative(-0.24f, -1.69f, -1.69f, -3.0f, -3.45f, -3.0f);
        a.curveToRelative(-1.4f, 0.0f, -2.6f, 0.83f, -3.16f, 2.02f);
        a.horizontalLineToRelative(-0.16f);
        a.curveTo(7.17f, 10.18f, 6.0f, 11.45f, 6.0f, 13.0f);
        a.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        k4.r(a, 23.0f, 3.0f, 1.0f, 3.0f);
        uo.D(a, 18.0f, 22.0f, 23.0f, 3.0f);
        a.moveTo(21.0f, 19.01f);
        a.lineTo(3.0f, 19.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(a, 3.0f, 4.99f, 18.0f, 14.02f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsSystemDaydream = build;
        build.getClass();
        return build;
    }
}
