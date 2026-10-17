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
import defpackage.af0;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SettingsSystemDaydreamKt {
    private static ImageVector _settingsSystemDaydream;

    public static final ImageVector getSettingsSystemDaydream(Icons.Outlined outlined) {
        ImageVector imageVector = _settingsSystemDaydream;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SettingsSystemDaydream", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.5f, 17.0f, 9.0f, 17.0f);
        i.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        i.curveToRelative(0.0f, -1.93f, 1.36f, -3.56f, 3.22f, -3.92f);
        i.curveTo(9.04f, 7.8f, 10.47f, 7.0f, 12.0f, 7.0f);
        i.curveToRelative(1.95f, 0.0f, 3.66f, 1.28f, 4.26f, 3.09f);
        i.curveToRelative(1.58f, 0.36f, 2.74f, 1.75f, 2.74f, 3.41f);
        i.curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f);
        i.close();
        i.moveTo(8.74f, 11.02f);
        i.curveTo(7.74f, 11.15f, 7.0f, 11.99f, 7.0f, 13.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(6.5f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        i.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        i.horizontalLineToRelative(-0.87f);
        i.lineToRelative(-0.17f, -0.86f);
        i.curveTo(14.29f, 9.92f, 13.23f, 9.0f, 12.0f, 9.0f);
        i.curveToRelative(-0.96f, 0.0f, -1.84f, 0.57f, -2.26f, 1.45f);
        uf.r(i, -0.27f, 0.57f, -0.73f);
        i.moveTo(21.0f, 3.0f);
        i.lineTo(3.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(18.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(23.0f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 21.0f, 19.01f, 3.0f, 19.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(i, 3.0f, 4.99f, 18.0f, 14.02f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settingsSystemDaydream = build;
        build.getClass();
        return build;
    }
}
