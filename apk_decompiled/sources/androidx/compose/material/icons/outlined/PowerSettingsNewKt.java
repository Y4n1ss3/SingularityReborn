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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PowerSettingsNewKt {
    private static ImageVector _powerSettingsNew;

    public static final ImageVector getPowerSettingsNew(Icons.Outlined outlined) {
        ImageVector imageVector = _powerSettingsNew;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PowerSettingsNew", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(13.0f, 3.0f, -2.0f, 10.0f, 2.0f);
        uo.l(n, 13.0f, 3.0f, 17.83f, 5.17f);
        n.lineToRelative(-1.42f, 1.42f);
        n.curveTo(17.99f, 7.86f, 19.0f, 9.81f, 19.0f, 12.0f);
        n.curveToRelative(0.0f, 3.87f, -3.13f, 7.0f, -7.0f, 7.0f);
        n.reflectiveCurveToRelative(-7.0f, -3.13f, -7.0f, -7.0f);
        n.curveToRelative(0.0f, -2.19f, 1.01f, -4.14f, 2.58f, -5.42f);
        n.lineTo(6.17f, 5.17f);
        n.curveTo(4.23f, 6.82f, 3.0f, 9.26f, 3.0f, 12.0f);
        n.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        n.reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f);
        n.curveToRelative(0.0f, -2.74f, -1.23f, -5.18f, -3.17f, -6.83f);
        n.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _powerSettingsNew = build;
        build.getClass();
        return build;
    }
}
